package methods;

public class MethodWithReturnType {

    static int getSquare(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        int result = getSquare(5);
        System.out.println("Square = " + result);
    }
}
