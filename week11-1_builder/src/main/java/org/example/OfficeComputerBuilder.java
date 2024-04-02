package org.example;

public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public ComputerBuilder buildProcessor(String processor) {
        // Office computers might prioritize efficient processors
        computer.setProcessor(processor + " (Efficient)");
        return this;
    }

    @Override
    public ComputerBuilder buildRAM(int ramSize) {
        // Adequate RAM for multitasking, but not necessarily as high as gaming specs
        computer.setRamSize(ramSize >= 8 ? ramSize : 8); // Ensuring a minimum of 8GB
        return this;
    }

    @Override
    public ComputerBuilder buildHardDrive(String hardDrive) {
        // Office work might not require as much storage or might prefer speed over capacity
        computer.setHardDrive(hardDrive.contains("SSD") ? hardDrive : "512GB SSD"); // Defaulting to SSD for speed
        return this;
    }

    @Override
    public ComputerBuilder buildGraphicsCard(String graphicsCard) {
        // Integrated graphics might be sufficient for office tasks
        computer.setGraphicsCard("Integrated");
        return this;
    }

    @Override
    public ComputerBuilder buildOperatingSystem(String operatingSystem) {
        // Operating system choice might be based on corporate requirements
        computer.setOperatingSystem(operatingSystem);
        return this;
    }

    @Override
    public Computer build() {
        System.out.println("Office computer");
        return computer;
    }
}
