package siit.homework01;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestNrArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int arrLength;
        System.out.println("Enter the number of elements you want in the array: ");
        arrLength = keyboard.nextInt();
        int[] arr = new int[arrLength];

        System.out.println("Enter all the elements: ");
        for (int i = 0; i < arrLength; i++) {
            arr[i] = keyboard.nextInt();
        }

        System.out.println("The number in the array are: " + Arrays.toString(arr));

        int smallest = ArrayFunction.smallestArr(arrLength, arr);

        System.out.println(" ");
        System.out.println("The smallest number in the array is: " + smallest);

    }

}
