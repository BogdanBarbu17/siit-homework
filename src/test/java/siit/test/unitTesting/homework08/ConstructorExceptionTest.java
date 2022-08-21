package siit.test.unitTesting.homework08;

import org.junit.jupiter.api.Test;
import siit.homework08.Gender;
import siit.homework08.Student;

import static org.junit.jupiter.api.Assertions.*;

public class ConstructorExceptionTest {

    @Test
    void testFirstNameInput1() {

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new Student("", "Doe", 2000, Gender.M, "1"));

        String expected = "First name is invalid";
        String actual = exception.getMessage();
        assertEquals(actual, expected);

    }

    @Test
    void testFirstNameInput2() {

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new Student(" ", "Doe", 2002, Gender.M, "1"));

        String expected = "First name is invalid";
        String actual = exception.getMessage();
        assertEquals(expected, actual);

    }

    @Test
    void testLastNameInput1() {

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new Student("John", "", 2002, Gender.M, "1"));

        String expected = "Last name is invalid";
        String actual = exception.getMessage();
        assertEquals(expected, actual);

    }

    @Test
    void testLastNameInput2() {

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new Student("John", " ", 2002, Gender.M, "1"));

        String expected = "Last name is invalid";
        String actual = exception.getMessage();
        assertEquals(expected, actual);

    }

    @Test
    void testDateOfBirth1() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new Student("John", "Doe", 1800, Gender.M, "1"));

        String expected = "Date of birth is invalid";
        String actual = exception.getMessage();
        assertEquals(expected, actual);

    }

    @Test
    void testID1() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new Student("John", "Doe", 2000, Gender.M, ""));

        String expected = "ID is invalid";
        String actual = exception.getMessage();
        assertEquals(expected, actual);

    }

    @Test
    void testID2() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new Student("John", "Doe", 2000, Gender.M, " "));

        String expected = "ID is invalid";
        String actual = exception.getMessage();
        assertEquals(expected, actual);

    }


}
