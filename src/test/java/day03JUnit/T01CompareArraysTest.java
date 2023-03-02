package day03JUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class T01CompareArraysTest {



    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @MethodSource("arrayArguments")
    void compareArraysEqual(boolean b, Object[] arr1, Object[] arr2) {

        assertEquals(b, T01CompareArrays.compareArraysEqual(arr1, arr2));

    }

    static Stream<Arguments> arrayArguments(){

        Integer[] arr1 = {2,5,7,8};
        Integer[] arr2 = {8,7,5,2};

        String[] srr1 = {"a", "j", "a", "v"};
        String[] srr2 = {"v", "a", "j", "a"};

        Double[] drr1 = {1.3, 2.4, 5.9};
        Double[] drr2 = {2.4, 1.3, 5.9};

        return Stream.of(
                Arguments.of(true, arr1, arr2),
                Arguments.of(true, srr1, srr2),
                Arguments.of(true, drr1, drr2)
        );

    }
}