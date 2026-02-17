//Demonstrates : Input Output in array
package arrays.oneD;

import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements:");
        for (int i=0 ;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
