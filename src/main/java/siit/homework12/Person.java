package siit.homework12;

public class Person {

    private final String firstName;
    private final String lastName;

    private final Integer monthOfBirth;

    public Person(String firstName, String lastName, Integer monthOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthOfBirth = monthOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }


    public Integer getMonthOfBirth() {
        return monthOfBirth;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
