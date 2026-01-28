package operators;

public class UnaryOperatorsDemo {

    public static void main(String[] args) {

        int a = 5;

        System.out.println("Initial value of a: " + a);

        // Unary plus and minus
        System.out.println("Unary plus (+a): " + (+a));
        System.out.println("Unary minus (-a): " + (-a));

        // Increment operators
        System.out.println("Post-increment (a++): " + (a++));
        System.out.println("After post-increment, a: " + a);

        System.out.println("Pre-increment (++a): " + (++a));

        // Decrement operators
        System.out.println("Post-decrement (a--): " + (a--));
        System.out.println("After post-decrement, a: " + a);

        System.out.println("Pre-decrement (--a): " + (--a));

        // Logical NOT
        boolean flag = true;
        System.out.println("Logical NOT (!flag): " + (!flag));
    }
}
