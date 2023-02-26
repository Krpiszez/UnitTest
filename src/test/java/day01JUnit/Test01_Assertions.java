package day01JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test01_Assertions {

    @Test
    public void test01(){

    }
    /*
        Starting form JUnit5, we do not need to explicitly type public access modifier for methods.
        testMethod name is suggested to start as => "testNameOfMethod".
     */
    @Test
    void testLength(){
        String str = "Hello World";
        int actualValue = str.length();
        int expectedValue = 11;
        assertEquals(expectedValue, actualValue);
    }

    // Test upperCase method from String class.

    @Test
    void testUpperCase(){
        String str = "hello";
        String actualStr = str.toUpperCase();
        String expectedStr = "HELLO";
        assertEquals(actualStr, expectedStr, "UpperCase method has failed!");
    }

    // Testing Math.addExact();

    @Test
    void testAddExact(){
        int num1 = 10;
        int num2 = 13;
        int actualVal = Math.addExact(num2,num1);
        int expectedVal = 23;
        int expectedValInJava = num2+num1;
        assertEquals(actualVal, expectedVal);
        assertEquals(actualVal, expectedValInJava, expectedVal);
    }

    // We do not need to create variables each time. Values can be injected to assertEquals() method directly.

    @Test
    void testContains(){
        assertEquals(true, "Hello".contains("e"), "Does not contain 'a'!");
        assertTrue("Hello".contains("l"));
    }


}
