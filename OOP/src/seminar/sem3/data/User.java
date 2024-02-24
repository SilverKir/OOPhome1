package seminar.sem3.data;

import java.util.concurrent.atomic.AtomicInteger;


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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
