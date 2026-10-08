package arrays;

public class SumOfPosNeg {
    static void sumOfPosNeg(int[] arr) {
        int pos = 0;
        int neg = 0;

        for(int i : arr){
            if(i >= 0){
                pos += i;
            }
            else{
                neg += i;
            }
        }
        System.out.println("+ve Sum : " + pos);
        System.out.println("-ve Sum : " + neg);
    }


    public static void main(String[] args) {
        int[] arr = {2,-4,5,3,-6};
        sumOfPosNeg(arr);
    }
}
