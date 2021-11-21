package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    Store store = new Store();

    @BeforeEach
    void init(){
        store.addProduct(new Product("Milk", Type.DAIRY, 0.7));
        store.addProduct(new Product("Butter", Type.DAIRY, 2.3));
    }

    @Test
    void testNumberOfProductsByOneType(){
        List<ProductWithPiece> result = store.numberOfProductsByType();

        assertEquals(1, result.size());
        assertEquals(Type.DAIRY, result.get(0).getType());
        assertEquals(2, result.get(0).getCount());
    }
}