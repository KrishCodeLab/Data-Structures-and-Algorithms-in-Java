package Strings;

import java.util.*;

public class ReverseString {
  public static void main(String[] args) {
    // Reverse a String
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String to reverse");
    String str = sc.nextLine();

    for (int i = str.length() - 1; i >= 0; i--) {
      System.out.print(str.charAt(i) + " ");
    }

    sc.close();
  }
}
