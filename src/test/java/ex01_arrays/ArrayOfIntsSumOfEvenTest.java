package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfIntsSumOfEvenTest {

    @Test
    void sumOfEven() {
        ArrayOfInts arrayOfInts = new ArrayOfInts();
        int sumOfEven = arrayOfInts.sumOfEven(new int[]{1,2,3,4,6});

        assertEquals(12, sumOfEven);
    }

    @Test
    void sumOfEven_nullParameter_returns0() {
        ArrayOfInts arrayOfInts = new ArrayOfInts();
        int sumOfEven = arrayOfInts.sumOfEven(null);

        assertEquals(0, sumOfEven);
    }

}