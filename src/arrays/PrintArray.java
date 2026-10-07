package arrays;

public class PrintArray {

    // Using for Each 
//    static void printArray(int[] arr) {
//        for(int i :arr){
//            System.out.println(i);
//        }
//    }

//      using for loop
     static void printArray(int[] arr){
         for(int i = 0; i < arr.length; i++){
             System.out.print(arr[i]+" ");
         }
     }
    public static void main(String[] args) {
        int[] arr = {10, 30, 55, 8, 15};
        printArray(arr);
    }
}
