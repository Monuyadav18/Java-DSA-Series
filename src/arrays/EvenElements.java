package arrays;

import java.util.Arrays;

public class EvenElements {
    static int[] evenElements(int[] arr) {
        int[] result =  new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[i] = arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {11,44,61,88,46};
        int[] result = evenElements(arr);
        for(int i : result){
            if(i != 0){
                System.out.print(i+" ");
            }
        }
    }
}
