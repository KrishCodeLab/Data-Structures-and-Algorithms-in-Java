package Array_2D;

import java.util.*;

public class Find_Max {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Find Max element of 2D array
    System.out.println("Enter rows : ");
    int rows = sc.nextInt();
    System.out.println("Enter columns : ");
    int columns = sc.nextInt();

    int Max = Integer.MIN_VALUE;
    int[][] n = new int[rows][columns];
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[i].length; j++) {
        n[i][j] = sc.nextInt();

      }
    }

    System.out.println("===================");
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[i].length; j++) {
        if (Max < n[i][j]) {
          Max = n[i][j];
        }
      }
    }
    System.out.println("Max element in 2D Array is : " + Max);
    sc.close();
  }
}
