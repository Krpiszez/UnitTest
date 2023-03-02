package day03JUnit;

import java.util.Arrays;

public class T01CompareArrays {



    public static boolean compareArraysEqual(Object[] arr1, Object[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

}
