package day03.sumofdigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitsTest {
    @Test
    void testGetSumOfDigits(){
        SumOfDigits sumOfDigits = new SumOfDigits();

        assertEquals(21, sumOfDigits.getSumOfDigits(123456));
    }
}