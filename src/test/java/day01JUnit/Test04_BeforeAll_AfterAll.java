package day01JUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Test04_BeforeAll_AfterAll {

    @BeforeAll
    static void beforeAll(){
        System.out.println("beforeAll() is executed...");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("afterAll() is executed...");
    }

    @Test
    void testArrays1(TestInfo info){
        String str = "Unit Test with Junit";

        String [] actualArray = str.split(" ");
        String [] expectedArray = {"Unit", "Test", "with", "Junit"};
        System.out.println(info.getDisplayName()+ "executed");
        assertArrayEquals(expectedArray, actualArray, "arrays are not equal");
    }

    @Test
    void testArrays2(TestInfo info){
        String str = "Test name should be readable";

        String [] actualArray = str.split(" ");
        String [] expectedArray = {"Test", "name", "should", "be", "readable"};
        System.out.println(info.getDisplayName()+ "executed");
        assertArrayEquals(expectedArray, actualArray, "arrays are not equal");
    }

}