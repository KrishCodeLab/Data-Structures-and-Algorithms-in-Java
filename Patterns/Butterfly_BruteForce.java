package Patterns;

import java.util.*;

public class Butterfly_BruteForce {
  public static void Butterfly(int n) {
    // Part 1 :
    // Pyramid Pattern
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      // Mirror Pyramid Pattern
      for (int j = 1; j <= (n - i) * 2; j++) {
        System.out.print("  ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();

    }

    // Part 2:
    // Inverse Pyramid
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }

      // Mirror Inverse Pyramid

      for (int j = 1; j >= 1; j--) {
        System.out.print(" ");
      }
      for (int j = n; j >= 1; j--) {
        System.out.print("* ");
      }

      System.out.println();
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n :");
    int n = sc.nextInt();
    Butterfly(n);
    sc.close();
  }
}
