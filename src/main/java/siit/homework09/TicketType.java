package siit.homework09;

import java.util.Random;

public enum TicketType {

    FULL,
    FULL_VIP,
    FREE_PASS,
    ONE_DAY,
    ONE_DAY_VIP;


    private static final Random PRNG = new Random();
    private static final TicketType[] ticketTypes = values();

    /***
     * this method returns a random enum value
     * @return random enum value
     */
    public static TicketType randomTicketType() {
        return ticketTypes[PRNG.nextInt(ticketTypes.length)];
    }


}
