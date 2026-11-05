package Strings;

import java.util.*;

public class Check_TwoString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First String");
    String s1 = sc.nextLine();
    System.out.println("Enter Second String");
    String s2 = sc.nextLine();
    boolean isEqual = true;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) != s2.charAt(i)) {
        isEqual = false;
        break;
      } else {

      }
    }
    if (isEqual) {
      System.out.println("Both String are equal");

    } else {
      System.out.println("Both strings are not equal");
    }
    sc.close();
  }
}
