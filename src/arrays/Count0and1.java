package arrays;

public class Count0and1 {
    static void count0And1(int[] arr){
        int zero = 0;
        int ones = 0;

        for(int i : arr){
            if(i == 0){
                zero++;
            }
            else{
                ones++;
            }
        }
        System.out.println("Total 0 = " + zero);
        System.out.println("Total 1 : " + ones);
    }

    public static void main(String[] args){
        int[] arr = {1,0,1,1,0,1,0};
        count0And1(arr);
    }
}
