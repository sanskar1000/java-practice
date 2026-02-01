// Practice: check number is divisible by 5 or not
package condition.practice;

import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if (num%5==0){
            System.out.println("Number is divisible by 5.");
        }else {
            System.out.println("Number is not divisible by 5.");
        }


    }
}
