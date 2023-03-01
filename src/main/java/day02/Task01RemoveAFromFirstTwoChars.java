package day02;

public class Task01RemoveAFromFirstTwoChars {

    public static void main(String[] args) {
        System.out.println(deleteAIfItIsFoundInFirstTwoChars("BA"));
    }

    /*
    write a method which removes "A" from a String, if "A"
    is found in first 2 characters of the String

    Note: all characters will be in capital
        AABB  --> BB
        ABAB --> BAB
        AA -->
        BA -->B

     */

    public static String deleteAIfItIsFoundInFirstTwoChars(String str){
        str = str.substring(0,2).replaceAll("A", "") + str.substring(2);
        return str;
    }



}
