package arrays;

public class SmallestElement {
    static int smallestElement(int[] arr){
        int smallest = arr[0];
        for(int i : arr){
            if(i < smallest){
                smallest = i;
            }
        }
        return smallest;
    }
    public static void main(String[] args){
        int[] arr = {4,8,2,15,6};
        int Smallest = smallestElement(arr);
        System.out.println(Smallest);
    }
}
