package day01JUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test06_DisplayName {

    // Method name should be understandable. If it's too long or if you need to explain it in different way, then you can use @DisplayName

    @DisplayName("Exception if Integer.parseInt() is not an Integer.")
    @Test
    void testException(){
        String str = "Hello1234";
        assertThrows(NumberFormatException.class, ()-> {
            Integer.parseInt(str);
        });
    }

}
