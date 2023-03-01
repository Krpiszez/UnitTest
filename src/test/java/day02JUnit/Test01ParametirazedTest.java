package day02JUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test01ParametirazedTest {

    // test length of String if it's greater than 0
    @Test
    void testLength(){ // Here we have repetition...
        assertTrue("Otgo".length()>0);
        assertTrue("Ali".length()>0);
        assertTrue("Mustafa".length()>0);
        assertTrue("Okan".length()>0);
    }

    // test similar cases with parameterized test.
    @ParameterizedTest
    @ValueSource(strings = {"Otgo", "Ali", "Mustafe", "Okan"}) // here we specify the string we will have
                                                                // separately in our test methods parameter
    void testLengthUsingParameterizedTest(String str){
        assertTrue(str.length()>0);
    }

    @Test
    void testUpperCase(){
        String str1 = "Hello";
        String str2 = "Java";
        String str3 = "Junit";
        String str4 = "Test";

        assertEquals("HELLO", str1.toUpperCase());
        assertEquals("JAVA", str2.toUpperCase());
        assertEquals("JUNIT", str3.toUpperCase());
        assertEquals("TEST", str4.toUpperCase());
    }

    @ParameterizedTest
    @CsvSource(value = { // here this annotation is for using multiple parameters to check in test method.
            "HELLO, Hello",
            "JAVA, Java",
            "JUNIT, JUnit",
            "TEST, Test"
    })
    void testUppercaseUsingParameterizedTest(String str1, String str2){
        assertEquals(str1, str2.toUpperCase()); // here it is like iteration checks all values in @CsvSource
    }

    //test contains() using parameterizez test

    /*
        if we want to test:
            "java" contains(a) --> assertTrue
            "junit" contains(u)--> assertTrue
            "hello" contains(a)--> assertFalse
     */

    @ParameterizedTest
    @CsvSource(value = {
            "true, java, a",
            "true, unit, u",
            "false, hello, a"
    }) // here again we check for a boolean test so boolean types are added to @CsvSource as Strings here before every "," its considered
    // to be the parameters of our test method.
    void testContainsUsingParameterizedTest(boolean b, String s1, String s2){
        assertEquals(b, s1.contains(s2));
    }
}
