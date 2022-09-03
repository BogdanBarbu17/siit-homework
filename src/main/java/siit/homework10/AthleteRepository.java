package siit.homework10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AthleteRepository {

    List<String> list = new ArrayList<>();
    Collection<List<String>> partitionedList;
    List<Athlete> athleteList = new ArrayList<>();


    /***
     * reads the file line by line and then splits them by ","  and adds them to the list
     * after that removes the blank spaces witch it is fact a "\n" at the end of each line
     * @param fileName file to be read
     */
    public  void readFile(String fileName){

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            list = stream
                    .flatMap(line -> Stream.of(line.split(",")))
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 7; i < list.size(); i += 7) {
            list.remove(i);
        }
        partStrings();
        addAthletesToList();
    }


    /***
     * takes  the elements in the list and groups them in arrays of 7 elements
     * then adds them to a collection witch every element consists of an array of 7 strings
     */
    public void partStrings (){
        List<String> finalList = list;
        int partitionSize = 7;
         partitionedList = IntStream.range(0, list.size())
                .boxed()
                .collect(Collectors.groupingBy(partition -> (partition / partitionSize), Collectors.mapping(finalList::get, Collectors.toList())))
                .values();

    }


    /***
     * first copy the collection in a list
     * iterates the list and assigns the element to the parameters of the object athlete
     * then adds them to a list
     */
    public void addAthletesToList (){
        ArrayList<List<String>> newList = new ArrayList<>(partitionedList);

        for (int i = 0; i < newList.size(); i++) {
            Athlete athlete = new Athlete();
            athlete.setAthleteNumber(Integer.parseInt(newList.get(i).get(0)));
            athlete.setAthleteName(newList.get(i).get(1));
            athlete.setCountryCode(newList.get(i).get(2));
            athlete.setSkiTimeResult(timeScore(newList.get(i).get(3)));
            athlete.setFirstShootingRange(newList.get(i).get(4));
            athlete.setSecondShootingRange(newList.get(i).get(5));
            athlete.setThirdShootingRange(newList.get(i).get(6));
            athlete.setFinalTimeResult();
            athleteList.add(athlete);
        }

    }


    /***
     * takes the input splits it and parse it in a duration type variable
     * @param input input to pe parsed
     * @return
     */
    public  Duration timeScore(String input) {
        Duration time = Duration.ofSeconds(Arrays.stream(input.split(":"))
                .mapToInt(Integer::parseInt)
                .reduce(0, (n, m) -> n * 60 + m));
        return time;
    }


    /***
     * copy the list of athletes in a tree set witch order the elements by the final time comparator
     * then print the winners by getting the first element printing it and removing it
     * MAY BE  the printing should be done using a list for a better performances !!!!
     */
    public void printWinners(){

        TreeSet<Athlete> athleteTreeSet = new TreeSet<>(new AthleteFinalTimeComparator());
        athleteTreeSet.addAll((athleteList));

        System.out.println("Winner: " +  athleteTreeSet.first());
        athleteTreeSet.remove(athleteTreeSet.first());

        System.out.println("Runner-up: " +  athleteTreeSet.first());
        athleteTreeSet.remove(athleteTreeSet.first());

        System.out.println("Third Place: " +  athleteTreeSet.first());
        athleteTreeSet.remove(athleteTreeSet.first());

    }


















}
