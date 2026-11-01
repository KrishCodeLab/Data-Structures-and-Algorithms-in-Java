package Strings;

import java.util.*;

public class FirstAndLast_Occurance {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Find out the first and last occurance of the char in string
    System.out.println("Enter String ");
    String str = sc.nextLine();
    System.out.println("Enter Char ");
    char c = sc.next().charAt(0);

    // Loop for finding first occurance
    for (int i = 0; i < str.length(); i++) {
      if (c == str.charAt(i)) {
        System.out.println("First Occurance of " + c + " is at index : " + i);
        break;
      }

    }

    // Loop for finding last occurance
    for (int i = str.length() - 1; i >= 0; i--) {
      if (c == str.charAt(i)) {
        System.out.println("The last occurance of " + c + " is at index : " + i);
        break;
      }
    }
    sc.close();
  }
}
