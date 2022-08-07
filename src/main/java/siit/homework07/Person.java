package siit.homework07;

import java.util.Objects;

public class Person {

    private final String name;
    private final Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }


}

