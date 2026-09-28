public class P19 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                int ans = ('E' + 1) - col;
                char Final_answer = (char)(ans);
                System.out.print(Final_answer);
            }
            System.out.println();
        }
    }
}
