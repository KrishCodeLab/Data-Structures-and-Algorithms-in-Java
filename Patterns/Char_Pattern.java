package Patterns;

import java.util.Scanner;

public class Char_Pattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Character Pattern
    char ch = 'A';
    System.out.println("Enter number of rows ");
    int rows = sc.nextInt();

    // outer loop
    for (int i = 1; i <= rows; i++) {
      // inner loop
      for (int j = 1; j <= i; j++) {
        System.out.print(ch + " ");
        ch++; // Incrementing Char value to print next character
      }
      System.err.println();
      ch = 'A';
    }
    sc.close();

  }
}
