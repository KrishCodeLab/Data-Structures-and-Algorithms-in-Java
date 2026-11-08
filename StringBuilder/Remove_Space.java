package StringBuilder;

import java.util.*;

public class Remove_Space {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Remove Spaces from String
    System.out.println("Enter String ");
    String str = sc.nextLine();

    StringBuilder sb = new StringBuilder(str);

    for (int i = 0; i < sb.length(); i++) {
      if (sb.charAt(i) == ' ') {
        sb.deleteCharAt(i);
      }
    }
    str = sb.toString();
    System.out.println(str);

    sc.close();
  }
}
