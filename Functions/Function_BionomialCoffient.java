package Functions;

import java.util.*;

public class Function_BionomialCoffient {
  public static int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;

    }
    return fact;
  }

  public static int bionomialCoffieint(int n, int r) {
    int n_fact = factorial(n);
    int r_fact = factorial(r);

    int nmr_fact = factorial(n - r);

    int bionomialCofficient = n_fact / (r_fact * nmr_fact);
    return bionomialCofficient;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter value of r and n");
    int n = sc.nextInt();
    int r = sc.nextInt();

    System.out.println(bionomialCoffieint(n, r));
    sc.close();

  }

}