//Practice: check voter eligible to vote or not
package condition.practice;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the age : ");
        int age = sc.nextInt();

      if (age >= 130 || age <= 0){
          System.out.println("Enter a valid age.");
      }else if (age >= 18 ){
          System.out.println("Person is eligible to vote.");
      }else {
          System.out.println("Person is not eligible to vote ");
      }

    }
}
