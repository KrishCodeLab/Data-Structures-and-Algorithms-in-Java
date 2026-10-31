package Strings;

import java.util.*;

public class CountCharacter2 {
  public static void main(String[] args) {
    // Count Character ASCII value approach
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string ");
    String str = sc.nextLine();
    int count = 0;
    // Checking count using ASCII Values comparison
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
        count++;
      }
    }
    System.out.println("The count of the characters is : " + count);

    // Checking count using char arr
    char[] arr = str.toCharArray();
    int count2 = 0;
    for (char ch : arr) {
      if (Character.isLetter(ch)) {
        count2++;
      }
    }
    System.out.println("The count of the characters is : " + count2);

    sc.close();

  }
}
