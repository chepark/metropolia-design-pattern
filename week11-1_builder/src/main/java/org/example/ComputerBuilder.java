package org.example;

public interface ComputerBuilder {
    ComputerBuilder buildProcessor(String processor);
    ComputerBuilder buildRAM(int ramSize);
    ComputerBuilder buildHardDrive(String hardDrive);
    ComputerBuilder buildGraphicsCard(String graphicsCard);
    ComputerBuilder buildOperatingSystem(String operatingSystem);
    Computer build();
}
