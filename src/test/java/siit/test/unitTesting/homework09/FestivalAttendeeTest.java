package siit.test.unitTesting.homework09;

import org.junit.jupiter.api.Test;
import siit.homework09.FestivalAttendeeThread;
import siit.homework09.FestivalGate;
import siit.homework09.TicketType;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FestivalAttendeeTest {

    @Test
    public void validateTicketTest1() {

        FestivalGate gate = new FestivalGate();

        FestivalAttendeeThread festivalAttendee = new FestivalAttendeeThread(TicketType.FREE_PASS, gate);
        festivalAttendee.validateTicket(TicketType.FREE_PASS);

        assertEquals(TicketType.FREE_PASS, gate.getFestivalTicketsType().peek());
    }


    @Test
    public void validateTicketTest2() {
        FestivalGate gate = new FestivalGate();

        FestivalAttendeeThread festivalAttendee = new FestivalAttendeeThread(TicketType.ONE_DAY_VIP, gate);
        festivalAttendee.run();

        assertEquals(TicketType.ONE_DAY_VIP, gate.getFestivalTicketsType().peek());
    }


    @Test
    public void addMultipleTickets1() {
        FestivalGate gate = new FestivalGate();
        Integer numberOfTickets = 10;

        for (int i = 1; i <= 10; i++) {
            FestivalAttendeeThread festivalAttendeeThread = new FestivalAttendeeThread(TicketType.randomTicketType(), gate);
            festivalAttendeeThread.run();
        }

        assertEquals(numberOfTickets,gate.getFestivalTicketsType().size());
    }


    @Test
    public void addMultipleTickets2() {
        FestivalGate gate = new FestivalGate();
        Integer numberOfTickets = 100;

        for (int i = 1; i <= 100; i++) {
            FestivalAttendeeThread festivalAttendeeThread = new FestivalAttendeeThread(TicketType.randomTicketType(), gate);
            festivalAttendeeThread.run();
        }

        assertEquals(numberOfTickets,gate.getFestivalTicketsType().size());
    }




}
