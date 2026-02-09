//Practice : Add to number 

package methods.practice;
import java.util.Scanner;

public class AddTwoNumbers {

    static int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = add(a, b);

        System.out.println("Sum = " + result);
    }
}
