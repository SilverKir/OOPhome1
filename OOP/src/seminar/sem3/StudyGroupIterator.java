package seminar.sem3;

import java.io.EOFException;
import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator implements Iterator<Student> {
    private List<Student> studentList;

    public int index = 0;

    public StudyGroupIterator(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return index < studentList.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }

        return studentList.get(index++);
    }

    @Override
    public void remove() {
        if (hasNext()) {
            studentList.remove(--index);
        }
    }
}
