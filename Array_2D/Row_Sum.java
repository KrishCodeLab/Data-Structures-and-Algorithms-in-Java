package Array_2D;

import java.util.*;

public class Row_Sum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Calculate sum of each row
    System.out.println("Enter rows : ");
    int rows = sc.nextInt();
    System.out.println("Enter columns : ");
    int columns = sc.nextInt();

    int rowSum = 0;
    int[][] n = new int[rows][columns];
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[i].length; j++) {
        n[i][j] = sc.nextInt();

      }
    }
    for (int i = 0; i < n.length; i++) {
      rowSum = 0;
      for (int j = 0; j < n[i].length; j++) {
        rowSum += n[i][j];
      }
      System.out.println("Sum of " + i + " row = " + rowSum);
    }
    sc.close();
  }
}
