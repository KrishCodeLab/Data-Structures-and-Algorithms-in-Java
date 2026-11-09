package StringBuilder;

import java.util.*;

public class Check_Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Check Palindrome
    System.out.println("Enter String ");
    String str = sc.nextLine().toLowerCase();

    StringBuilder sb = new StringBuilder(str);
    String Reverse_str = sb.reverse().toString();
    if (str.equals(Reverse_str)) {
      System.out.println("String is Palindrome");
    } else {
      System.out.println("String is not Palindrome");
    }
    sc.close();
  }
}
