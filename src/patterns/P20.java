package patterns;

public class P20 {
    public static void main(String[] args) {
        int n = 4;
        //part-1
        for(int row = 1; row <= n; row++){
            //Space
            for(int col = 1; col <= row-1; col++){
                System.out.print(" ");
            }
            //Star
            for(int col = 1; col <= 2*(n-row)+1; col++){
                System.out.print("*");
            }

            System.out.println();
        }
        //part-2
        for(int row = 1; row < n; row++){
            //space
            for(int col = 1; col <= n-row-1; col++){
                System.out.print(" ");
            }
            //Star
            for(int col = 1; col <= 2*row+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
