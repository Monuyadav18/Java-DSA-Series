package arrays;

public class FirstUnsortedElement {
    static int firstUnsorted(int[] arr){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[i+1]){
                return arr[i+1];
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {2,1,9,3,10};
        int element = firstUnsorted(arr);
        System.out.println("First  Unsorted Element : " + element);
    }
}
