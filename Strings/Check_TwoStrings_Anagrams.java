package Strings;

import java.util.*;

public class Check_TwoStrings_Anagrams {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Check Two Strings are Anagrams
    System.out.println("Enter string 1 : ");
    String s1 = sc.nextLine();
    System.out.println("Enter string 2 : ");
    String s2 = sc.nextLine();
    Boolean isAnagram = true;
    if (s1.length() != s2.length()) {
      isAnagram = false;

    } else {
      boolean[] visited = new boolean[s2.length()];

      for (int i = 0; i < s1.length(); i++) {
        char ch = s1.charAt(i);
        boolean isPresent = false;

        for (int j = 0; j < s2.length(); j++) {
          if (ch == s2.charAt(j) && !visited[j]) {
            isPresent = true;
            visited[j] = true;
            break;
          }
        }
        if (!isPresent) {
          isAnagram = false;
        }
      }

    }

    if (isAnagram) {
      System.out.println("Both String are Anagram");
    } else {
      System.out.println("String are not Anagram");
    }
    sc.close();
  }
}
