package Strings;

import java.util.*;

public class CheckPalindrome {
  public static void main(String[] args) {
    // Check Palindrome
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String ");
    String str = sc.nextLine();
    String empty = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      empty += str.charAt(i);
    }
    if (str.equalsIgnoreCase(empty)) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not Palindrome");
    }
    sc.close();
  }
}
