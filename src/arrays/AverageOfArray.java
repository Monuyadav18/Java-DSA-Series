package arrays;

public class AverageOfArray {

    static double averageOfArray(int[] arr){
        int sum = 0;

        for(int i : arr){
            sum += i;
        }
        int avg = sum/arr.length;
        return avg;
    }

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,55};
        double Average =  averageOfArray(arr);

        System.out.println("Average Of Arrays: "+ Average);
    }
}
