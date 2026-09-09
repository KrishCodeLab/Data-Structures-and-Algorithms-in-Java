package Patterns;

import java.util.*;

public class Half_Numbers_Pyramid2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Print Half Numbers Pyramid with Only Row number

    System.out.println("Enter number of rows ");
    int n = sc.nextInt();

    // outer loop
    for (int i = 1; i <= n; i++) {
      // inner loop
      for (int j = 1; j <= i; j++) {
        System.out.print(i + " "); // print the i-->row j--->columns times
      }
      System.err.println();
    }
    sc.close();

  }
}
