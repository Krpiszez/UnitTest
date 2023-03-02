package day02JUnit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task02CheckFirstAndLastTwoCharsSameTest {

    Task02CheckFirstAndLastTwoCharsSame charsSame = new Task02CheckFirstAndLastTwoCharsSame();


    @ParameterizedTest
    @CsvSource(value = {
            "true, AAA",
            "false, ABC",
            "true, BABA"
    })
    void checkFirstAndLastTwoCharsSame(boolean value, String str) {
        assertEquals(value, charsSame.checkFirstAndLastTwoCharsSame(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"AAA", "BBB", "BABA"})
    void checkFirstAndLastTwoCharsSame(String str) {
        assertTrue(charsSame.checkFirstAndLastTwoCharsSame(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"BAAA", "BSBB", "BABDA"})
    void checkFirstAndLastTwoCharsNotSame(String str) {
        assertFalse(charsSame.checkFirstAndLastTwoCharsSame(str));
    }
}