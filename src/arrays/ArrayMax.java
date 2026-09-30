package arrays;

public class ArrayMax {
    public static void main(String[] args) {
        int arr[] = {-99, 44, -59, 98, 43};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
