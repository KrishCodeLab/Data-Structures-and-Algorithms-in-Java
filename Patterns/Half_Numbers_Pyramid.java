package Patterns;

import java.util.*;

public class Half_Numbers_Pyramid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows ");
    int n = sc.nextInt();
    // Half Pyramid using Numbers

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        // System.out.print(i);--->Print the row number until the inner loop runs
        System.err.print(j + " "); // --->Print the number of column
      }
      System.out.println();
    }

    sc.close();
  }
}
