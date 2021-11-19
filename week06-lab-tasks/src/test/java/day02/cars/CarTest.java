package day02.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car = new Car("Toyota", 1.2, Color.BLUE, 120);

    @Test
    void createCarTest(){
        Car car = new Car("Toyota", 1.2, Color.BLUE, 120);

        assertEquals("Toyota", car.getBrand());
        assertEquals(1.2, car.getEngineSize());
        assertEquals(Color.BLUE, car.getColor());
        assertEquals(120, car.getPrice());
    }

    @Test
    void decreasePriceTest(){
        car.decreasePrice(10);

        assertEquals(108, car.getPrice());
    }

    @Test
    void decreasePriceWithWrongPercent(){
        car.decreasePrice(-10);  //W
        assertEquals(120, car.getPrice());

        car.decreasePrice(100);
        assertEquals(120, car.getPrice());
    }
}