package Strings;

import java.util.*;

public class Find_Duplicate_Char {
  public static void main(String[] args) {
    // Find the duplicate character
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String : ");
    String str = sc.nextLine();
    System.out.println("Enter Target Characte : ");
    char target = sc.next().charAt(0);
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target) {
        count++;
        if (count == 2) {
          System.out.println("The Duplicate Char " + target + " found at index " + i);
          break;
        }
      }

    }
    if (count < 2) {
      System.out.println("The Duplicate not found in string ");
    }
    sc.close();
  }
}
