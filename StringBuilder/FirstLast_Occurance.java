package StringBuilder;

import java.util.*;

public class FirstLast_Occurance {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // First and Last occurance of char and also Remove
    System.out.println("Enter String : ");
    String str = sc.nextLine();
    System.out.println("Enter Target : ");
    char ch = sc.next().charAt(0);

    StringBuilder sb = new StringBuilder(str);
    int First = -1;
    int Last = -1;

    for (int i = 0; i < sb.length(); i++) {
      if (ch == sb.charAt(i)) {

        if (First == -1) {
          First = i;
        }
        Last = i;

      }

    }
    if (First != -1) {
      sb.deleteCharAt(Last);
      sb.deleteCharAt(First);

    }

    System.out.println(ch + " first found at index " + First);
    System.out.println(ch + " last found at index " + Last);
    System.out.println("String After Modified : " + sb.toString());
    sc.close();
  }
}
