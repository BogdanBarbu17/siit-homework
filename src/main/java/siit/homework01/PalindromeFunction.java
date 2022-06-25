package siit.homework01;

public class PalindromeFunction {

    public static boolean quickCheck(int palindrome) {
        return palindrome < 0 || ((palindrome % 10 == 0) && palindrome != 0);
    }
    public static Boolean isPalindrome(int palindrome) {
        int temp, check = 0;

        temp = palindrome;
        while (palindrome > 0) {
            int remainder = palindrome % 10;
            check = (check * 10) + remainder;
            palindrome /= 10;
        }

        return temp == check;
    }

}

