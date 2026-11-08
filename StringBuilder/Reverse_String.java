package StringBuilder;

import java.util.*;

public class Reverse_String {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String : ");
    String str = sc.nextLine();

    // Reversing String using StringBuilder
    StringBuilder sb = new StringBuilder(str);
    System.out.println(sb);

    sb.reverse();
    System.out.println(sb);
    sc.close();
  }
}
