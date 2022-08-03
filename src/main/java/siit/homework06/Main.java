package siit.homework06;


public class Main {

    public static void main(String[] args) throws ConversionException {

        Calculator calculator = new Calculator();

        String input1 = "10 cm + 1 m - 10 mm";
        String resultIn1 = "km";

        calculator.calculateFinal(input1, resultIn1);


        String input2 = "2000 cm + 1 m - 10 mm";
        String resultIn2 = "";

        calculator.calculateFinal(input2, resultIn2);

    }

}



