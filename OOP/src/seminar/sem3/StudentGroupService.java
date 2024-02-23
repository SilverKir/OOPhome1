package seminar.sem3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    StudyGroup studyGroup;

    public StudentGroupService(StudyGroup studyGroup) {
        this.studyGroup = studyGroup;
    }

    /**
     * @return сортированный по возрастанию индекса список студентов
     * @apiNote Сортировка списка
     */
    public List<Student> getSortedStudentGroup() {
        List<Student> studentList = new ArrayList<>(studyGroup.studentList);
//        List<Student> studentList = new ArrayList<>(studyGroup.studentList);
        Collections.sort(studentList);
        return studentList;
    }

    /**
     * @apiNote Вывод на экран списка студентов
     * @param studentList список
     */
    public void soutList(List<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public List<Student> getSortedStudentGroupByFIO() {

        List<Student> studentList = studyGroup.studentList;
       studentList.sort(new StudentComparator());
        return studentList;
    }
}
