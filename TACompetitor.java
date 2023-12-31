package CompetitionSystem;

public class TACompetitor {
    private String name;
    private String subject;
    private int score;

    public TACompetitor(String name, String subject, int score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    @Override
    public String toString() {
        return "TACompetitor{" +
               "name='" + name + '\'' +
               ", subject='" + subject + '\'' +
               ", score=" + score +
               '}';
    }
}
