package patterns;

public class P22 {
    public static void main(String[] args) {
        int n = 4;
        for(int row = 1; row <= n; row++){
            //space
            for(int col = 1; col <= n-row; col++){
                System.out.print(" ");
            }
            //count
            for(int col = 1; col <= row; col++){
                System.out.print(row);
            }
            //count-2
            for(int col = 1; col < row; col++){
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
