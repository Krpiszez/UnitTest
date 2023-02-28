package day01JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SomeReviews {


    @Test
    void testSubstring(){
        String str = "I love Java";
        String expected = getSubstring(str, 7);
        String actual = "Java";
        assertTrue(expected.equals(actual));
        assertEquals(expected, actual);
    }

    @Test
    void testSomeManipulations(){
        String pwd = "A123&xzca";
        boolean flag = false;
        if (pwd.replaceAll("\\p{Punct}", "").length() == pwd.length()){
            flag = false;
        } else if (pwd.charAt(0)>='A' && pwd.charAt(0)<='Z') {
            flag = true;
        } else if (pwd.charAt(pwd.length()-1)>='a' && pwd.charAt(pwd.length()-1)<='z') {
            flag = true;
        }

        assertTrue(flag);
    }

    String getSubstring(String str, int from){
        return str.substring(from);
    }
}
