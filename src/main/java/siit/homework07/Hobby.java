package siit.homework07;

import java.util.List;

public class Hobby {

    private final String nameOfTheHobby;
    private final int frequencyPerWeek;
    List<HobbyAddress> hobbyAddresses;

    public Hobby(String nameOfTheHobby, int frequencyPerWeek, List<HobbyAddress> hobbyAddresses) {
        this.nameOfTheHobby = nameOfTheHobby;
        this.frequencyPerWeek = frequencyPerWeek;
        this.hobbyAddresses = hobbyAddresses;
    }

    @Override
    public String toString() {
        return " " + nameOfTheHobby + " " + hobbyAddresses;
    }
}
