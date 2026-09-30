package patterns;

public class P18 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                int ans = col + ('A'-1);
                char final_answer = (char) ans;
                System.out.print(final_answer + " ");
            }
            System.out.println();
        }
    }
}
