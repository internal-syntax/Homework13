package homework13;

public class Author {
    private String firstName;
    private final String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return lastName.equals(c2.lastName);
    }
    @Override
    public String toString() {
        return "автор" + " " + firstName + " " + lastName;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName, lastName);
    }

}
