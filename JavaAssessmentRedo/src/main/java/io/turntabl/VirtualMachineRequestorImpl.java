package io.turntabl;

import java.util.HashMap;
import java.util.Map;

public class VirtualMachineRequestorImpl implements VirtualMachineRequestor {

    //number of failed builds
    Integer failedBuilds = 0;

    //store/map <the user to, <the machine type to, the quantity>> (nested maps)
    //made it global to prevent it from being overridden anytime the createNewMachine() method is called
    Map<String, Map<String, Integer>> totalBuildsByUserForDay = new HashMap<>();

    AuthorisingService authorisingService;
    SystemBuildService systemBuildService;

    /*
    The constructor below assigns values to the objects of the 2 interfaces
    since it does not implement those interfaces
    hence cannot instantiate those objects
    ...
    those objects are -important- because they
    check whether user is entitled or not (True/False)
    are used to create the machine
     */
    public VirtualMachineRequestorImpl(AuthorisingService authorisingService, SystemBuildService systemBuildService){
        this.authorisingService = authorisingService;
        this.systemBuildService = systemBuildService;
    }

    //implementing the methods within it's interface (VMRequestor)
    @Override
    public void createNewRequest(Machine machine) throws UserNotEntitledException, MachineNotBuiltException {

        //get user/requestor name
        String username = machine.getRequestorName();

        //check user entitlement/authorisation using authorising service. If true, proceed. If false, throw exception
        if (authorisingService.isAuthorised(username)){
            //request the build service to attempt to build/create a new machine
            //returns the attempted machine's hostname(if successful) or empty string (if failed)
            String hostname = systemBuildService.createNewMachine(machine);

            //check if build request succeed/fail before making request to create VM (nb:will fail if hostname == empty string)
            if (hostname.equals("")){
                //count total number of failed builds
                failedBuilds = failedBuilds + 1;

                //throw exception
                throw new MachineNotBuiltException("Machine not created");
            }
            else {
                /* create an instance of a map collection to store a collection of
                    users, machine type, amd quantity (qty)
                 */

                //toString() gets the machine type
                String machineType = machine.toString();

                //Make the created map global

                //working for the inner map
                Map<String, Integer> innerMap = new HashMap<>();

                /* adding the quantity to the inner map when:
                   //a) machine type has already been used & has some quantity (then get initial qty of machine type, add 1, assign back)
                   //b) machine type has never been used & has no quantity (make qty 1)
                */

                //first check if the machine type has been used
                if (innerMap.containsKey(machineType)) {
                    //a)
                    Integer initialValue = innerMap.get(machineType);
                    Integer newValue = initialValue + 1;
                    //replace the initial value with newly added(incremented) value
                    innerMap.put(machineType,newValue);
                } else {
                    //b)
                    innerMap.put(machineType, 1);
                }
                //assign inner map to overall map
                totalBuildsByUserForDay.put(machine.getRequestorName() , innerMap);
            }

            }
        else {
            throw new UserNotEntitledException("User not entitled.");
        }
    }

    //Map of users
    @Override
    public Map<String, Map<String, Integer>> totalBuildsByUserForDay() {
        return totalBuildsByUserForDay;
    }

    //Total build requests
    @Override
    public int totalFailedBuildsForDay() {
        return failedBuilds;
    }
}
