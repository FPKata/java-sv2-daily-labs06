package day02.perfectnumbers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PerfectNumbersTest {

    @Test
    void testPerfectNumber(){
        PerfectNumbers perfectNumbers = new PerfectNumbers();

//        boolean result = perfectNumbers.isPerfectNumber(8128);
//        assertEquals(true, result);  //assertTrue(result);

        assertTrue(perfectNumbers.isPerfectNumber(8128));
        assertTrue(perfectNumbers.isPerfectNumber(6));

        assertFalse(perfectNumbers.isPerfectNumber(10));
        assertFalse(perfectNumbers.isPerfectNumber(100));
    }
}