package BitwiseOperator;

import java.util.Scanner;

public class BitwiseBasics {
    public static void main(String[] args) {
        System.out.println("enter a number");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


//        // Check Even or Odd
//
//        if( (num & 1) == 0){
//            System.out.println("Number is Even");
//        }
//        else {
//            System.out.println("Number is Odd");
//        }

        // Multiply by 2

//        System.out.println("Before Multiply : " + num);
//
//        num = num << 1;
//        System.out.println("After Multiply : " + num);

        // Divide by 2

//        System.out.println("Before Division : " + num);
//
//        num = num >> 1;
//        System.out.println("After Division : " + num);

        //Check number is power of 2 or not

//        if((num & num-1) == 0) {
//            System.out.println("Number is "+ num + " power of 2");
//        }
//        else {
//            System.out.println("Number is " + num + " not a power of 2");
//        }

        // Check number is even using bitwise

//        if((num & 1) == 0){
//            System.out.println("The number is even -> " + num );
//        }
//        else{
//            System.out.println("The number is not even -> " + num );
//        }

        //Count number of set bits

//        int count = 0;
//
//        while(num != 0) {
//            num = num & (num-1);
//            count++;
//        }
//        System.out.println(count);




    }
}
