package Competition;

public class Manager {
    public static void main(String[] args) {
        Competitorlist competitorList = new Competitorlist();
        competitorList.readCompetitorsFromFile("RunCompetitor.src");

        // Display short details for a specific competitor
        int competitorNumberToDisplay = 1; // Replace with user input
        competitorList.displayCompetitorDetails(competitorNumberToDisplay);

        // Generate and display the final report
        competitorList.generateFinalReport();
    }
}


