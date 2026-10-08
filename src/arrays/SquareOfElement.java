package arrays;

import java.util.Arrays;

public class SquareOfElement {
    static int[] squareOfElements(int[] arr) {
        int[] Result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Result[i] = arr[i] * arr[i];
        }
        return Result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 2, 6};
        int[] result = squareOfElements(arr);
        System.out.println(Arrays.toString(result));
    }
}
