package Functions;

import java.util.*;

public class FunctionBasics {
  public static void CalculateSum() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of n1: ");
    int n1 = sc.nextInt();
    System.out.println("Enter value of n2: ");
    int n2 = sc.nextInt();
    float sum = n1 + n2;
    System.err.println("Sum = " + sum);
    sc.close();
  }

  public static void main(String[] args) {
    CalculateSum();
  }
}