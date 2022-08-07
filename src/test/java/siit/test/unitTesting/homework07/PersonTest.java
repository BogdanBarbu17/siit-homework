package siit.test.unitTesting.homework07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import siit.homework07.Person;

public class PersonTest {

    @Test
    public void equals_test1() {

        Person person1 = new Person("John", 24);
        Person person2 = new Person("John", 24);

        Assertions.assertEquals(person1, person2);
        Assertions.assertEquals(person1.hashCode(), person2.hashCode());
    }


    @Test
    public void equals_test2() {

        Person person1 = new Person("Martin", 24);
        Person person2 = new Person("Martin", 24);

        Assertions.assertTrue(person1.equals(person2));
    }


    @Test
    public void equals_test3() {

        Person person1 = new Person("Jane", 24);
        Person person2 = new Person("Martin", 24);

        Assertions.assertFalse(person1.equals(person2));
    }


    @Test
    public void equals_test4() {

        Person person1 = new Person("Jane", 32);
        Person person2 = new Person("Jane", 24);

        Assertions.assertFalse(person1.equals(person2));

    }
}
