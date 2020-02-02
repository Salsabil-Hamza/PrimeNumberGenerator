import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    List<Integer> listOfPrimeNumbersForThirty = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
    List<Integer> listOfPrimeNumbersForTwo = List.of(2);


    @Test
    public void numberIsPrimeTest() {

        assertTrue(Main.isPrime(11));
    }

    @Test
    public void numberIsNotPrimeTest() {

        assertFalse(Main.isPrime(6));
    }

    @Test
    public void primeNumbersOfThirtyTest() {

        assertEquals(listOfPrimeNumbersForThirty, Main.primeNumberGenerator(30));

    }

    @Test
    public void primeNumbersOfTwoTest() {

        assertEquals(listOfPrimeNumbersForTwo, Main.primeNumberGenerator(2));

    }


}