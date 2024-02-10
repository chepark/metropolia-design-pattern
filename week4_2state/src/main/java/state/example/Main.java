package state.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameCharacter character = new GameCharacter("Hero");

        while (true) {
            character.displayStatus();
            System.out.println("Choose an action:");
            System.out.println("1. Train");
            System.out.println("2. Meditate");
            System.out.println("3. Fight");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    character.train();
                    break;
                case 2:
                    character.meditate();
                    break;
                case 3:
                    character.fight();
                    break;
                case 4:
                    System.out.println("Exiting the game...");
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }

            // Assuming the game ends when reaching Master level (level 4 in this context)
            if (character.getLevel() == 4) {
                System.out.println("Congratulations! You have reached the Master level. You've completed your journey.");
                break;
            }
        }
        scanner.close();
    }
}