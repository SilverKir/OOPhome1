package seminar.sem3.service;

import seminar.sem3.data.StudyGroup;

import java.util.List;

public class StudentsGroupsService {
    List<StudyGroup> studyGroupList;

    public StudentsGroupsService(List<StudyGroup> studyGroupList) {
        this.studyGroupList = studyGroupList;
    }
    public List<StudyGroup> SortStudyGroupByStudentsCount() {
        List<StudyGroup> result = studyGroupList;
        result.sort(new StudyGroupComparator());
        return result;
    }
}
