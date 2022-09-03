package siit.homework10;

import siit.homework08.Student;

import java.util.Comparator;

public class AthleteFinalTimeComparator implements Comparator<Athlete> {


    @Override
    public int compare(Athlete o1, Athlete o2) {
        return o1.getFinalTimeResult().compareTo(o2.getFinalTimeResult());
    }
}
