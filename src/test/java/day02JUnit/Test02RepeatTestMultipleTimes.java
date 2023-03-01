package day02JUnit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test02RepeatTestMultipleTimes {

    @RepeatedTest(3)
    void testSubstring(){
        assertEquals("Java", "Java is important".substring(0,4));
        System.out.println("testSubstring method is executed!");
    }

    //test for Math.addExact()
    @RepeatedTest(5)
    void testRepeated(){
        assertEquals(2, Math.addExact(1,1));
    }

    Random rn = new Random();
    @RepeatedTest(5) // this is a kind of iteration again here below we do our test with different values, so it makes our test more reliable ?
    @Disabled // here this annotation makes this test method not run when you run the entire class(it is used when you want to run whole class
              //but when this method for example is not ready. )
    void testMathExactWithRandomNumbers(){
        int num1 = rn.nextInt(10);
        int num2 = rn.nextInt(10);
        assertEquals(num1 + num2, Math.addExact(num1, num2));
        System.out.println("num1 " + num1 + " num2 " + num2);
    }

}
