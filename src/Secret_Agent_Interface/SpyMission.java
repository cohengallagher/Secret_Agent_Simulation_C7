package Secret_Agent_Interface;

import java.util.Scanner;

public class SpyMission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecretAgent agent;

        //Give user options to chose from
        System.out.println("Welcome to the spy mission!");
        System.out.println("Choose your secret agent type:");
        System.out.println("1. Stealth Operative (Silent and sneaky)");
        System.out.println("2. Tech Specialist (Hacker and tech guru)");
        System.out.println("3. Demolition Expert (Loud and destructive)");

        //Simulate selection
        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                agent = new StealthOperative();
                System.out.println("\nYou have chosen: Stealth Operative!");
                break;
            case 2:
                agent = new TechSpecialist();
                System.out.println("\nYou have chosen: Tech Specialist!");
                break;
            case 3:
                agent = new DemolitionExpert();
                System.out.println("\nYou have chosen: Demolition Expert!");
                break;
            default:
                agent = new StealthOperative();
                System.out.println("\nInvalid choice! Defaulting to Stealth Operative.");
        }
        System.out.println(agent.coverIdentity());

        //Loop to play the game
        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Gather Intel");
            System.out.println("2. Use Gadget");
            System.out.println("3. Attempt Mission");
            System.out.println("4. Exit Mission");

            System.out.print("Enter your choice: ");
            int action = scanner.nextInt();

            if (action == 1) {
                agent.gatherIntel();
            } else if (action == 2) {
                agent.useGadget();
            } else if (action == 3) {
                boolean success = agent.completeMission();
                if (success) {
                    System.out.println("MISSION SUCCESS! You are a top-class agent!");
                } else {
                    System.out.println("MISSION FAILED! Better luck next time...");
                }
            } else if (action == 4) {
                System.out.println("Mission complete. Exiting...");
                break;
            } else {
                System.out.println("Invalid choice! Try again.");
            }
        }
    }
}