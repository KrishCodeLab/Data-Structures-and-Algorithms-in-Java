package Functions;

import java.util.*;

public class Function_Product {
  public static int Product(int a, int b, int c) {
    // Write function to calculate product of 3 numbers
    int product = a * b * c;
    return product;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter value of a,b,c : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    System.out.println(Product(a, b, c));
    sc.close();
  }
}
