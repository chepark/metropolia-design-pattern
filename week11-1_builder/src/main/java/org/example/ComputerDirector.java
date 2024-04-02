package org.example;

public class ComputerDirector {
    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer constructComputer() {
        return builder.buildProcessor("Intel Core i7")
                .buildRAM(16)
                .buildHardDrive("1TB SSD")
                .buildGraphicsCard("NVIDIA GTX 3080")
                .buildOperatingSystem("Windows 10 Pro")
                .build();
    }
}
