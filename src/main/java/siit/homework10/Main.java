package siit.homework10;


public class Main {

    public static void main(String[] args) {


        String fileName = "athleteInput.txt";

        AthleteRepository athleteRepository = new AthleteRepository();

        athleteRepository.readFile(fileName);

        System.out.println();
        System.out.println("========================= WINNERS ==========================");
        System.out.println();

        athleteRepository.printWinners();




    }











}

