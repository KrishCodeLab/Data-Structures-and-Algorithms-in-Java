import java.util.*;

public class ConditionalStatement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number");
    int number = sc.nextInt();

    // if else condition
    if (number > 0) {
      System.out.println("The number is positive");
    } else {
      System.out.println("The number is negative");
    }

    // largest of 2
    System.out.println("Enter value of a : ");
    int num1 = sc.nextInt();

    System.out.println("Enter value of b : ");
    int num2 = sc.nextInt();

    if (num1 > num2) {
      System.out.println("num1 is largest ");
    } else {
      System.out.println("num2 is largest");
    }

    // print if a number is Odd or Even
    System.out.println("Enter number to check number is odd or even : ");
    int n = sc.nextInt();

    if (n % 2 == 0) {
      System.out.println("The number is even");
    } else {
      System.out.println("The number is odd");
    }

    sc.close();
  }
}
