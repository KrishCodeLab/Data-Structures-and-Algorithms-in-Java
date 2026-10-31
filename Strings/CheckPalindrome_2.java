package Strings;

import java.util.*;

public class CheckPalindrome_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String ");
    String str = sc.nextLine();
    boolean ans = false;
    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
        ans = true;
      } else {
        ans = false;
      }
    }

    if (ans == true) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not Palindrome");
    }
    sc.close();
  }
}
