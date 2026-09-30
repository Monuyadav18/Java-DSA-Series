package strings;

public class StringBasic {

    //printString
    static void printString(String str){
        int n = str.length();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    //Count length of String
    static void countString(String str){
        int count = 0;
        int n = str.length();
        for(int i=0; i<n; i++){
            count++;
        }
        System.out.println("Total String count : " + count);
    }

    //Count Vowels
    static void countVowel(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch ==  'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                count++;
            }
        }
        System.out.println("Total Vowels count : " + count);
    }

    //Reverse String
    static void reverseString(String str){
        int n = str.length();
        for(int i = n-1; i >= 0; i--){
            char ch = str.charAt(i);
            System.out.print(ch);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String firstName = "Monu";
        String lastName = new String("Yadav");

//
//        String str = "Programming";
//        printString(str);

//        String str = "Java Programming";
//        countString(str);

//        String str = "counting";
//        countVowel(str);

        String Str = "Monu";
        reverseString(Str);
        System.out.println((firstName.length()));


//
//        System.out.println(firstName);
//        System.out.println(lastName);
//        System.out.println(firstName.toUpperCase());
//        System.out.println(lastName.toLowerCase());
//        System.out.println(firstName.charAt(2));


    }
}
