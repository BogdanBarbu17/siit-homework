package siit.homework01;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input any number: ");
        int palindrome = Input.getaInt(keyboard);

        if (PalindromeFunction.quickCheck(palindrome)) {
            System.out.println("This number is not a palindrome!");
            return;
        }

        if (PalindromeFunction.isPalindrome(palindrome)) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }
}
