package Patterns;

import java.util.*;

public class Mirror_Pyramid {
  public static void main(String[] args) {
    // Mirror Pyramid
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows ");
    int rows = sc.nextInt();

    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= rows - i; j++) {
        // spaces
        System.err.print(" ");
      }

      // Star
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.err.println();
    }

    sc.close();
  }
}
