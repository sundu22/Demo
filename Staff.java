package CompetitionSystem;

public class Staff {
    private String name;
    private String position;

    public Staff(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Staff Name: " + name + ", Position: " + position;
    }
}

