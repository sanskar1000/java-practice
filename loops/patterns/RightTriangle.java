package loops.patterns;

public class RightTriangle {

    public static void main(String[] args) {

        int height = 5;   // number of rows

        for (int i = 1; i <= height; i++) {        // outer loop → rows
            for (int j = 1; j <= i; j++) {         // inner loop → stars per row
                System.out.print("* ");
            }
            System.out.println();                  // next line after each row
        }
    }
}
