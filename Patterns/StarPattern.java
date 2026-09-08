package Patterns;

import java.util.*;

public class StarPattern {
  public static void main(String[] args) {
    // Print Star Pattern
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows ");
    int n = sc.nextInt();

    // Outer loop runs for rows
    for (int i = 1; i <= n; i++) {
      // Inner loop runs for columns
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    sc.close();
  }
}
