package seminar.sem3.service;

import seminar.sem3.data.StudyGroup;

import java.util.Comparator;

public class StudyGroupComparator implements Comparator<StudyGroup> {


    @Override
    public int compare(StudyGroup o1, StudyGroup o2) {
        if (o1.studentList.size() > o2.studentList.size()) {
            return 1;
        } else if (o1.studentList.size() < o2.studentList.size()) {
            return -1;
        }
        return 0;
    }
}