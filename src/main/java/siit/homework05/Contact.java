package siit.homework05;


public class Contact {

    private final String phoneNumber;
    private final String firstName;
    private final String lastName;

    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }



    public String getFirstName() {
        return firstName;
    }


    @Override
    public String toString() {
        return "Contact:" +
                firstName + " " +
                lastName + " " +
                phoneNumber + " " +
                '\n';
    }
}
