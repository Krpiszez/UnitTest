package day01JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SomeReviews {


    @Test
    void testSubstring(){
        String str = "I love Java";
        String expected = getSubstring(str, 7);
        String actual = "Java";
        assertTrue(expected.equals(actual));
        assertEquals(expected, actual);
    }

    String getSubstring(String str, int from){
        return str.substring(from);
    }
}
