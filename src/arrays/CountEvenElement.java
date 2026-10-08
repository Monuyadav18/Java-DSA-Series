package arrays;

public class CountEvenElement {
    static int countEven(int[] arr){
        int[] result = new int[arr.length];
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                result[i] = arr[i];
            }
    }
        for(int i : result){
            if(i != 0){
              count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int count = countEven(arr);
        System.out.println(count);
    }
}
