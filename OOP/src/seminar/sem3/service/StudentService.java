package seminar.sem3.service;

import seminar.sem3.data.Student;
import seminar.sem3.data.User;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    List<Student> userList;

    public StudentService(List<Student> userList) {
        this.userList = userList;
    }

    public StudentService() {
        this.userList = new ArrayList<>();
    }

    public void create(String firstName, String secondName, String lastName) {
        int id = getFreeID();
        userList.add(new Student(id, firstName, secondName, lastName));
    }

    public int getFreeID() {
        int maxID = 1;
        for (User user : userList) {
            if (user instanceof Student) {
                maxID++;
            }
        }
        return maxID;
    }

    public List<Student> getUserList() {
        return userList;
    }
}
