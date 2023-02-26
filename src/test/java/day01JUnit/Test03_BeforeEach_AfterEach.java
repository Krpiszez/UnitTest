package day01JUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test03_BeforeEach_AfterEach {

    /*
        @BeforeEach and @AfterEach mean the annotated method should be executed
        before or after each @Test method in the Test class.

     */

    String str;

    @BeforeEach
    void beforeEach(){
        str = "Test methods should be simple";
        System.out.println("beforeEach() is executed. Value of str is: " + str);
    }

    @AfterEach
    void afterEach(){
        str = "";
        System.out.println("afterEach() is executed. Value of str is: " + str);
    }

    @Test
    void testArrays(TestInfo info){
        String[] actualArray = str.split(" ");
        String[] expectedArray = {"Test", "methods", "should", "be", "simple"};
        System.out.println(info.getDisplayName() + " executed"); // .getDisplayName() methods indicates the method which is running
        assertTrue(Arrays.equals(actualArray, expectedArray));

    }
    @Test
    void testStringLength(TestInfo info){
        int actualVal = str.length();
        int expectedVal = 29;
        assertEquals(actualVal, expectedVal);
        System.out.println(info.getDisplayName() + " executed");
    }
}
