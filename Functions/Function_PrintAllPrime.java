package Functions;

import java.util.*;

public class Function_PrintAllPrime {
  public static void PrintAllPrime(int n) {
    // Print all prime numbers from 1 to n.
    // n = 20

    // Output:
    // 2 3 5 7 11 13 17 19
    for (int i = 2; i <= n; i++) {

      boolean isPrime = true;

      for (int j = 2; j < i; j++) {

        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }

      if (isPrime) {
        System.out.print(i + " ");
      }
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Function to print all Prime numbers between the range
    System.out.println("Enter number to print prime number between 1 to n ");
    int n = sc.nextInt();
    PrintAllPrime(n);
    sc.close();
  }
}
