package Strings;

import java.util.*;

public class CountVowelsAndConsonats {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String ");
    String str = sc.nextLine();
    // Counters
    int vowel = 0;
    int consonants = 0;

    for (int i = 0; i < str.length(); i++) {
      // Converting each character of string to lowercase to compare it in condition
      char ch = Character.toLowerCase(str.charAt(i));

      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowel += 1;
      } else if (Character.isLetter(ch)) { // Checking the char is alphabet or not
        consonants += 1;
      }
    }
    System.out.println("Vowel count in string is : " + vowel);
    System.out.println("Consonants count in string is : " + consonants);

    sc.close();
  }
}
