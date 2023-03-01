package day02JUnit;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test04GroupTesting {
    // we can have group related test within the same class to make our tests , classes more readable. For similar test groups
    // we create different classes and it becomes more organized in result and class level.

    @Nested
    class testMultiply{
        @ParameterizedTest
        @CsvSource(value = {
                "-12, 3, -4",
                "-12, -3, 4",
                "12, -3, -4",
                "12, 3, 4"
        })
        void testMultiplicationWithNoneZero(int result, int num1, int num2){
            assertEquals(result, Math.multiplyExact(num1, num2));
        }

    @ParameterizedTest
    @CsvSource(value = {
            "0, 3, 0",
            "-0, 0, 4",
            "0, -3, 0",
            "0, 0, -4"
    })
    void testMultiplicationWithZero(int result, int num1, int num2){
        assertEquals(result, Math.multiplyExact(num1, num2));
    }

} // end of first group

    @Nested
    class testSum{
        @ParameterizedTest
        @CsvSource(value = {
                "-1, 3, -4",
                "1, -3, 4",
                "-7, -3, -4",
                "7, 3, 4"
        })
        void testSumWithNoneZero(int result, int num1, int num2){
            assertEquals(result, Math.addExact(num1, num2));
        }

        @ParameterizedTest
        @CsvSource(value = {
                "-4, 0, -4",
                "0, -4, 4",
                "-3, -3, 0",
                "4, 0, 4"
        })
        void testSumWithZero(int result, int num1, int num2){
            assertEquals(result, Math.addExact(num1, num2));
        }
    }// end of second group

}
