package arrays;

public class SumOfOdd {
    static int sumOfOdd(int[] arr){
        int sum = 0;
        for(int i : arr){
            if(i%2 != 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        int[] arr = {2,5,9,1,6};
        int sum = sumOfOdd(arr);
        System.out.println(sum);
    }
}
