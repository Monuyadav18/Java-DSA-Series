package patterns;

public class P10 {
  public static void main (String[] args) {
    int n = 5;
    for(int row = 1; row <= n; row++) {
      // space
      for(int col = 1; col <= n-row; col++) {
        System.out.print(" ");
      }
      //star
      if(row == 1 || row == n){
        for(int col = 1; col <= (2*row-1); col++) {
          System.out.print("*");
        }
      }
      else {
        System.out.print("*");
        for(int col = 1; col <= (2*row-3); col++) {
          System.out.print(" ");
        }
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
