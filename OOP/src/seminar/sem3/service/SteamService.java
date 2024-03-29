package seminar.sem3.service;

import seminar.sem3.data.Steam;
import seminar.sem3.data.StudyGroup;

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


}
