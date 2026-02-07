//Demonstrates methods with parameters
package methods;

public class MethodWithParameters {

    static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        printSum(10, 20);
    }
}
