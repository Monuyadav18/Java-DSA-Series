public class p7 {
  public static void main(String[] args) {
    int num = 4;
    for(int row = 1; row <= num; row++){
      //space
      for(int col = 1; col <= row-1; col++) {
        System.out.print(" ");
      }
      //star
      for(int col = 1; col <= 2*num- 2*row+1; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
