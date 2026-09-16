package Patterns;

import java.util.*;

public class Hollow_Pattern {
  public static void Hollow(int n) {
    // int star = n;
    int spaces = n - 2;

    // Outer loop for the rows
    for (int i = 1; i <= n; i++) {
      // Checking condition for first and last row
      if (i == 1 || i == n) {
        // Printing all stars in first and last row
        for (int j = 1; j <= n; j++) {
          System.out.print("* ");

        }
        System.err.println();
      } else { // Remaning rows will be [ star spaces star ]
        // Star
        System.out.print("* ");

        // Spaces
        for (int j = 1; j <= spaces; j++) {
          System.out.print("  ");
        }

        // Star
        System.out.print("* ");
        System.out.println();

      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int rows = sc.nextInt();
    Hollow(rows);
    sc.close();

  }
}
