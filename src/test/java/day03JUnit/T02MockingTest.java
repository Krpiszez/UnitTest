package day03JUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class T02MockingTest {

    T02Mocking dummyObj01;
    @BeforeEach
    void setUp() {
        dummyObj01 = Mockito.mock(T02Mocking.class);
    }

    @Test
    void testMocking(){


        // these are mock objects.
        dummyObj01.saveStudent("Ali");
        dummyObj01.updateStudent("Mustafa");
        dummyObj01.deleteStudent("Okan");

        //lets verify if objects real
        verify(dummyObj01).saveStudent("Ali");
        verify(dummyObj01).updateStudent("Mustafa");
        verify(dummyObj01).deleteStudent("Okan");
    }

    //verify how many times these methods are called
    @Test
    void testHowManyTimesMocksCalled(){
        dummyObj01.saveStudent("Mustafa");
        dummyObj01.saveStudent("Mustafa");
        dummyObj01.saveStudent("Ali");

        verify(dummyObj01, times(2)).saveStudent("Mustafa");
        verify(dummyObj01, times(1)).saveStudent("Ali");
        //to verify never called methods
        verify(dummyObj01, never()).updateStudent("Al");
        verify(dummyObj01, never()).updateStudent(anyString()); //to verify if the method is not called with any argument
        verify(dummyObj01, atLeast(2)).saveStudent("Mustafa"); //verify if the method called minimum twice

    }

    //very execution order of mock obj
    @Test
    void testControlOrderMethods(){
        dummyObj01.saveStudent("Mustafa");
        dummyObj01.deleteStudent("Mustafa");
        dummyObj01.saveStudent("Ali");

        InOrder inOrder = inOrder(dummyObj01);

        inOrder.verify(dummyObj01).saveStudent("Mustafa");
        inOrder.verify(dummyObj01).deleteStudent("Mustafa");
        inOrder.verify(dummyObj01).saveStudent("Ali");

    }


}
