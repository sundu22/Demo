package Competition;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Competitorlist {
    private List<Competitor> competitors;

    // Constructor, getters, and setters

    public Competitorlist() {
        this.competitors = new ArrayList<>();
    }

    // Method to read competitors from a file
    public void readCompetitorsFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int competitorNumber = Integer.parseInt(data[0]);
                String name = data[1];
                double score1 = Double.parseDouble(data[2]);
                double score2 = Double.parseDouble(data[3]);
                double score3 = Double.parseDouble(data[4]);
                Competitor competitor = new Competitor(competitorNumber, name, score1, score2, score3);
                competitors.add(competitor);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    // Method to display short details of a competitor by number
    public void displayCompetitorDetails(int competitorNumber) {
        for (Competitor competitor : competitors) {
            if (competitor.getCompetitorNumber() == competitorNumber) {
                System.out.println("Competitor Details:");
                System.out.println("Number: " + competitor.getCompetitorNumber());
                System.out.println("Name: " + competitor.getName());
                System.out.println("Score 1: " + competitor.getScores());
                System.out.println("Score 2: " + competitor.getScores());
                System.out.println("Score 3: " + competitor.getScores());
                return;
            }
        }
        System.out.println("Competitor not found.");
    }

    // Additional methods for generating the report, finding highest score, etc.
    // ...

    // Method to generate the final report
    public void generateFinalReport() {
        // Implement this method based on your requirements
        // Include a table of competitors, details of the competitor with the highest score,
        // and other summary statistics as specified in your assignment.
    }
}


