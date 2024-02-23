package seminar.sem3;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    List<StudyGroup> studyGroupList;

    public StudyGroupService(List<StudyGroup> studyGroupList) {
        this.studyGroupList = studyGroupList;
    }
    public List<StudyGroup> SortStudyGroupByStudentsCount() {
        List<StudyGroup> result = studyGroupList;
        result.sort(new StudyGroupComparator());
        return result;
    }
}
