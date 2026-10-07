package arrays;

public class CountElements {

    static int countElement (int[] arr){
        int count = 0;
        for(int i : arr){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,55,44,22};
        int Result = countElement(arr);

        System.out.println("Total Elements in Array : " + Result);
    }
}
