package seminar.sem3;

import java.util.Iterator;
import java.util.List;

public class SteamIterator implements Iterator <StudyGroup> {
    private List<StudyGroup> studyGroupList;
    private int count = 0;

    public SteamIterator(List<StudyGroup> studyGroupList) {
        this.studyGroupList = studyGroupList;
    }


    @Override
    public boolean hasNext() {
        return count<studyGroupList.size();
    }

    @Override
    public StudyGroup next() {
        if (!hasNext()){
            return null;
        }
            return studyGroupList.get(count++);
    }
}
