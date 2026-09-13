package Functions;

import java.util.*;

public class Function_EvenOdd {
  public static int EvenOdd(int n) {

    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        System.out.println(i + " The number is even ");
      } else if (i % 2 == 1) {
        System.out.println(i + " The number is odd ");
      } else {
        System.out.println("Wrong Number");
      }
    }
    return 0;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number to check is it even or odd ");
    int n = sc.nextInt();
    EvenOdd(n);
    sc.close();
  }
}
