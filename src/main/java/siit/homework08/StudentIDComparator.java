package siit.homework08;

import java.util.Comparator;

public class StudentIDComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getID().compareTo(o2.getID());
    }
}
