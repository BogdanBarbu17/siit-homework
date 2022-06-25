package siit.homework01;

public class MaxDigitFunction {
    public static int getMaxDigit(int number) {
        int maxDigit = 0;
        if (number < 0){
            number *= -1;
        }

        while (number > 0){
            int digit = number % 10;

            maxDigit = Math.max(maxDigit, digit);

            number /= 10;
        }
        return (maxDigit);
    }

}
