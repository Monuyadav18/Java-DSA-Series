package arrays;

import java.util.Arrays;

public class ArraySum5 {
    static int[] sum5(int[] arr){
        int[] Result = new int [arr.length];

        for(int i=0;i<arr.length;i++){
            Result[i] = arr[i] + 5;
        }
        return Result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,4,3};
        int[] FinalResult = sum5(arr);
        System.out.println(Arrays.toString(FinalResult));
    }
}
