package CompetitionSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistrationSystem {
    private List<Participant> participants;
    private Scanner scanner;

    public RegistrationSystem() {
        participants = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void run() {
        boolean exit = false;
        while (!exit) {
            System.out.println("\n--- Registration System ---");
            System.out.println("1 - Register Participant");
            System.out.println("2 - List Participants");
            System.out.println("3 - Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    registerParticipant();
                    break;
                case 2:
                    listParticipants();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        System.out.println("Exiting System...");
        scanner.close();
    }

    private void registerParticipant() {
        System.out.print("Enter Participant's Name: ");
        String name = scanner.nextLine();
        Participant participant = new Participant(name);
        participants.add(participant);
        System.out.println(name + " registered successfully.");
    }

    private void listParticipants() {
        if (participants.isEmpty()) {
            System.out.println("No participants registered.");
        } else {
            System.out.println("Registered Participants:");
            for (Participant participant : participants) {
                System.out.println(participant); // Assuming toString() in Participant class is overridden
            }
        }
    }

    public static void main(String[] args) {
        RegistrationSystem system = new RegistrationSystem();
        system.run();
    }
}

class Participant {
    private String name;

    public Participant(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Participant: " + name;
    }
}
