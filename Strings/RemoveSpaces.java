package Strings;

import java.util.*;

public class RemoveSpaces {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Remove Spaces from String without using replace method
    System.out.println("Enter string  ");
    String str = sc.nextLine();
    String result = "";
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch != ' ') {
        result += ch;
      }

    }
    System.out.println("String " + str);
    System.out.println("String without Space : " + result);

    // Using Replace method Approach
    String replace_result = str.replace(" ", "");
    System.out.println("Replace Approach : " + replace_result);

    // Using toCharArrayMethod method Approach
    char[] c = str.toCharArray();
    String final_str = " ";
    for (int i = 0; i < c.length; i++) {
      if (c[i] == ' ') {
        continue;
      } else {
        final_str += c[i];
      }
    }
    System.out.println("toCharArray Approach : " + final_str);
    sc.close();
  }
}
