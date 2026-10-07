package Conditions;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {

        //Leap year check karo

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year :");
        int year = sc.nextInt();

        if((year % 400 == 0 || year % 4 == 0) && year % 100 != 0) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not Leap Year");
        }
    }
}
