package siit.homework01;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input a number: ");
        int number = Input.getaInt(keyboard);

        System.out.println("Prime numbers less than " + number + " are: ");
        for (int i = 2; i < number + 1; i++) {
            if (PrimeFunctions.isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

}


