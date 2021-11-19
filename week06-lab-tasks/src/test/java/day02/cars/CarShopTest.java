package day02.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarShopTest {

    CarShop carShop = new CarShop("BestCars", 100);

    @BeforeEach
    void init(){
        carShop.addCar(new Car("Toyota", 1.2, Color.BLUE, 90));
        carShop.addCar(new Car("Toyota", 1.2, Color.BLUE, 120));
        carShop.addCar(new Car("Toyota", 1.2, Color.BLUE, 70));
    }

    @Test
    void createCarShopTest(){
        CarShop carShop = new CarShop("BestCars", 100);  //ez elfedi a BeforeEach-et

        assertEquals("BestCars", carShop.getName());
        assertEquals(100, carShop.getMaxPrice());
        assertEquals(0, carShop.getCarsForSell().size());  //létrejön-e az üres lista
    }

    @Test
    void addCarWithValidPriceTest(){
        boolean result =  carShop.addCar(new Car("Toyota", 1.2, Color.BLUE, 99));

        assertTrue(result);
        assertEquals(3, carShop.getCarsForSell().size());
        assertEquals("Toyota", carShop.getCarsForSell().get(0).getBrand());
    }

    @Test
    void addCarWithInvalidPriceTest(){
        boolean result = carShop.addCar(new Car("Toyota", 1.2, Color.BLUE, 101));

        assertFalse(result);
        assertEquals(2, carShop.getCarsForSell().size());
    }

    @Test
    void sumPriceOfCarsTest(){
        assertEquals(160, carShop.sumCarPrice());
    }

    @Test
    void numberOfCarsCheaperThan(){
        assertEquals(2, carShop.numberOfCarsCheaperThan(100));
    }
}