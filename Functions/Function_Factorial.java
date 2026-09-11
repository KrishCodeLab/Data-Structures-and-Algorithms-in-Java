package Functions;

import java.util.*;

public class Function_Factorial {

  public static int Factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;

    }
    return fact;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Write a function to calculate the factorial of the n
    System.out.println("Enter value of n to calculate the factorial of n ");
    int n = sc.nextInt();
    System.out.println(Factorial(n));
    sc.close();
  }
}
