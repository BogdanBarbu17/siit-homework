package siit.homework10;

import java.time.Duration;

public class Athlete {

    private int athleteNumber;
    private String athleteName;
    private String countryCode;
    private Duration skiTimeResult;
    private String firstShootingRange;
    private String secondShootingRange;
    private String thirdShootingRange;
    private Duration finalTimeResult ;

    public Athlete() {

    }


    /***
     * calculates the final time score of each athlete by parsing the previous time seconds
     * then adds the missed shoots multiplied by 10 seconds for each shoot missed
     * @return final score time
     */
    public Duration calculateFinalTimeResult() {
       // assert firstShootingRange != null;
       // assert secondShootingRange != null;
       // assert thirdShootingRange != null;
        long finalCount = calculateOccurrencesOfMisses(firstShootingRange) + calculateOccurrencesOfMisses(secondShootingRange) + calculateOccurrencesOfMisses(thirdShootingRange);
        long secondsToBeAdded = finalCount * 10;
        //assert skiTimeResult != null;
        finalTimeResult = Duration.ofSeconds(skiTimeResult.getSeconds() + secondsToBeAdded)  ;
        return finalTimeResult;
    }


    /***
     * counts how many times the "o" appear in the given input
     * @param input input to go through
     * @return
     */
    public long calculateOccurrencesOfMisses(String input) {
        long count = input.chars().filter(ch -> ch == 'o').count();
        return count;

    }


    public void setFinalTimeResult() {
        this.finalTimeResult = calculateFinalTimeResult();
    }

    public Duration getFinalTimeResult() {
        return finalTimeResult;
    }

    public void setAthleteNumber(int athleteNumber) {
        this.athleteNumber = athleteNumber;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setSkiTimeResult(Duration skiTimeResult) {
        this.skiTimeResult = skiTimeResult;
    }

    public void setFirstShootingRange(String firstShootingRange) {
        this.firstShootingRange = firstShootingRange;
    }

    public void setSecondShootingRange(String secondShootingRange) {
        this.secondShootingRange = secondShootingRange;
    }

    public void setThirdShootingRange(String thirdShootingRange) {
        this.thirdShootingRange = thirdShootingRange;
    }


    @Override
    public String toString() {
        return "Athlete = { "
                + athleteNumber + " "
                + athleteName + " "
                + countryCode + " "
                + ((skiTimeResult.getSeconds() % (60 * 60)) / 60) + ":"
                + (skiTimeResult.getSeconds() % 60) + " "
                + firstShootingRange + " "
                + secondShootingRange + " "
                + thirdShootingRange + " "
                + ((finalTimeResult.getSeconds() % (60 * 60)) / 60) + ":"
                + (finalTimeResult.getSeconds() % 60) +
                " }";

    }




}




