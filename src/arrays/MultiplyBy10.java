package arrays;

import java.util.Arrays;

public class MultiplyBy10 {
    static int[] multiplyBy10(int[] arr){
        int[] Result = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            Result[i] = arr[i]*10;
        }
        return Result;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,4,2};
        int[] result = multiplyBy10(arr);
        System.out.println(Arrays.toString(result));
    }
}
