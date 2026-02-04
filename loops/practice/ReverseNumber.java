//Practice: reverse the number
package loops.practice;

public class ReverseNumber {

    public static void main(String[] args) {

        int number = 12345;
        int originalNumber = number;   // preserve original value
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;          // extract last digit
            reverse = reverse * 10 + digit;  // build reverse
            number = number / 10;             // remove last digit
        }

        System.out.println("Original number = " + originalNumber);
        System.out.println("Reversed number = " + reverse);
    }
}
