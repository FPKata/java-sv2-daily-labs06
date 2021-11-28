package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    Human human;
    @Test
    void testIsNameValid(){
        Human human = new Human("Kis Éva", 1999);
        boolean result = human.isNameValid(human.getName());
        assertTrue(result);
    }

    @Test
    void testIsNameValidWithNull(){
        Human human = new Human(null, 1999);
        assertThrows(IllegalArgumentException.class, () -> human.isNameValid(human.getName()));
        //assertEquals("Invalid name", iae.getMessage());
    }

    @Test
    void testIsNameValidWithWrongName(){
        Human human = new Human("KisÉva", 1999);

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> human.isNameValid(human.getName()));
        assertEquals("Invalid name", iae.getMessage());
    }
}