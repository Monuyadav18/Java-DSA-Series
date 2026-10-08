package arrays;

public class ElementIndex {
    static int elementIndex(int[] arr, int target){
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {3,5,9,2,7,1};
        int target = 2;
        int index = elementIndex(arr, target);
        System.out.println("Element Index : " + index);
    }
}
