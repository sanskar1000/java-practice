package operators;

import java.util.Scanner;

public class TernaryOperatorDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Ternary operator
        String result = (num % 2 == 0) ? "Even number" : "Odd number";

        System.out.println("Result: " + result);

        
    }
}
