package siit.homework08;


import java.time.LocalDate;
import java.util.Objects;

public class Student {


    LocalDate currentDate = LocalDate.now();
    int currentYear = currentDate.getYear();


    private final String firstName;
    private final String lastName;
    private final Integer dateOfBirth;
    private final Gender gender;
    private final String id;
    private final Integer age;


    public Student(String firstName, String lastName, Integer dateOfBirth, Gender gender, String id) throws IllegalArgumentException {

        if (isNotValid(firstName)) {
            throw new IllegalArgumentException("First name is invalid");
        }
        if (isNotValid(lastName)) {
            throw new IllegalArgumentException("Last name is invalid");
        }
        if (dateOfBirth < 1900 || dateOfBirth > (currentYear - 18)) {
            throw new IllegalArgumentException("Date of birth is invalid");
        }
        if (isNotValid(id)) {
            throw new IllegalArgumentException("ID is invalid");
        }


        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.id = id;
        this.age = currentYear - dateOfBirth;
    }


    public Boolean isNotValid(String name) {
        if (name == null) {
            return true;
        }
        return name.trim().isEmpty();
    }

    public Integer getAge() {
        return age;
    }

    public String getID() {
        return id;
    }


    public String getLastName() {
        return lastName;
    }

    public Integer getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", ID='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
