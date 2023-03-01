package day02;

public class Task02CheckFirstAndLastTwoCharsSame {

    /*
        Write a method which checks if first and last 2 chars of a String is same.
        BABA -> true
        AAA -> true.
     */

    public boolean checkFirstAndLastTwoCharsSame(String str){
        if (str.substring(0,2).equals(str.substring(str.length()-2))){
            return true;
        } return false;
    }

}
