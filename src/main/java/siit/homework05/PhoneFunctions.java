package siit.homework05;

public interface PhoneFunctions {

    void addContact(String firstName, String lastName, String number);

    void listContacts();

    void sendMessage(String name, String content);

    void listMessages(String name);

    void makeACall(String name);

    void viewHistory();

}
