package seminar.sem3.view;

import seminar.sem3.data.Student;

import java.util.List;

public class StudentView implements UserView<Student> {
    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student student : list) {
            System.out.println("Студент = " + student);
        }
    }
}
