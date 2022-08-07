package siit.homework07;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {

        HobbyAddress addressUS = new HobbyAddress("Phoenix, Philadelphia", "U.S.");
        HobbyAddress addressSpain = new HobbyAddress("Puerto Real, El Puerto de Santa Maria ", "Spain");
        HobbyAddress addressItaly = new HobbyAddress("Florence, Verona", "Italy");
        HobbyAddress addressCanada = new HobbyAddress("Ottawa, Toronto", "Canada");


        List<HobbyAddress> cyclingAddress = new ArrayList<>(Arrays.asList(addressItaly, addressSpain));
        List<HobbyAddress> skiingAddress = new ArrayList<>(Arrays.asList(addressCanada, addressItaly));
        List<HobbyAddress> runningAddress = new ArrayList<>(Arrays.asList(addressUS, addressSpain));
        List<HobbyAddress> swimmingAddress = new ArrayList<>(Arrays.asList(addressSpain, addressItaly));


        Hobby cycling = new Hobby("Cycling", 4, cyclingAddress);
        Hobby skiing = new Hobby("Skiing", 2, skiingAddress);
        Hobby running = new Hobby("Running", 5, runningAddress);
        Hobby swimming = new Hobby("Swimming", 1, swimmingAddress);


        List<Hobby> person1Hobbies = new ArrayList<>(Arrays.asList(swimming, running));
        List<Hobby> person2Hobbies = new ArrayList<>(Arrays.asList(skiing));
        List<Hobby> person3Hobbies = new ArrayList<>(Arrays.asList(cycling, skiing));
        List<Hobby> person4Hobbies = new ArrayList<>(Arrays.asList(running));


        Map<Person, List<Hobby>> personHobbies = new HashMap<>();


        Person person1 = new Person("Jane Doe", 24);
        Person person2 = new Person("Martin Doe", 37);
        Person person3 = new Person("Houston", 84);
        Person person4 = new Person("Karen", 18);


        personHobbies.put(person1, person1Hobbies);
        personHobbies.put(person2, person2Hobbies);
        personHobbies.put(person3, person3Hobbies);
        personHobbies.put(person4, person4Hobbies);

        personHobbies.forEach((key, value) -> System.out.println(key + " " + value));

       /* for(Map.Entry<Person,List<Hobby>> entry: personHobbies.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        */


    }

}
