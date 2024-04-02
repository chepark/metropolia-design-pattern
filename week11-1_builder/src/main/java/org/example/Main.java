package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComputerBuilder builder;

        // Choose the computer type
        System.out.println("Select the type of computer (1- Gaming, 2- Office): ");
        int type = scanner.nextInt();

        // build the computer based on the user's choice
        if (type == 1) {
            builder = new GamingComputerBuilder();
        } else {
            builder = new OfficeComputerBuilder();
        }

        // Processor selection
        System.out.println("Choose Processor (1- Intel i7, 2- AMD Ryzen 7): ");
        int processorChoice = scanner.nextInt();
        String processor = processorChoice == 1 ? "Intel i7" : "AMD Ryzen 7";
        builder.buildProcessor(processor);

        // RAM selection
        System.out.println("Choose RAM size (8, 16, 32): ");
        int ramSize = scanner.nextInt();
        builder.buildRAM(ramSize);

        // Hard Drive selection
        System.out.println("Choose Hard Drive (1- 512GB SSD, 2- 1TB HDD): ");
        int hardDriveChoice = scanner.nextInt();
        String hardDrive = hardDriveChoice == 1 ? "512GB SSD" : "1TB HDD";
        builder.buildHardDrive(hardDrive);

        // Graphics Card selection (assuming gaming computers have a choice)
        if (type == 1) {
            System.out.println("Choose Graphics Card (1- NVIDIA GTX 3080, 2- AMD Radeon RX 6800): ");
            int graphicsCardChoice = scanner.nextInt();
            String graphicsCard = graphicsCardChoice == 1 ? "NVIDIA GTX 3080" : "AMD Radeon RX 6800";
            builder.buildGraphicsCard(graphicsCard);
        }

        // Operating System selection
        System.out.println("Choose Operating System (1- Windows 11, 2- Ubuntu 22.04): ");
        int osChoice = scanner.nextInt();
        String operatingSystem = osChoice == 1 ? "Windows 11" : "Ubuntu 22.04";
        builder.buildOperatingSystem(operatingSystem);

        // Build the computer and display the configuration
        Computer computer = builder.build();
        System.out.println("Computer configuration:");
        System.out.println(computer);
    }
}
