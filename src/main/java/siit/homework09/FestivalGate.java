package siit.homework09;

import java.util.LinkedList;
import java.util.Queue;

public class FestivalGate {

    Queue<TicketType> festivalTicketsType = new LinkedList<>();


    /***
     * adds the ticket type to the queue list
     * @param ticketType parameter it gets to be added to the list
     */
    public void addTicketToTheQueue(TicketType ticketType) {
        festivalTicketsType.offer(ticketType);
    }

    public Queue<TicketType> getFestivalTicketsType() {
        return festivalTicketsType;
    }

    @Override
    public String toString() {
        return "FestivalGate{" +
                "festivalTicketsType=" + festivalTicketsType +
                '}';
    }
}
