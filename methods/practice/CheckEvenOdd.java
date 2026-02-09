// Practice : Check even or odd
package methods.practice;

public class CheckEvenOdd {

    static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    public static void main(String[] args) {
        checkEvenOdd(7);
    }
}
