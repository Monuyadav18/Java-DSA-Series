package patterns;

public class P21 {
    public static void main(String[] args) {
        int n = 4;
        for(int row = 1; row <= n; row++){
            //space
            for(int col = 1; col <= n-row; col++){
                System.out.print(" ");
            }
            //Number
            for(int col = 1; col <= row; col++){
                System.out.print(col);
            }
            //reverse count
            int rowValue = row-1;
            for(int col = 1; col < row; col++){
                System.out.print(rowValue);
                rowValue--;
            }
            System.out.println();
        }
    }
}
