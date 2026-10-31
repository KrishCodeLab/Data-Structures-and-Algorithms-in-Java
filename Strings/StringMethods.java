package Strings;

import java.util.*;

public class StringMethods {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string ");
    String str = sc.nextLine();
    // length function :
    System.out.println(str.length());

    // charAt(idx) : Return char from given index
    System.out.println(str.charAt(3));

    // substring(start,end)
    System.out.println(str.substring(2, 7));

    // equals and equlasIgnoreCase()
    System.out.println(str.equals(str.toLowerCase()));
    System.out.println(str.equalsIgnoreCase(str.toLowerCase()));
    sc.close();
  }
}
