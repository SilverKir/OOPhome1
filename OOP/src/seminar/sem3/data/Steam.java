package seminar.sem3.data;

import seminar.sem3.service.SteamIterator;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Steam implements Iterable<StudyGroup>, Comparable<Steam>{
    private static AtomicInteger idCounter = new AtomicInteger(0);
    public Integer steamID;
    public String steamName;
    private List<StudyGroup> studyGroupList;

    public Steam(String steamName, List<StudyGroup> studyGroupList) {
        this.steamID=idCounter.addAndGet(1);
        this.steamName = steamName;
        this.studyGroupList = studyGroupList;
        SteamIterator iterator = new SteamIterator(this.studyGroupList);
        while (iterator.hasNext()) {
            StudyGroup studyGroup = iterator.next();
            if (studyGroup.steamName == null || !studyGroup.steamName.equals(this.steamName)) {
                studyGroup.steamName = steamName;
            }
        }
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return new SteamIterator(this.studyGroupList);
    }

    public List<StudyGroup> getStudyGroupList() {
        return studyGroupList;
    }

    @Override
    public int compareTo(Steam o) {
        return this.steamID.compareTo(o.steamID);
    }
}
