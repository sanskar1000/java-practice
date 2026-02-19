package arrays.methods;

import java.util.Arrays;

/*
 Program: ArrayToStringDemo
 Purpose: Display array using Arrays.toString()
 Concept: Built-in Arrays class method
*/

public class ArrayToStringDemo {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        // Normal print (wrong way)
        System.out.println("Normal print:");
        System.out.println(arr);

        // Correct print using Arrays.toString()
        System.out.println("\nUsing Arrays.toString():");
        System.out.println(Arrays.toString(arr));
    }
}
