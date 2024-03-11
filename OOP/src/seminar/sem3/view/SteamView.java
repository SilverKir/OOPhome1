package seminar.sem3.view;

import seminar.sem3.data.Steam;
import seminar.sem3.data.StudyGroup;

import java.util.List;

public class SteamView {
    public void soutSteamList(List<Steam> steamList){
        for (Steam studyGroups : steamList) {
            for (StudyGroup group : studyGroups) {
                System.out.println("Group = " + group);
            }
        }
    }
}
