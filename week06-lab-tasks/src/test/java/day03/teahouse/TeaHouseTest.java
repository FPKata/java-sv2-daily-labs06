package day03.teahouse;

//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.time.LocalTime;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class TeaHouseTest {
//    TeaHouse teaHouse;
//    @BeforeEach
//    void init(){
//        teaHouse = new TeaHouse("Vörös oroszlán", LocalTime.of(11,0,0),
//                LocalTime.of(22,0,0));
//        Tea firstTea = new Tea("A nagyi lekvárja", 1567, Sort.FRUIT_TEA);
//        Tea secondTea = new Tea("Earl Grey", 1837, Sort.BLACK_TEA);
//        Tea thirdTea = new Tea("Afrikai szavanna", 2431, Sort.ROOIBOS_TEA);
//        teaHouse.addTea(firstTea);
//        teaHouse.addTea(secondTea);
//        teaHouse.addTea(thirdTea);
//    }
//
//    @Test
//    void testCreate(){
//        TeaHouse anotherteaHouse = new TeaHouse("Vörös oroszlán", LocalTime.of(12,0,0),
//                LocalTime.of(23,30,0));
//
//        assertEquals("Vörös oroszlán", anotherteaHouse.getName());
//        assertEquals(LocalTime.of(12,0,0), anotherteaHouse.getOpenTime());
//        assertEquals(true, anotherteaHouse.getCloseTime().equals(LocalTime.of(23,30,0)));
//        assertEquals(2, anotherteaHouse.getTeas().size());
//    }
//
//    @Test
//    void testAddTea(){
//        Tea fourthTea = new Tea("Lipton", 1500, Sort.BLACK_TEA);
//        teaHouse.addTea(fourthTea);
//        assertEquals(6, teaHouse.getTeas().size());
//        assertEquals("Lipton", teaHouse.getTea().get(5).getName());
//        assertEquals(1500, teaHouse.getTeas().get(5).getPrice());
//        assertSame(fourthTea, teaHouse.getTeas().get(5));
//    }
//
//    @Test
//    void testAveragePrice(){
//        assertEquals(1767.2, teaHouse.getAveragePrice());
//    }
//
//    @Test
//    void testSetActionPrices(){
//        teaHouse.setActionPrices(Sort.FRUIT_TEA, 30);
//
//        assertEquals(1221, teaHouse.getTeas().get(1).getPrice());  //FRUIT_TEA
//        assertEquals(1256, teaHouse.getTeas().getPrice());  //HERBAL_TEA
//        assertEquals(1568.2, teaHouse.getAveragePrice());
//    }
//}