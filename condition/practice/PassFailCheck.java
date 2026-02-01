//Practice : check pass or fail
package condition.practice;

import java.util.Scanner;

public class PassFailCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a marks: ");
        int marks = sc.nextInt();

        if ( marks>= 33){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
        }
    }
