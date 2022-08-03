package siit.test.unitTesting.homework06;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import siit.homework06.Calculator;
import siit.homework06.ConversionException;

public class CalculatorTest {

    @Test
    public void test_calculator1() throws ConversionException {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(800000.1,calculator.calculateFinal("80 km + 1 cm","dm"));
    }


    @Test
    public void test_calculator2() throws ConversionException {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(50000,calculator.calculateFinal("70 m - 20 m",""));
    }


    @Test
    public void test_calculator3() throws ConversionException {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(-0.0493,calculator.calculateFinal("70 cm - 50 m","km"));
    }


    @Test
    public void test_calculator4() throws ConversionException {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(125000.0,calculator.calculateFinal("50 dm + 120 m"," "));
    }



}
