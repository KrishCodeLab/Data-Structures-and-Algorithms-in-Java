package Strings;

import java.util.*;

public class Find_Duplicate_Characters {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Find Duplicate Characters From String
    // programming --> r, g, m
    System.out.println("Enter String ");
    String str = sc.nextLine();

    // Outer loop for checking ongoing character
    for (int i = 0; i < str.length(); i++) {
      char target = str.charAt(i);
      // Inner loop for checking current char is exist back
      boolean already_checked = false;
      for (int j = 0; j < i; j++) {
        if (target == str.charAt(j)) {
          already_checked = true;
          break;
        }
      }

      // Checking already_checked char
      if (already_checked) {
        // Shifiting to next outer loop iteration without executing below code
        continue;
      }

      // Inner loop for checking current char with previous ongoing character
      for (int j = i + 1; j < str.length(); j++) {
        if (target == str.charAt(j)) {
          System.out.println(target);
          break;
        }
      }
    }
    sc.close();
  }
}
