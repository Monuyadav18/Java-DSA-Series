package Conditions;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        //Number even ya odd check karo

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");

        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
}
