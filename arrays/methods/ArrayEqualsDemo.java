package arrays.methods;

import java.util.Arrays;

/*
 Program: ArrayEqualsDemo
 Purpose: Demonstrate Arrays.equals() usage
 Concept: Built-in method to compare two arrays element-by-element
*/

public class ArrayEqualsDemo {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {10, 20, 30, 40};
        int[] arr3 = {10, 20, 30, 50};

        // Compare arrays
        boolean result1 = Arrays.equals(arr1, arr2);
        boolean result2 = Arrays.equals(arr1, arr3);

        System.out.println("arr1 and arr2 equal? " + result1);
        System.out.println("arr1 and arr3 equal? " + result2);
    }
}
