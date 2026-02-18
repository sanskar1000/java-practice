package arrays.twoD;

import java.util.Scanner;

/*
 * Program: MatrixSum
 * Purpose: Find sum of all elements in a 2D array (matrix)
 * Concepts Used: 2D Arrays, Nested Loops, Input using Scanner
 */

public class MatrixSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int sum = 0;

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
                sum += matrix[i][j];
            }
        }

        // Display matrix
        System.out.println("\nMatrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSum of all elements = " + sum);

    }
}
