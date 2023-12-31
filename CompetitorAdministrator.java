package CompetitionSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompetitorAdministrator {
    private List<Competitor> competitors;
    private Scanner scanner;

    public CompetitorAdministrator() {
        competitors = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println("Competition Management System");

        boolean exit = false;
        while (!exit) {
            System.out.println("\nAvailable actions:");
            System.out.println("1 - Add Competitor");
            System.out.println("2 - Show All Competitors");
            System.out.println("3 - Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addCompetitor();
                    break;
                case 2:
                    showCompetitors();
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

    private void addCompetitor() {
        System.out.print("Enter Competitor Name: ");
        String name = scanner.nextLine();
        Competitor newCompetitor = new Competitor(name);
        competitors.add(newCompetitor);
        System.out.println(name + " added successfully.");
    }

    private void showCompetitors() {
        if (competitors.isEmpty()) {
            System.out.println("No competitors available.");
        } else {
            for (Competitor c : competitors) {
                System.out.println(c); // Assuming toString() in Competitor class is overridden
            }
        }
    }

    public static void main(String[] args) {
        CompetitorAdministrator admin = new CompetitorAdministrator();
        admin.run();
    }
}

class Competitor {
    private String name;
    // Other fields like ID, score, etc. can be added here

    public Competitor(String name, String category) {
        this.name = name;
    }

    public Competitor(String name2) {
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
        return "Competitor: " + name;
    }
}

