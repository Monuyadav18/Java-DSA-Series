package arrays;

public class CountOccurrences {
    static int countOccurrence(int[] arr, int target){

        int count = 0;
        for(int i : arr){
            if(i == target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,2,7,2};
        int count = countOccurrence(arr, 2);
        System.out.println(count);
    }
}
