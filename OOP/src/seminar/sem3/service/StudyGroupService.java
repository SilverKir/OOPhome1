package seminar.sem3.service;

import seminar.sem3.data.Student;
import seminar.sem3.data.StudyGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudyGroupService {
    StudyGroup studyGroup;

    public StudyGroupService(StudyGroup studyGroup) {
        this.studyGroup = studyGroup;
    }

    /**
     * @return сортированный по возрастанию индекса список студентов
     * @apiNote Сортировка списка
     */
    public List<Student> getSortedStudentGroup() {
        List<Student> studentList = new ArrayList<>(studyGroup.studentList);
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
       studentList.sort(new UserComparator<Student>());
        return studentList;
    }
    public  StudyGroup removeByName(String studentName) {
        StudyGroupIterator iterator;
        iterator = new StudyGroupIterator(studyGroup.studentList);
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getFirstName().equals(studentName)) {
                studyGroup.studentList.remove(iterator.index-1);
                iterator.remove();

            }
        }

        return studyGroup;
    }

}
