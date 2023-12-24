package Competition;

public class Competition {
    public static void main(String[] args) {
        // Create Competitor objects
        Competitor competitor1 = new Competitor(100, "Keith John Talbot", "UK", "Novice", 21, new int[]{5, 4, 5, 4, 3});
        Competitor competitor2 = new Competitor(101, "Alice Smith", "USA", "Intermediate", 25, new int[]{4, 5, 3, 4, 5});
        Competitor competitor3 = new Competitor(102, "Bob Johnson", "Canada", "Expert", 30, new int[]{5, 5, 5, 4, 4, 3});

        // Test methods
        System.out.println(competitor1.getFullDetails());
        System.out.println(competitor1.getShortDetails());
        System.out.println();

        System.out.println(competitor2.getFullDetails());
        System.out.println(competitor2.getShortDetails());
        System.out.println();

        System.out.println(competitor3.getFullDetails());
        System.out.println(competitor3.getShortDetails());
    }
}


