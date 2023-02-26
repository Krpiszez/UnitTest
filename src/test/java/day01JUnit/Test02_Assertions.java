package day01JUnit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Test02_Assertions {

    @Test
    void testFindMin(){
        assertEquals(14, Math.min(14,17));

        assertTrue(10.5 == Math.min(10.5, 10.6));

        assertFalse(10.5 == Math.min(10.5, 10.4));
    }

    @Test
    void testArray(){
        String str = "Unit testing improves code quality";
        String[] actualArray = str.split(" ");
        String[] expectedArray = {"Unit", "testing", "improves", "code", "quality"};

        assertTrue(Arrays.equals(actualArray, expectedArray));
    }
}
