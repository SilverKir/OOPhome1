package seminar.sem3.data;

import java.util.concurrent.atomic.AtomicInteger;

public class Teacher extends User implements Comparable<Teacher>{
    private static AtomicInteger idCounter=new AtomicInteger(0);
    private Integer teacherID;
    private String speciality;

    public Teacher(String firstName, String secondName, String lastName,  String speciality) {
        super(firstName, secondName, lastName);
        this.teacherID = idCounter.addAndGet(1);
        this.speciality = speciality;
    }
    public Teacher(String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherID = idCounter.addAndGet(1);
    }
    public Teacher(String firstName, String secondName) {
        super(firstName, secondName);
        this.teacherID = idCounter.addAndGet(1);
    }


    public Integer getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public int compareTo(Teacher o) {
        return this.getTeacherID().compareTo(o.getTeacherID());
    }

    @Override
    public String toString() {
        return "Teacher { speciality = '" + speciality + " "
                + super.toString()+
                '}';
    }
}
