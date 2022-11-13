package siit.homework12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PersonRepository {

    public void readFile(String fileName, Integer requiredMonth, String outFileName) throws IOException {
        List<String[]> list = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            list = stream
                    .map(line -> line.split(","))
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Person> personList = new ArrayList<>();


        for (String[] strings : list) {
            String firstName = strings[0];
            String lastName = strings[1];
            Integer monthOfBirth = getMonth(strings[2]);

            Person person = new Person(firstName, lastName, monthOfBirth);
            personList.add(person);

        }

        Comparator<Person> byFirstName = Comparator
                .comparing(Person::getFirstName);

        try (BufferedWriter out = new BufferedWriter(new FileWriter(outFileName))) {
            personList.stream()
                    .filter(person -> Objects.equals(person.getMonthOfBirth(), requiredMonth))
                    .sorted(byFirstName)
                    .forEach(person -> {
                        try {
                            out.write(person.toString());
                            out.newLine();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        }
    }


    public Integer getMonth(String dateOfBirth) {
        List<String> month = Arrays.stream(dateOfBirth.split("\\."))
                .collect(Collectors.toList());
        return Integer.parseInt(month.get(1));
    }


}
