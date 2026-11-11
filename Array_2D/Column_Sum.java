package Array_2D;

import java.util.*;

public class Column_Sum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Calculate sum of each column
    System.out.println("Enter rows : ");
    int rows = sc.nextInt();
    System.out.println("Enter columns : ");
    int columns = sc.nextInt();

    int colSum = 0;
    int[][] n = new int[rows][columns];
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[i].length; j++) {
        n[i][j] = sc.nextInt();

      }
    }
    // Outer loop for columns
    for (int i = 0; i < n[0].length; i++) {
      colSum = 0;
      // Inner loop for rows
      for (int j = 0; j < n.length; j++) {
        colSum += n[j][i];
      }
      System.out.println("Sum of " + i + " col = " + colSum);
    }
    sc.close();
  }
}
