package Conditions;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        //Number positive, negative ya zero check karo

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");

        int n = sc.nextInt();

        if(n > 0) {
            System.out.println("Positive");
        }
        else if (n < 0) {
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}
