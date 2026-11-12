package Array_2D;

import java.util.*;

public class MaxSum_Col {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Find the maximum sum among all rows.
    System.out.println("Enter Rows : ");
    int rows = sc.nextInt();
    System.out.println("Enter column : ");
    int columns = sc.nextInt();
    int[][] numbers = new int[rows][columns];

    // User input
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        numbers[i][j] = sc.nextInt();
      }
    }

    // print
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[0].length; j++) {
        System.out.println(numbers[i][j]);
      }
    }

    // calculate sum of columns
    int colSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < numbers[0].length; i++) {
      for (int j = 0; j < numbers.length; j++) {
        colSum += numbers[j][i];
      }
      if (maxSum < colSum) {
        maxSum = colSum;
      }
      System.out.println("Sum of " + i + " column is : " + colSum);
    }
    System.out.println("Maximum sum among all rows : " + maxSum);

    sc.close();
  }
}
