package day01JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test05_TestingExceptions {

    @Test
    void testException(){
        String str = "Java apps are tested by JUnit";
        assertThrows(NullPointerException.class, ()->{
            System.out.println("testException() is executed!");
            str.length();
        });
    }

    @Test
    void testException2(){
        int num1 = 0;
        int num2 = 5;

        assertThrows(ArithmeticException.class, ()->{ // here this exception will be thrown so test passes.
                                                      // It works with RunTimeException as well!
            System.out.println("testException() is executed!");
            int res = num2/num1;
        });
    }

    @Test
    void testException3(){
        int num1 = 1;
        int num2 = 0;

        assertThrows(ArithmeticException.class, ()-> divide(num1, num2));
    }

    private int divide(int num1, int num2){
        return num1/num2;
    }
}
