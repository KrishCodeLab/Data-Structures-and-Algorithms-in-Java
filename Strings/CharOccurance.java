package Strings;

import java.util.*;

public class CharOccurance {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String ");
    String str = sc.nextLine();
    System.out.println("Enter Char to check occurance : ");
    char target = sc.next().charAt(0);
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (target == ch) {
        count++;
      }
    }

    System.out.println("The " + target + " occured in " + str + " count : " + count);
    sc.close();

  }
}
