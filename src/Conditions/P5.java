package Conditions;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {

        //Character vowel hai ya consonant

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character :");
         char ch = sc.next().charAt(0);

         if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u'){
             System.out.println("Vowel");
         }
         else {
             System.out.println("Consonent");
         }
    }
}
