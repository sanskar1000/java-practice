package methods.practice;

public class PalindromeMethod {

    static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
