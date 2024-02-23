package seminar.sem3;

import java.util.Comparator;

public class SteamComparator implements Comparator<Steam> {
    @Override
    public int compare(Steam o1, Steam o2) {
        if (o1.getStudyGroupList().size() > o2.getStudyGroupList().size()) {
            return 1;
        } else if (o1.getStudyGroupList().size() < o2.getStudyGroupList().size()) {
            return -1;
        }
        return 0;
    }
}
