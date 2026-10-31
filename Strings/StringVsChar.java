package Strings;

import java.util.*;

public class StringVsChar {
  public static void main(String[] args) {
    // Difference between String vs Character Array
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter String ");
    String str = sc.nextLine();

    for (int i = 0; i < str.length(); i++) {
      System.out.print(str.charAt(i) + " ");
    }

    System.out.println();
    char[] arr = { 'K', 'R', 'U', 'S', 'H', 'N', 'A' };

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}
