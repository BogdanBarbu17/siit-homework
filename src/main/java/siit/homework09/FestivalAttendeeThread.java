package siit.homework09;


public class FestivalAttendeeThread extends Thread {

    private final TicketType ticketType;
    private final FestivalGate gate;


    public FestivalAttendeeThread(TicketType ticketType, FestivalGate gate) {
        this.ticketType = ticketType;
        this.gate = gate;
    }


    /***
     * this method calls  the addTicketToTheQueue method from the festival gate class
     * addTicketToTheQueue method adds the type of ticket to the queue
     * uses a synchronized block to avoid concurrent modification exception that may appear
     * this exception may appear when multiple threads adds to a list
     * @param ticketType type of ticket
     */
    public void validateTicket(TicketType ticketType) {
        synchronized (gate) {
            gate.addTicketToTheQueue(ticketType);
        }
    }


    /***
     * this method calls the validateTicket method that adds the ticket type to the queue list
     */
    @Override
    public void run() {
        validateTicket(ticketType);
    }


    @Override
    public String toString() {
        return "Attendee{}" + ticketType;
    }


}
