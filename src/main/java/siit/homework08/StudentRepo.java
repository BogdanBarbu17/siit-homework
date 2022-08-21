package siit.homework08;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class StudentRepo {

    private static final Logger LOG = LogManager.getLogger(Student.class);

    Set<Student> studentsList = new TreeSet<>(new StudentIDComparator());

    public void addStudent(String firstName, String lastName, int dateOfBirth, Gender gender, String id) {
        try {
            Student student = new Student(firstName, lastName, dateOfBirth, gender, id);
            studentsList.add(student);
        } catch (IllegalArgumentException exception) {
            LOG.error("Student data not valid", exception);
        }
    }

    public void deleteStudent(String id) {

        if (isNotValid(id)) {
            LOG.error("Input can not be empty");
            return;
        }

        boolean invalid = true;

        for (Student student : studentsList) {
            if (student.getID().equals(id)) {
                studentsList.remove(student);
                System.out.println("The student was removed");
                invalid = false;
                break;
            }
        }
        if (invalid) {
            LOG.error("Student id does not exist");
        }
    }

    public void printStudents() {
        for (Student student : studentsList) {
            System.out.println(student);
        }
    }

    public void printStudentWithCertainAge(int age) {

        boolean invalid = true;

        for (Student student : studentsList) {
            if (student.getAge().equals(age)) {
                System.out.println(student);
                invalid = false;
            }
        }

        if (invalid) {
            LOG.error("There are not students whit this age");
        }
    }

    public void printStudentsByLastName() {
        List<Student> studentsByLastName = new ArrayList<>(studentsList);
        studentsByLastName.sort(compareByLastName);

        for (Student student : studentsByLastName) {
            System.out.println(student);
        }
    }

    public void printStudentsByDateOfBirth() {
        List<Student> studentsByDateOfBirth = new ArrayList<>(studentsList);
        studentsByDateOfBirth.sort(compareByDateOfBirth);

        for (Student student : studentsByDateOfBirth) {
            System.out.println(student);
        }
    }

    Comparator<Student> compareByLastName = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    };


    Comparator<Student> compareByDateOfBirth = new Comparator<>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
        }
    };


    public Boolean isNotValid(String input) {
        if (input == null) {
            return true;
        }
        return input.trim().isEmpty();
    }


}
