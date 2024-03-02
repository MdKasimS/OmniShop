import java.util.regex.Pattern;

public class User {
    private String firstName;
    private String lastName;

    // Constructor
    public User(String firstName, String lastName) {
        validateName(firstName);
        validateName(lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        validateName(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        validateName(lastName);
        this.lastName = lastName;
    }

    // Name validation method
    private void validateName(String name) {
        if (!Pattern.matches("[a-zA-Z]+", name)) {
            throw new IllegalArgumentException("Name must contain only alphabets.");
        }
    }
}
