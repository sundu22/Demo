package Competition;

class Competitor {
    private int competitorNumber;
    private String name;
    private String country;
    private String level;
    private int age;
    private int[] scores;

    public Competitor(int competitorNumber, String name, String country, String level, int age, int[] scores) {
        this.competitorNumber = competitorNumber;
        this.name = name;
        this.country = country;
        this.level = level;
        this.age = age;
        this.scores = scores;
    }

    public Competitor(int competitorNumber2, String name2, double score1, double score2, double score3) {
		// TODO Auto-generated constructor stub
	}

	public int getCompetitorNumber() {
        return competitorNumber;
    }

    public void setCompetitorNumber(int competitorNumber) {
        this.competitorNumber = competitorNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public double getOverallScore() {
        // Calculate overall score (simple average for now)
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    public String getFullDetails() {
        StringBuilder details = new StringBuilder("Competitor number " + competitorNumber + ", name " + name + ", country " + country + ".\n");
        details.append(name).append(" is a ").append(level).append(" aged ").append(age).append(" and received these scores: ");
        for (int score : scores) {
            details.append(score).append(", ");
        }
        details.delete(details.length() - 2, details.length()); // Remove the trailing comma and space
        details.append("\nThis gives him/her an overall score of ").append(getOverallScore()).append(".");
        return details.toString();
    }

    public String getShortDetails() {
        return "CN " + competitorNumber + " (" + getInitials() + ") has overall score " + getOverallScore() + ".";
    }

    private String getInitials() {
        // Extract initials from the name
        StringBuilder initials = new StringBuilder();
        String[] nameParts = name.split(" ");
        for (String part : nameParts) {
            initials.append(part.charAt(0));
        }
        return initials.toString().toUpperCase();
    }
}


























