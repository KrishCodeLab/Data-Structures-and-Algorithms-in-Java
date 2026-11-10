package StringBuilder;

import java.util.*;

public class Reverse_Each_Word {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Reverse each word of string

    System.out.println("Enter String : ");
    String str = sc.nextLine();

    // Converts string to stringbuilder to manipulate string
    StringBuilder sb = new StringBuilder(str);

    // result --> For display final result
    StringBuilder result = new StringBuilder();
    // Word for storing each word till space found
    StringBuilder word = new StringBuilder();

    for (int i = 0; i < sb.length(); i++) {
      if (sb.charAt(i) == ' ') {
        // If space found reverse the word to append in final result
        word.reverse();
        // Storing reversed word in final result
        result.append(word);
        // Storing space after word reversed
        result.append(sb.charAt(i));
        // Reset word to store next word
        // word = new StringBuilder(""); Instead of creating new object we can set word
        // length 0
        word.setLength(0);
      } else {
        // if char is not space store it in word
        word.append(sb.charAt(i));
      }
    }

    // final word does not have space but it is stored in word to perform other
    // operation space never will found so reverse last word manually and store it
    // is in final result
    word.reverse();
    result.append(word);
    System.out.println(result);
    sc.close();
  }
}
