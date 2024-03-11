package seminar.sem3.data;

import java.lang.*;

public class Student extends User implements Comparable <Student>  {
    private Integer studentID;
    private String groupNumber;

    public Student(Integer studentID, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentID = studentID;
    }

    public Student(Integer studentID, String firstName, String secondName, String lastName, String groupNumber) {
        super(firstName, secondName, lastName);
        this.studentID = studentID;
        this.groupNumber = groupNumber;
    }

    public Integer getStudentID() {
        return studentID;
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
                ", Студент: " +super.getSecondName()+" "+  super.getFirstName() +
                " " + super.getLastName() +
                ", Группа: " + groupNumber  +
                '}';
    }
}




