package seminar.sem3;

import java.util.ArrayList;
import java.util.List;

public class SteamService {
    List<Steam> steamList;

    public SteamService(List<Steam> steamList) {
        this.steamList = steamList;
    }

    /**
     * @return сортированный поток.
     * @apiNote Сортировка потока по количеству групп, входщих в поток
     */
    public List<Steam> SortSteamByCountGroup() {
        List<Steam> result = steamList;
        result.sort(new SteamComparator());
        return result;
    }

    public void soutSteamList(List<Steam> steamList){
        for (Steam studyGroups : steamList) {
            for (StudyGroup group : studyGroups) {
                System.out.println("Group = " + group);
            }
        }
    }
}
