package siit.homework05;

public class Main {



    public static void main(String[] args) {

       /* Phone samsungS7 = new SamsungGalaxyS7("Blue", "Plastic", "154ds84sd8");

        samsungS7.addContact("Jane", "Doe", "0745781478");
        samsungS7.addContact("Nick", "Doe", "0745871254");

        samsungS7.listContacts();

        */




        Phone samsungS8 = new SamsungGalaxyS8("Black","Aluminium","478s4d1s81");

        samsungS8.addContact("John", "Doe", "0787452174");
        samsungS8.addContact("Mary", "Doe", "0784512445");

        samsungS8.listContacts();

        samsungS8.makeACall("John");
        samsungS8.makeACall("Mary");


        samsungS8.sendMessage("John","Houston, we have a problem!");
        samsungS8.sendMessage("Mary","Say hello to my little friend!");
        samsungS8.sendMessage("John", "You shall not pass!!");

        samsungS8.listMessages("John");

        samsungS8.viewHistory();

    }
}
