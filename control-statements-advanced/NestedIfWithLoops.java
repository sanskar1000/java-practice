package controlstatementsadvanced;

public class NestedIfWithLoops {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {

                if (i % 4 == 0) {
                    System.out.println(i + " is divisible by 4");
                } else {
                    System.out.println(i + " is even but not divisible by 4");
                }
            }
        }
    }
}
