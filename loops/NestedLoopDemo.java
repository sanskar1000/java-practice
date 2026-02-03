// Demonstrates basic do while loop
package loops;

public class NestedLoopDemo {

    public static void main(String[] args) {

        System.out.println("Example 1: Row-Column Structure");
        for (int i = 1; i <= 3; i++) {          // outer loop → rows
            for (int j = 1; j <= 4; j++) {      // inner loop → columns
                System.out.print("* ");
            }
            System.out.println();               // new line after each row
        }
