package arrays;

public class ArraySum {
    static int sumArray(int[] arr) {
        int sum = 0;

        for(int i : arr){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {5, 7, 2, 9, 44};
        int result = sumArray(arr);

        System.out.println(result);
    }
}
