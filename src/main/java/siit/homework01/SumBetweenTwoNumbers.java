package siit.homework01;

import java.util.Scanner;

public class SumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("This algorithm will calculate the sum of ascending numbers between 'a' and 'b'!");

        System.out.println("Input 'a' :");
        int a = Input.getaInt(keyboard);

        System.out.println("Input 'b' :");
        int b = Input.getaInt(keyboard);

        int sum = CalculateSum.sum(a,b);

        System.out.println("The sum is " + sum + " !");
    }
}
