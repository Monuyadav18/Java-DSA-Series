package patterns;

public class P13 {
    public static void main(String[] args) {
        int n = 4;
        for(int row = 1; row <= n; row++){
            //Space
            for(int col = 1; col <= row-1; col++){
                System.out.print(" ");
            }
            //Star
            if(row == 1) {
                for (int col = 1; col <= 2*n-1; col++) {
                    System.out.print("*");
                }
            }
            else if(row == n){
                System.out.print("*");
            }
                else {
                    System.out.print("*");
                    //Space
                for(int col = 1; col <= 2*(n-row)-1; col++){
                    System.out.print(" ");
                }
                System.out.print("*");
                }
            System.out.println();
        }
    }
}
