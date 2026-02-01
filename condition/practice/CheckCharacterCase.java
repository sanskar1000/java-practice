// Practice: check character is lowercase or uppercase 
package condition.practice;

Import java.util.Scanner;

class CheckCharacterCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase letter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase letter");
        } else {
            System.out.println("Not an alphabet character");
        } 
    }
}
