package Array_2D;

import java.util.*;

public class Count_Elements {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Count the number of elements of 2D array

    System.out.println("Enter rows : ");
    int rows = sc.nextInt();
    System.out.println("Enter columns : ");
    int columns = sc.nextInt();

    int count = 0;
    int[][] n = new int[rows][columns];
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[i].length; j++) {
        n[i][j] = sc.nextInt();
        count++;
      }
    }
    // Using counter
    System.out.println("Total 2D Array Elements = " + count);

    // Using Mathematical logic
    System.out.println("Total 2D Array Elements = " + rows * columns);
    sc.close();
  }
}
