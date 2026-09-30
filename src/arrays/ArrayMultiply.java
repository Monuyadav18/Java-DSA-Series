package arrays;

public class ArrayMultiply {
    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 9, 4};
        int mul = 1;

        for(int val:arr){
            mul *= val;
        }
        System.out.println(mul);
    }
}
