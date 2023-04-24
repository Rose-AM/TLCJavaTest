package io.turntabl;

import java.util.Objects;

public class Machine {
    private String hostname;
    private String requestorName;
    private Integer numberOfCpus;
    private Integer numberOfGbOfRam;
    private Integer sizeOfHardDisk;

    public Machine (String hostname, String requestorName, Integer numberOfCpus, Integer numberOfGbOfRam, Integer sizeOfHardDisk){
        this.hostname = hostname;
        this.requestorName =  requestorName;
        this.numberOfCpus = numberOfCpus;
        this.numberOfGbOfRam = numberOfGbOfRam;
        this.sizeOfHardDisk = sizeOfHardDisk;
    }

    public String getRequestorName() {
        return requestorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Machine machine = (Machine) o;
        return hostname.equals(machine.hostname) && requestorName.equals(machine.requestorName) && numberOfCpus.equals(machine.numberOfCpus) && numberOfGbOfRam.equals(machine.numberOfGbOfRam) && sizeOfHardDisk.equals(machine.sizeOfHardDisk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostname, requestorName, numberOfCpus, numberOfGbOfRam, sizeOfHardDisk);
    }
}
