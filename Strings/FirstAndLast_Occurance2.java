package Strings;

import java.util.*;

public class FirstAndLast_Occurance2 {
  public static void main(String[] args) {
    // Find First and Last occurance of char in string using 2 variables with one
    // index
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String ");
    String str = sc.nextLine();
    System.out.println("Enter Char ");
    char c = sc.next().charAt(0);
    int first = -1;
    int last = -1;
    for (int i = 0; i < str.length(); i++) {
      if (c == str.charAt(i)) {
        if (first == -1) {
          // Stores first index and stores it till end because first never will be -1
          // again
          first = i;
        }

        // Storing index till ch found in string and returns the last occurance
        // automatically after loop ended
        last = i;
      }

    }
    System.out.println("The first occurance of " + c + " is at index " + first + "  and last occurance of " + c
        + " is at index " + last);
    sc.close();
  }
}
