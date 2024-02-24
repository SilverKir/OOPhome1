package seminar.sem3.service;

import seminar.sem3.data.User;

import java.util.Comparator;

public class UserComparator <T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        if(o1.getSecondName().compareTo(o2.getSecondName())==0) {
            if (o1.getFirstName().compareTo(o2.getFirstName()) == 0) {

                return o1.getLastName().compareTo(o2.getLastName());
            } else {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        } else{
            return o1.getSecondName().compareTo(o2.getSecondName());
        }
    }
}
