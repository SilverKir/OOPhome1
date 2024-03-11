package seminar.sem3;

import seminar.sem3.data.Steam;
import seminar.sem3.data.Student;
import seminar.sem3.data.StudyGroup;
import seminar.sem3.data.Teacher;
import seminar.sem3.service.*;
import seminar.sem3.view.StudentView;
import seminar.sem3.view.StudyGroupView;
import seminar.sem3.view.TeacherView;

import java.util.*;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {

        StudentService service = new StudentService();
       service.create("Алексей", "Иванов", "Иванович");
        service.create("Александр", "Петров", "Иванович");
        service.create("Сергей", "Васечкин", "Иванович");
        StudyGroup studyGroup = new StudyGroup("АТФ-3", service.getUserList());
        StudyGroupView sdview =new StudyGroupView();
        sdview.printStudyGroup(studyGroup);
        StudyGroupService sgs = new StudyGroupService(studyGroup);
        sgs.removeByName("Александр");
        sdview.printStudyGroup(studyGroup);




        System.out.println("___________________ ");
//
//        for (Student student : studyGroup) {
//            System.out.println("student = " + student);
//        }
//        System.out.println("___________________ ");
//
//        System.out.println(studentList.get(0).compareTo(studentList.get(1)));
//
//        System.out.println("___________________ ");
//        StudyGroupService service = new StudyGroupService(studyGroup);
//        service.soutList(studentList);
//
//        System.out.println("___________________ ");
//        service.soutList(service.getSortedStudentGroup());
//
//        System.out.println("___________________ ");
//        service.soutList(studentList);
//
//        System.out.println("___________________ ");
//        service.soutList(service.getSortedStudentGroupByFIO());
//        studentList.add(new Student("Лев", "Толстой", "Николаевич", "АТФ-3"));
//        studyGroup.AddStudent(new Student("Александр", "Пушкин", "Сергеевич"));
//
//        System.out.println("studyGroup = " + studyGroup);
//
//        List<Student> studentList1 = new ArrayList<>();
//        studentList1.add(new Student("Федр", "Достоевский", "Михайлович"));
//        studentList1.add(new Student("Владимир", "Маковский", "Владимирович"));
//        studentList1.add(new Student("Константин", "Бальмонт", "Дмитриевич"));
//        StudyGroup studyGroup1 = new StudyGroup("ЛИТ-2", studentList1);
//
//        List<StudyGroup> studyGroupList = new ArrayList<>(asList(studyGroup, studyGroup1));
//
//        System.out.println("--------------------");
//
//        Steam steam = new Steam("Первый поток", studyGroupList);
//        for (StudyGroup group : steam) {
//            System.out.println("group = " + group);
//        }
//        System.out.println("--------------------");
//
//        StudyGroup studyGroup2 = new StudyGroup("ФБВ-1", Arrays.asList(new Student("Иван", "Иванов", "Иванович")));
//        Steam steam1 = new Steam("Второй поток", Arrays.asList(studyGroup2));
//
//        List<Steam> steamList = new ArrayList<>(asList(steam, steam1));
//        for (Steam studyGroups : steamList) {
//            for (StudyGroup group : studyGroups) {
//                System.out.println("group = " + group);
//            }
//        }
//        System.out.println("----------steamService ----------");
//        SteamService steamService = new SteamService(steamList);
//        steamService.soutSteamList(steamService.SortSteamByCountGroup());
//
//        System.out.println("----------TotalService ----------");
//
//        for (Steam studyGroups : steamList) {
//            StudentsGroupsService studyGroupService=new StudentsGroupsService(studyGroups.getStudyGroupList());
//             studyGroupService.SortStudyGroupByStudentsCount();
//            for (StudyGroup group : studyGroups) {
//                StudyGroupService groupService=new StudyGroupService(group);
//                groupService.getSortedStudentGroupByFIO();
//            }
//        }
//
//        System.out.println("----------Seminar 4 ----------");
//        StudentView studentView=new StudentView();
//        studentView.sendOnConsole(studentList);
//
//        System.out.println("----------Home4 ----------");
//        List<Teacher> teacherList=new ArrayList<>(Arrays.asList(
//                new Teacher("Сергей","Бобров","Павлович", "Поэт"),
//                new Teacher("Арсений","Альвинг","","Поэт"),
//                new Teacher("Эдуард","Багрицкий")
//                ));
//        TeacherView tv =new TeacherView();
//        tv.sendOnConsole(teacherList);
//        System.out.println("----------Home4 Sorted----------");
//        TeacherService ts =new TeacherService(teacherList);
//        tv.sendOnConsole(ts.SortTeacherByName());

    }
}
