package seminar.sem3.data;


public class User {

    private String firstName;
    private String secondName;
    private String lastName;

    public User(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }
    public User(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = "";
    }


    public String getFirstName() {
        return firstName;
    }


    public String getSecondName() {
        return secondName;
    }


    public String getLastName() {
        return lastName;
    }


    @Override
    public String toString() {
        return "User{ " +
                secondName + " " +
                firstName + " " +
                lastName + " " +
                '}';
    }
}
