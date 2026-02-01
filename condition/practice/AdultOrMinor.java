//Practice : check person Adult or Minor
package condition.practice;

import java.util.Scanner;

public class AdultOrMinor  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a person age : ");
        int age = sc.nextInt();

        if ( age>=18){
            System.out.println("Person is Adult");
        }else {
            System.out.println("Person is Minor");
        }
        }
    }
