package day02JUnit;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Test03PerformanceTest {

    // test method performance which will print elements of integer array

    @Test
    void testPrintPerformance(){
        assertTimeout(Duration.ofSeconds(1), // here we are checking if our method (or program) is working in expected time.
                ()-> IntStream.rangeClosed(1, 100000).forEach(System.out::println));
    }

    @Test
    void testPerformanceAddExact(){
        assertTimeout(Duration.ofSeconds(1),
                ()-> IntStream.rangeClosed(1, 60000).reduce((t, u)-> Math.addExact(t,u)));
    }

}
