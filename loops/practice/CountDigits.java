// Practice: count number
package loops.practice;

public class CountDigits {

    public static void main(String[] args) {

        int number = 12345;
        int originalNumber = number;   // preserve original value
        int count = 0;

        while (number > 0) {
            number = number / 10;   // remove last digit
            count++;
        }

        System.out.println("Number = " + originalNumber);
        System.out.println("Total digits = " + count);
    }
}
