package arrays;

public class Counting {
    static void count(int[] arr){
        int pos = 0;
        int neg = 0;
        int zero = 0;

        for(int i : arr){
            if(i > 0){
                pos++;
            }
            else if(i < 0){
                neg++;
            }
            else{
                zero++;
            }
        }
        System.out.println("Total +ve : " + pos);
        System.out.println("Total -ve : " + neg);
        System.out.println("Total Zero : " + zero);
    }

    public static void main(String[] args) {
        int[] arr = {1,-2,3,-4,-5,0,3,0};
        count(arr);
    }
}
