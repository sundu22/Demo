package CompetitionSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompetitionSystem {
    private List<Competition> competitors;
    private Scanner scanner;

    public CompetitionSystem() {
        this.competitors = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    private void addCompetitor(Competition competitor) {
        competitors.add(competitor);
        System.out.println("Competitor added: " + competitor.getName());
    }

    private void displayCompetitorDetails(int competitorNumber) {
        for (Competition c : competitors) {
            if (c.getCompetitorNumber() == competitorNumber) {
                System.out.println(c.getFullDetails());
                return;
            }
        }
        System.out.println("Competitor with number " + competitorNumber + " not found.");
    }

    private void displayAllCompetitorsShortDetails() {
        for (Competition c : competitors) {
            System.out.println(c.getShortDetails());
        }
    }

    public void run() {
        System.out.println("Welcome to the Competition Management System!");

        // Pre-load some competitors
        addCompetitor(new Competition(100, "Keith John Talbot", "UK", "Novice", 21, new int[]{5, 4, 5, 4, 3}));
        addCompetitor(new Competition(101, "Alice Smith", "USA", "Intermediate", 25, new int[]{4, 5, 3, 4, 5}));
        addCompetitor(new Competition(102, "Bob Johnson", "Canada", "Expert", 30, new int[]{5, 5, 5, 4, 4, 3}));

        boolean quit = false;
        while (!quit) {
            System.out.println("\nOptions:");
            System.out.println("1. Display all competitors' short details");
            System.out.println("2. Display a competitor's full details");
            System.out.println("3. Quit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayAllCompetitorsShortDetails();
                    break;
                case 2:
                    System.out.print("Enter the competitor number: ");
                    int competitorNumber = scanner.nextInt();
                    displayCompetitorDetails(competitorNumber);
                    break;
                case 3:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        System.out.println("Thank you for using the Competition Management System.");
        scanner.close();
    }

    public static void main(String[] args) {
        CompetitionSystem system = new CompetitionSystem();
        system.run();
    }
}