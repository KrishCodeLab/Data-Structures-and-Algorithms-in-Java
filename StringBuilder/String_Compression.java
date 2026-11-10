package StringBuilder;

import java.util.*;

public class String_Compression {
  public static String Compression(String s) {
    // Write Function for String Compression aabbbcccc ---> a2b3c4
    // stored string s in strigbuilder sb
    StringBuilder sb = new StringBuilder(s);

    // defined empyt stringbuilder compression to store result
    StringBuilder compression = new StringBuilder();

    // defined count and initialized it with 1 because starting char should count
    int count = 1;

    for (int i = 0; i < sb.length(); i++) {
      // Checking consecutive char and length out of bound due to i+1
      if (i + 1 < sb.length() && sb.charAt(i) == sb.charAt(i + 1)) {
        count++;
      } else {
        // if next character is different append current character and its count in
        // reult compression
        compression.append(sb.charAt(i));
        compression.append(count);

        // Reset count to 1 to count from 1 for next another char
        count = 1;
      }
    }
    // converting strinbuilder to string to return
    return compression.toString();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String : ");
    String s = sc.nextLine();
    System.out.println(Compression(s));
    sc.close();
  }
}
