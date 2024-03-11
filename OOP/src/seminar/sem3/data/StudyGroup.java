package seminar.sem3.data;

import seminar.sem3.service.StudyGroupIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class StudyGroup implements Iterable<Student>, Comparable<StudyGroup> {
    private static AtomicInteger idCounter = new AtomicInteger(0);
    public Integer groupId;
    public String groupName;
    public String steamName;
    public List<Student> studentList = new ArrayList<>();

    public StudyGroup(String groupName, List<Student> studentList) {
        this.groupId = idCounter.addAndGet(1);
        this.groupName = groupName;
        this.studentList = studentList;
        StudyGroupIterator iterator = new StudyGroupIterator(this.studentList);
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getGroupNumber() == null || !student.getGroupNumber().equals(groupName)) {
                student.setGroupNumber(groupName);
            }
        }
    }

    public void AddStudent(Student student) {
        this.studentList.add(student);
        if (student.getGroupNumber() == null || !student.getGroupNumber().equals(groupName)) {
            student.setGroupNumber(groupName);
        }
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudyGroupIterator(this.studentList);
    }


    @Override
    public String toString() {
        return "Группа{" +
                "ID=" + groupId +
                ", Номер группы: " + groupName +
                ", Номер потока: " + steamName +
                ", Количество студентов: " + studentList.size() +
                ", studentList=" + studentList +
                '}';
    }

    @Override
    public int compareTo(StudyGroup o) {
        if (this.studentList.size() > o.studentList.size()) {
            return 1;
        } else if (this.studentList.size() < o.studentList.size()) {
            return -1;
        }
        return 0;
    }

}