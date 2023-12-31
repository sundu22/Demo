package CompetitionSystem;

public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{Name='" + name + "', Email='" + email + "'}";
    }
}
