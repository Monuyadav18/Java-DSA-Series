package basics;

public class Basicmath {
    //Print number Digit
static void printDigit(int num){

    while(num != 0) {
        int digit = num%10;
        System.out.println(digit);
        num /= 10;
    }
}

//  Count Digit
    static void countDigit(int num) {

    int count = 0;
    System.out.println("Number : " + num);

        while(num != 0) {
        int digit = num%10;
        count++;
        num/=10;
    }
        System.out.println("The Total Digits : " + count);
    }

    //Sum of Digits
    static void sumOfDigits(int num) {
    int sum = 0;
        System.out.println("Number : " + num);

        while(num != 0) {
            int digit = num%10;
            sum += digit;
            num/=10;
        }
        System.out.println("The Sum Of Digits : " + sum);
    }

    //Reverse a Number
    static int reverseNumber(int num) {
        int revNumber = 0;
//        System.out.println("Original Number : " + num);

    while(num != 0) {
        int digit = num%10;
        revNumber = revNumber * 10 + digit;
        num/=10;
    }
//    System.out.println("Reversed Number : " + revNumber);

    return revNumber;
    }

    //Check Palindrome Number
    static boolean isPalindrome(int num) {
    int originalNumber = num;
    int reversedNumber = reverseNumber(num);

    if (originalNumber == reversedNumber) {
        System.out.println("The Number is Palindrome");
        return true;
    }
        else{
            System.out.println("The Number is not Palindrome");
            return false;
        }

    }

    static void evenOrOdd(int num) {
    if(num%2==0){
        System.out.println("Even Number");
    }
    else{
        System.out.println("Odd Number");
    }
    }

    public static void main(String[] args) {

//        int num = 78453;
//        printDigit(num);

//        int num = 38648987;
//        countDigit(num);

//        int num = 845295;
//        sumOfDigits(num);

//        int num = 7935;
//        reverseNumber(num);

//        boolean ans = isPalindrome(1221);
//        System.out.println(ans);

        int num = 842899;
        evenOrOdd(num);
    }
}
