package StringBuilder;

import java.util.*;

public class Introduction {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // StringBuilder : It is used to create and modify strings efficiently without
    // creating a new string object every time you make change.
    StringBuilder sb = new StringBuilder("Krushna Govardhane");
    StringBuilder sb2 = new StringBuilder(" ");
    // StringBuilder sb3 = new StringBuilder(100);
    System.out.println(sb);
    System.out.println(sb2);
    System.out.println("Enter String ");

    for (char c = 'a'; c <= 'z'; c++) {
      sb2.append(c);
    }

    // feature StringBuilder v/s StringBuffer
    // mutable : Yes | Yes
    // Thread Safe : No | Yes
    // Synchronized : No | Yes
    // Performance : Faster | Slower
    // DSA Usage : Very Common | Less Common

    System.out.println(sb2);
    sc.close();
  }
}
