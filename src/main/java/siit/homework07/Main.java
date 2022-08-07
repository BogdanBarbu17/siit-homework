package siit.homework07;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        Person person1 = new Person("Jane Doe", 24);
        Person person2 = new Person("Martin Doe", 37);
        Person person3 = new Person("Houston",84);
        Person person4 = new Person("Karen",18);
        Person person5 = new Person("Karen",18);


        System.out.println();
        System.out.println("=============== Set by age ==============");
        System.out.println();

        Set<Person> personSet1 = new TreeSet<>(new PersonAgeComparator());

        personSet1.addAll(Arrays.asList(person1,person2,person3,person4,person5));

        for (Person person : personSet1) {
            System.out.println(person);
        }


        System.out.println();
        System.out.println("============== Set by name ==============");
        System.out.println();

        Set<Person> personSet2 = new TreeSet<>(new PersonNameComparator());

        personSet2.addAll(personSet1);

        for (Person person : personSet2) {
            System.out.println(person);
        }




    }
}
