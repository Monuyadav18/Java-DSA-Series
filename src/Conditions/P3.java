package Conditions;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        //Find the largest number between three numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter 2nd Number");
        int b = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter 3rd Number");
        int c = sc2.nextInt();

        if(a>b && a>c){
            System.out.println("Greater Number is A: " + a);
        }
        else if(b> a && b>c) {
            System.out.println("Greater Number is B: " + b);
        }
        else{
            System.out.println("Greater Number is C: " + c);
        }
    }
}
