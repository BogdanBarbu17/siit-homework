package siit.homework09;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;


public class FestivalStatisticsThread extends Thread {

    private final AtomicBoolean running = new AtomicBoolean(false);
    private static final Logger LOG = LogManager.getLogger(FestivalAttendeeThread.class);
    private final FestivalGate gate;

    public FestivalStatisticsThread(FestivalGate gate) {
        this.gate = gate;
    }


    /***
     * this method sets the running parameter to true
     * while running is true the thread is running
     * calls the sleepFiveSeconds
     * the thread is sleeping for 5 seconds after that he wakes up and checks if the list of tickets is empty
     * if the list is empty logs an error else calls the attendeesStatistics method witch is framed in a synchronized block
     * the synchronized block avoids concurrent modification exception that may appear
     * this exception may appear when multiple threads counts the number of the same tickets  from the same list
     */
    @Override
    public void run() {
        running.set(true);
        while (running.get()){
            sleepFiveSeconds();
            if (gate.festivalTicketsType.isEmpty()){
                running.set(false);
                LOG.error("There are no participants to the festival !!");
            }else {
                synchronized (gate){
                    attendeesStatistics();
                }
            }
        }
    }


    /***
     * this method sets the running parameter to false, closing the while loop from the run method
     */
    public void close() {
        running.set(false);
    }


    /***
     * this method makes the thread sleep for 5 seconds
     * this method can throw exception so, I surrounded in a try-catch block
     */
    private void sleepFiveSeconds() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            LOG.error("Houston, we have a problem", e);

        }
    }


    /***
     * this method copy the list of ticket types
     * iterates the list and compares the type of tickets and counts them
     * than it prints the number of tickets and their type
     */
    public void attendeesStatistics() {
        Queue<TicketType> festivalTickets = gate.getFestivalTicketsType();
        System.out.println(festivalTickets.size() + "people entered");

        long fullTicketCount = festivalTickets.stream()
                .filter(x -> x.equals(TicketType.FULL))
                .count();
        System.out.println(fullTicketCount + " have full tickets");

        long fullVipTicketCount = festivalTickets.stream()
                .filter(x -> x.equals(TicketType.FULL_VIP))
                .count();
        System.out.println(fullVipTicketCount + " have full VIP passes");

        long freePassTicketCount = festivalTickets.stream()
                .filter(x -> x.equals(TicketType.FREE_PASS))
                .count();
        System.out.println(freePassTicketCount + " have have free passes");

        long OneDayTicketCount = festivalTickets.stream()
                .filter(x -> x.equals(TicketType.ONE_DAY))
                .count();
        System.out.println(OneDayTicketCount + " have have one-day passes");

        long OneDayVipTicketCount = festivalTickets.stream()
                .filter(x -> x.equals(TicketType.ONE_DAY_VIP))
                .count();
        System.out.println(OneDayVipTicketCount + " have one-day VIP passes");

    }


}
