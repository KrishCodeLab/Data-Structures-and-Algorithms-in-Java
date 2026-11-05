package Strings;

import java.util.*;

public class Find_Unique_Characters {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Find Unique Character in string
    System.out.println("Enter Str");
    String str = sc.nextLine();
    for (int i = 0; i < str.length(); i++) {
      boolean isUnique = true;
      char ch = str.charAt(i);
      for (int j = 0; j < str.length(); j++) {
        if (i != j && ch == str.charAt(j)) {
          isUnique = false;
          break;
        }
      }
      if (isUnique) {
        System.out.println(str.charAt(i));
      }
    }
    sc.close();
  }
}
