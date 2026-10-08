package arrays;

public class LargestElement {
    static int largestElement(int[] arr){
        int largest = arr[0];
        for(int i : arr){
            if(i > largest){
                largest = i;
            }
        }
        return largest;
    }

    public static void main(String[] args){
        int[] arr = {4,8,2,15,6};
        int Largest = largestElement(arr);
        System.out.println(Largest);
    }
}
