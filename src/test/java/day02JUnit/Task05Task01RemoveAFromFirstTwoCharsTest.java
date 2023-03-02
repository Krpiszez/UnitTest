package day02JUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
class Task05Task01RemoveAFromFirstTwoCharsTest {

    Task01RemoveAFromFirstTwoChars removeA;

    @BeforeEach
    void setUp() {
        removeA = new Task01RemoveAFromFirstTwoChars();
        System.out.println("@BeforeEach executed");
    }

    @AfterEach
    void tearDown() {
        removeA = null;
        System.out.println("@AfterEach executed");
    }

    @ParameterizedTest
    @CsvSource(value = {"BB, AABB", "BAB, ABAB", "'', AA"})
    void deleteAIfItIsFoundInFirstTwoChars(String expected, String actual) {
        assertEquals(expected, removeA.deleteAIfItIsFoundInFirstTwoChars(actual));
    }
}