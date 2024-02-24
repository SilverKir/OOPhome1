package seminar.sem3.view;

import seminar.sem3.data.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher>{

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println("teacher = " + teacher);
        }
    }
}
