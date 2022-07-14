package siit.homework05;


import java.util.ArrayList;
import java.util.List;


public abstract class Phone implements PhoneFunctions {

    public int batteryLife;
    public String color;
    public String material;
    public String imei;

    List<Contact> contactList = new ArrayList<>();
    List<Message> messageList = new ArrayList<>();
    List<String> callHistory = new ArrayList<>();

    public Phone(String color, String material, String imei) {
        this.batteryLife = 12;
        this.color = color;
        this.material = material;
        this.imei = imei;
    }


    @Override
    public void addContact(String firstName, String lastName, String number) {
        Contact contact = new Contact(firstName, lastName, number);
        System.out.println("The contact has been added");
        contactList.add(contact);
    }


    @Override
    public void listContacts() {
        System.out.println("======= Contact List =======");
        System.out.println(contactList);
    }


    @Override
    public void makeACall(String name) {
        if (isItCharged()) {

            for (int i = 0; i < contactList.size(); i++) {
                if (contactList.get(i).getFirstName().equals(name)) {
                    batteryLife -= 2;
                    System.out.println("You called " + name);
                    callHistory.add(name);
                }
            }
        }
    }


    @Override
    public void sendMessage(String name, String content) {
        if (isNotToLarge(content) && isItCharged()) {

            for (int i = 0; i < contactList.size(); i++) {
                if (contactList.get(i).getFirstName().equals(name)) {
                    Message message = new Message(name, content);
                    messageList.add(message);
                    batteryLife -= 1;

                }

            }

        }

    }


    @Override
    public void listMessages(String name) {
        for (int i = 0; i < messageList.size(); i++) {
            if (messageList.get(i).getExpeditor().equals(name)) {
                System.out.println(messageList.get(i));
            }
        }
    }

    @Override
    public void viewHistory() {
        System.out.println(callHistory);
    }


    public boolean isNotToLarge(String content) {
        if (content.length() > 500) {
            System.out.println("This message is to large!!!!");
            return false;
        }
        return true;
    }


    public boolean isItCharged() {
        if (batteryLife < 1) {
            System.out.println("You don't have enough battery!!!!");
            return false;
        }
        return true;
    }


}
