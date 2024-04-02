package org.example;

public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        computer = new Computer();
    }

    @Override
    public ComputerBuilder buildProcessor(String processor) {
        computer.setProcessor(processor);
        return this;
    }

    @Override
    public ComputerBuilder buildRAM(int ramSize) {
        computer.setRamSize(ramSize);
        return this;
    }

    @Override
    public ComputerBuilder buildHardDrive(String hardDrive) {
        computer.setHardDrive(hardDrive);
        return this;
    }

    @Override
    public ComputerBuilder buildGraphicsCard(String graphicsCard) {
        computer.setGraphicsCard(graphicsCard);
        return this;
    }

    @Override
    public ComputerBuilder buildOperatingSystem(String operatingSystem) {
        computer.setOperatingSystem(operatingSystem);
        return this;
    }

    @Override
    public Computer build() {
        System.out.println("Gaming computer");
        return computer;
    }
}

