package seminar.sem3.service;

import seminar.sem3.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    List<Teacher> teacherList;

    public TeacherService(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Teacher>  SortTeacherByName () {
        List<Teacher> teacherList1=new ArrayList<>(teacherList);
         teacherList1.sort(new UserComparator<Teacher>());
        return teacherList1;
    }
}
