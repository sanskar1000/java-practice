package arrays.methods;

import java.util.Arrays;

/*
 Program: ArraySort
 Purpose: Sort an array using Arrays.sort()
 Concept: Built-in Array class method
*/

public class ArraySort {

    public static void main(String[] args) {

        int[] arr = {50, 20, 90, 10, 40};

        System.out.print("Original Array: ");
        for (int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
        }
      
        Arrays.sort(arr);
      
         System.out.println();   
         System.out.print("Sorted Array:");
         for (int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
        }
    }
}
