package Functions;

import java.util.*;

public class Function_Parameters {
  public static void CalculateSum(int a, int b) {
    int sum = a + b;
    System.out.println("Sum = " + sum);
  }

  public static void CalculateSub(int a, int b) {
    int sub = a - b;
    System.out.println("Sub = " + sub);
  }

  public static void CalculateMul(int a, int b) {
    int mul = a * b;
    System.out.println("Mul = " + mul);
  }

  public static void CalculateDiv(int a, int b) {
    int div = a / b;
    System.out.println("div = " + div);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of a and b :");
    int a = sc.nextInt();
    int b = sc.nextInt();

    CalculateSum(a, b);
    CalculateMul(a, b);
    CalculateSub(a, b);
    CalculateDiv(a, b);
    sc.close();
  }
}
