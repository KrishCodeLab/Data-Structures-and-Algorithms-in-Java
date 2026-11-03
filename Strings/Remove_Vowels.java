package Strings;

import java.util.*;

public class Remove_Vowels {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Remove vowels from string\
    System.out.println("Enter String ");
    String str = sc.nextLine();
    // Swapped All uppercase letters to lower
    str = str.toLowerCase();
    String final_result = "";
    for (int i = 0; i < str.length(); i++) {

      if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
          || str.charAt(i) == 'u') {
        continue;
      } else {
        final_result += str.charAt(i);
      }
    }
    System.out.println(final_result);
    sc.close();
  }

}
