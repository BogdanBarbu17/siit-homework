package siit.homework01;

import java.util.Scanner;

public class MaxDigit {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int number, userNumber;

        System.out.println("Input your number: ");
        userNumber = Input.getaInt(keyboard);
        number = userNumber;

        int maxDigit = MaxDigitFunction.getMaxDigit(number);

        System.out.println("The max digit from the number " + userNumber + " is " + maxDigit);

    }

}
