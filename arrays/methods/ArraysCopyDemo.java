package arrays.methods;

import java.util.Arrays;

/*
 Program: ArraysCopyDemo
 Purpose: Demonstrate Arrays.copyOf() method
 Concept: Copy an array or create a resized copy
*/

public class ArraysCopyDemo {

    public static void main(String[] args) {

        int[] original = {10, 20, 30, 40, 50};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(original));

        // Copy same size
        int[] copy1 = Arrays.copyOf(original, original.length);

        System.out.println("\nCopied Array (same size):");
        System.out.println(Arrays.toString(copy1));

        // Copy larger size
        int[] copy2 = Arrays.copyOf(original, 7);

        System.out.println("\nCopied Array (larger size):");
        System.out.println(Arrays.toString(copy2));
    }
}
