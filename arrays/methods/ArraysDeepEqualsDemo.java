package arrays.methods;

import java.util.Arrays;

/*
 Program: ArraysDeepEqualsDemo
 Purpose: Compare two 2D arrays using Arrays.deepEquals()
 Concept: Built-in method for comparing multi-dimensional arrays
*/

public class ArraysDeepEqualsDemo {

    public static void main(String[] args) {

        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrix3 = {
                {1, 2, 3},
                {4, 5, 9}
        };

        boolean result1 = Arrays.deepEquals(matrix1, matrix2);
        boolean result2 = Arrays.deepEquals(matrix1, matrix3);

        System.out.println("matrix1 vs matrix2: " + result1);
        System.out.println("matrix1 vs matrix3: " + result2);
    }
}
