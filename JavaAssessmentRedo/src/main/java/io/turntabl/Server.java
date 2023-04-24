package io.turntabl;

public class Server extends Machine{
    private String distributionName;
    private Integer majorDistributionNumber;
    private Integer kernelVersion;
    private String adminTeam;

    public Server(String hostname, String requestorName, Integer numberOfCpus, Integer numberOfGbOfRam, Integer sizeOfHardDisk, String distributionName, Integer majorDistributionNumber, Integer kernelVersion, String adminTeam ) {
        super(hostname, requestorName, numberOfCpus, numberOfGbOfRam, sizeOfHardDisk);
        this.distributionName = distributionName;
        this.majorDistributionNumber = majorDistributionNumber;
        this.kernelVersion = kernelVersion;
        this.adminTeam = adminTeam;
    }

    @Override
    public String toString() {
        return "Server";
    }
}

