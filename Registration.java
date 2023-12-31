package CompetitionSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {
    private List<User> users;
    private Scanner scanner;

    public Registration() {
        users = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void run() {
        boolean exit = false;
        while (!exit) {
            System.out.println("\n--- Registration System ---");
            System.out.println("1 - Register User");
            System.out.println("2 - List Registered Users");
            System.out.println("3 - Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    listUsers();
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

    private void registerUser() {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        User newUser = new User(name, email);
        users.add(newUser);
        System.out.println("User registered successfully.");
    }

    private void listUsers() {
        if (users.isEmpty()) {
            System.out.println("No users registered.");
        } else {
            System.out.println("Registered Users:");
            for (User user : users) {
                System.out.println(user);
            }
        }
    }

    public static void main(String[] args) {
        Registration registrationSystem = new Registration();
        registrationSystem.run();
    }
}
