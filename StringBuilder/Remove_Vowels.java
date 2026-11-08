package StringBuilder;

import java.util.*;

public class Remove_Vowels {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Remove Vowels From String using StringBuilder
    System.out.println("Enter String : ");
    String str = sc.nextLine().toLowerCase();

    StringBuilder sb = new StringBuilder(str);
    for (int i = 0; i < sb.length(); i++) {
      if (sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o'
          || sb.charAt(i) == 'u') {
        sb.deleteCharAt(i);
      }

    }
    str = sb.toString();
    System.out.println(str);
    sc.close();

  }
}
