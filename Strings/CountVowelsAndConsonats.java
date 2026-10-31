package Strings;

import java.util.*;

public class CountVowelsAndConsonats {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String ");
    String str = sc.nextLine();
    int vowel = 0;
    int consonants = 0;
    int space = 0;
    for (int i = 0; i < str.length(); i++) {
      char ch = Character.toLowerCase(str.charAt(i));
      // if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
      // str.charAt(i) == 'o' || str.charAt(i) == 'u') {
      // vowel += 1;
      // } else {
      // consonants += 1;
      // }
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowel += 1;
      } else if (Character.isLetter(ch)) {
        consonants += 1;
      }
    }
    System.out.println("Vowel count in string is : " + vowel);
    System.out.println("Consonants count in string is : " + consonants);

    sc.close();
  }
}
