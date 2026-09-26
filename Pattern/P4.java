public class P4 {
  public static void  main(String[] args) {
    int n = 5;
    // for space
    for (int row = 1; row <= n; row++ ){
      for(int col = 1; col <= n - row; col++){
        System.out.print(" ");
      }
      for(int col = 1; col <= n; col++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
