package arrays.methods;

import java.util.Arrays;

/*
 Program: BinarySearchDemo
 Purpose: Demonstrate Arrays.binarySearch() usage
 Concept: Built-in array method for searching
*/

public class BinarySearchDemo {

    public static void main(String[] args) {

        int[] arr = {40, 10, 50, 30, 20};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));

        // Sort the array before searching
        Arrays.sort(arr);

        System.out.println("\nSorted array:");
        System.out.println(Arrays.toString(arr));

        int key = 30;

        // Perform binary search
        int result = Arrays.binarySearch(arr, key);

        if (result >= 0) {
            System.out.println("\nElement " + key + " found at index: " + result);
        } else {
            System.out.println("\nElement " + key + " not found in the array.");
        }
    }
}
