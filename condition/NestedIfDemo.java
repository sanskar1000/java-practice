// Demonstrates nested if statement in Java

package condition;

import java.util.Scanner;

public class NestedIfDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Do you have an ID card? (true/false): ");
        boolean hasId = sc.nextBoolean();

        if (age >= 18) {                     // Outer if
            if (hasId) {                     // Inner if
                System.out.println("You are allowed to enter.");
            } else {
                System.out.println("ID card required.");
            }
        } else {
            System.out.println("You are not eligible due to age.");
        }

    }
}
