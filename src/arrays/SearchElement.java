package arrays;

public class SearchElement {
    static boolean searchElement(int[] arr){
        int element = 8;
        for(int i : arr){
            if(i == element){
                return true;
            }
        }
        return false;
    }

    public static void main (String[] args){
        int[] arr = {2,7,5,9,8};
        boolean bool = searchElement(arr);
        System.out.println(bool);
    }
}
