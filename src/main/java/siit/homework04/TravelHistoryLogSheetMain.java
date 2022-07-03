package siit.homework04;


public class TravelHistoryLogSheetMain {

    public static void main(String[] args) {

         Car golf = new VWGolf(50, 14, "154sds");

         Car sklasse = new SKlasse(50, 17, "478sas458");

         Car cklasse = new CKlasse(70,15,"sds4578sds");



        System.out.println("\n ========= Golf's travel history log sheet =========" + "\n");

        System.out.println(golf);

        System.out.println(" ");

        golf.start();
        golf.drive(100);
        golf.shiftGear(2);
        golf.drive(5);
        golf.stop();
        golf.averageFuelConsumption();
        golf.refuel();

        System.out.println(" ");

        System.out.println(golf);


        System.out.println("\n ========= S Klasse's travel history log sheet =========" + "\n");

        System.out.println(sklasse);

        System.out.println(" ");

        sklasse.start();
        sklasse.drive(100);
        sklasse.shiftGear(2);
        sklasse.drive(10);
        sklasse.stop();
        sklasse.averageFuelConsumption();
        sklasse.refuel();

        System.out.println(" ");

        System.out.println(sklasse);


        System.out.println("\n ========= C Klasse's travel history log sheet =========" + "\n");

        System.out.println(cklasse);

        System.out.println(" ");

        cklasse.start();
        cklasse.drive(100);
        cklasse.shiftGear(4);
        cklasse.drive(20);
        cklasse.stop();
        cklasse.averageFuelConsumption();
        cklasse.refuel();

        System.out.println(" ");

        System.out.println(cklasse);


    }



}

