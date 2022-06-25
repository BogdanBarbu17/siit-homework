package siit.homework01;

import java.util.Scanner;

public class Input {
    public static Double getaDouble (Scanner keyboard){
        System.out.println("Input a number: ");
        String numberAsString = keyboard.nextLine();
        return Double.parseDouble(numberAsString);
    }

    public static Integer getaInt (Scanner keyboard){
        // System.out.println("Input a number: ");
        String numberAsString = keyboard.nextLine();
        return Integer.parseInt(numberAsString);

    }
}
