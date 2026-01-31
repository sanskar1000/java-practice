// Practice: check number zero or not
package condition.practice;

import java.util.Scanner;

public class ZeroChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int num = sc.nextInt();

        if ( num == 0){
            System.out.println("The number is zero. ");
        }else {
            System.out.println("The number is not zero. ");
        }
     }
  }
