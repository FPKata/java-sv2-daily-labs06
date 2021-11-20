package day03.teahouse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//class TeaTest {
//    Tea secondTea;
//
//    @BeforeEach
//    void init(){
//        secondTea = new Tea("Earl Grey", 1837, Sort.BLACK_TEA);
//    }
//
//    @Test
//    void createTest(){
//        Tea thirdTea = new Tea("Earl Grey", 1837, Sort.BLACK_TEA);
//
//        assertEquals("Earl Grey", thirdTea.getName());
//        assertEquals(1837, thirdTea.getPrice());
//        assertEquals(Sort.BLACK_TEA, thirdTea.getSort());
//    }
//
//    @Test
//    void testToString(){
//        assertEquals("Earl Grey: élénkítő hatású (1837 Ft)", secondTea.toString());
//        // assertTrue(secondTea.toString().startsWith("Earl"));
//        // assertEquals(true, secondTea.toString().startsWith("Earl");
//    }
//}