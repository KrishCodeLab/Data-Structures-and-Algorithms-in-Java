package Strings;

import java.util.*;

public class CountCharacters {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String ");
    String str = sc.nextLine();
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      // Assigning ch=Current char
      char ch = str.charAt(i);
      // Checking current char is alphabetical letter or not. If it is letter then
      // incrementing count
      if (Character.isLetter(ch)) {
        count++;
      }
    }
    System.out.println("The count of the characters in string is : " + count);
    sc.close();
  }
}
