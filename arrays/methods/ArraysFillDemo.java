package arrays.methods;

import java.util.Arrays;

/*
 Program: ArraysFillDemo
 Purpose: Demonstrate Arrays.fill() method
 Concept: Fill array elements with a specific value
*/

public class ArraysFillDemo {

    public static void main(String[] args) {

        int[] arr = new int[5];

        // Fill whole array with 10
        Arrays.fill(arr, 10);

        System.out.println("After filling with 10:");
        System.out.println(Arrays.toString(arr));

        // Fill part of array (index 1 to 3) with 50
        Arrays.fill(arr, 1, 4, 50);

        System.out.println("\nAfter filling index 1 to 3 with 50:");
        System.out.println(Arrays.toString(arr));
    }
}
