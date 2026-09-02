import java.util.*;

public class Assignment_Operators {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Operators : Special Sysmbols to perform operations
    // 1 Arithmetic Operator : +,-,/,*,%

    System.out.println("Enter value of n1 ");
    int n1 = sc.nextInt();

    System.out.println("Enter value of n1 ");
    int n2 = sc.nextInt();

    int add = n1 + n2;
    int sub = n1 - n2;
    int mul = n1 * n2;
    int div = n1 / n2;
    int remainder = n1 % n2;

    System.err.println("The addition of " + "n1 = " + n1 + ", n2 = " + n2 + ", is  Addition = " + add);
    System.err.println("The substraction of " + "n1 = " + n1 + ", n2 = " + n2 + ", is  Substraction = " + sub);
    System.err.println("The Mutliplication of " + "n1 = " + n1 + ", n2 = " + n2 + ", is  Multiplication = " + mul);
    System.err.println("The Division of " + "n1 = " + n1 + ", n2 = " + n2 + ", is  Division = " + div);
    System.err.println("The Remainder of " + "n1 = " + n1 + ", n2 = " + n2 + ", is  Remainder = " + remainder);

    sc.close();
  }
}
