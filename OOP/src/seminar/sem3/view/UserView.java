package seminar.sem3.view;

import seminar.sem3.data.User;

import java.util.List;

public interface UserView <T extends User>{
    void sendOnConsole(List<T> list);

}
