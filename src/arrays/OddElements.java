package arrays;

public class OddElements {
    static int[] oddElements(int[] arr){
        int[] Result = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                Result[i] = arr[i];
            }
        }
        return Result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] result = oddElements(arr);
        for(int i : result){
            if(i != 0){
                System.out.print(i + " ");
            }
        }
    }
}
