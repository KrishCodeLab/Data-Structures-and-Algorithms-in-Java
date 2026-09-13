package Functions;

import java.util.*;

public class Function_Prime {
  public static void prime(int n) {
    boolean prime = true;
    if (n == 1) {
      System.out.println("The number is not prime");
    }

    if (n == 2) {
      prime = false;
      System.out.println();
    }

    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        prime = false;
        // System.out.println();
      }

    }

    if (prime == true) {
      System.out.println("The number is prime ");
    } else {
      System.out.println("The number is not prime");
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number to check the number is prime or not");
    int n = sc.nextInt();
    prime(n);
    sc.close();
  }
}
