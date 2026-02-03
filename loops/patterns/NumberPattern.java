package loops.patterns;

public class NumberPattern {

    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {          // outer loop → rows
            for (int j = 1; j <= i; j++) {         // inner loop → numbers per row
                System.out.print(j + " ");
            }
            System.out.println();                  // move to next line
        }
    }
}
