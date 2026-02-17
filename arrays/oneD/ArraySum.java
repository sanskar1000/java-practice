package arrays.oneD;
import java.util.Scanner;

/*
 * Program: ArraySum
 * Purpose: Calculate the sum of all elements in an array
 * Concept Used: Arrays, Loop, Input using Scanner
 */

public class ArraySum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        // Input elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Calculate sum
        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum of array elements = " + sum);
    }
}
