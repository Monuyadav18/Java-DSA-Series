package arrays;

public class SumOfEven {
    static int sumOfEven(int[] arr) {
        int sum = 0;
        int[] even = new int[arr.length];
        for(int i : arr){
            if(i%2 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        int[] arr = {4,8,5,3,7};
        int sum = sumOfEven(arr);
        System.out.println(sum);
    }
}
