package io.turntabl;

//extends means inherited from
public class Desktop extends Machine {
    private Integer msVersion;
    private String buildNumber;

    public Desktop(String hostname, String requestorName, Integer numberOfCpus, Integer numberOfGbOfRam, Integer sizeOfHardDisk, Integer msVersion, String buildNumber) {
        //get and change inherited attributes
        super(hostname, requestorName, numberOfCpus, numberOfGbOfRam, sizeOfHardDisk);
        //original attributes
        this.msVersion = msVersion;
        this.buildNumber = buildNumber;
    }

    @Override
    public String toString() {
        return "Desktop";
    }
}

