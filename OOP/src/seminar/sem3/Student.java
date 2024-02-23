package seminar.sem3;
import java.lang.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Student implements Comparable <Student> {
   private static AtomicInteger idCounter=new AtomicInteger(0);
    private Integer studentID;
    private String firstName;
    private String secondName;
    private String lastName;
    private String groupNumber;

    public Student(String firstName, String secondName, String lastName) {
        this.studentID = idCounter.addAndGet(1);
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public Student(String firstName, String secondName, String lastName, String groupNumber) {
        this.studentID = idCounter.addAndGet(1);
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.groupNumber = groupNumber;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
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

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public int compareTo(Student o) {
        if (this.studentID>o.getStudentID()){
            return 1;
        } else if (this.studentID<o.getStudentID()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + studentID +
                ", Студент: " +secondName +" "+  firstName +
                " " + lastName +
                ", Группа: " + groupNumber  +
                '}';
    }
}




