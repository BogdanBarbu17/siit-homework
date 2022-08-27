package siit.homework09;

public class Main {

    public static void main(String[] args) {

        FestivalGate festivalGate = new FestivalGate();
        FestivalStatisticsThread festivalStatisticsThread = new FestivalStatisticsThread(festivalGate);
        festivalStatisticsThread.start();


        for (int i = 1; i <= 50000; i++) {
            FestivalAttendeeThread festivalAttendeeThread = new FestivalAttendeeThread(TicketType.randomTicketType(), festivalGate);
            festivalAttendeeThread.start();
        }


        festivalStatisticsThread.close();


    }






}
