package Array_2D;

import java.util.*;

public class Find_Sum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Find sum of 2D array
    System.out.println("Enter rows : ");
    int rows = sc.nextInt();
    System.out.println("Enter columns : ");
    int columns = sc.nextInt();

    int sum = 0;
    int[][] n = new int[rows][columns];
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[i].length; j++) {
        n[i][j] = sc.nextInt();
        sum += n[i][j];
      }
    }

    System.out.println("===================");
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[i].length; j++) {
        System.out.print(n[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("===================");
    System.out.println("Sum of 2D Array is " + sum);
    sc.close();
  }
}
