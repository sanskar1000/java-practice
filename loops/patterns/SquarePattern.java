
package loops.patterns;

public class SquarePattern {

    public static void main(String[] args) {

        int size = 5;   // number of rows and columns

        for (int i = 1; i <= size; i++) {          // outer loop → rows
            for (int j = 1; j <= size; j++) {      // inner loop → columns
                System.out.print("* ");
            }
            System.out.println();                  // move to next row
        }
    }
}
