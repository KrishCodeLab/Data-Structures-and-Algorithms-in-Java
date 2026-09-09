package Patterns;

import java.util.*;

public class InvertedStar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of rows ");
    int n = sc.nextInt();

    // outer loop -> rows
    // n to 1
    for (int i = n; i >= 1; i--) {
      // inner loop -> columns

      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      // next line
      System.out.println();
    }

    // Outer loop -> rows
    for (int i = 1; i <= n; i++) {
      // Inner loop -> columns
      for (int j = i; j <= n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        System.out.print("* ");
      }
      System.err.println();
    }

    // Outer loop -> rows
    for (int i = 1; i <= n; i++) {
      // inner loop -> columns
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
