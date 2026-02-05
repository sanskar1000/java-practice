//Demonstrates control-statments
package controlstatementsadvanced;

public class ContinueExample {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue;   // skip this iteration
            }

            System.out.println(i);
        }
    }
}
