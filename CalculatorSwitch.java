import java.util.*;

public class CalculatorSwitch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Perform the operations like calculator

    System.out.println("Enter the value of n1 : ");
    int n1 = sc.nextInt();
    System.out.println("Enter the value of n2 : ");
    int n2 = sc.nextInt();

    System.out.println("Which type of operation you want to perform on calculator : ");
    System.out.println("Addition --> + , Subtraction --> - , Multiply --> * ,Division --> / ");
    String req = sc.next();

    switch (req) {
      case "+":
        int sum = n1 + n2;
        System.out.println("Addition = " + sum);
        break;

      case "-":
        int sub = n1 - n2;
        System.out.println("Substraction = " + sub);
        break;

      case "*":
        int mul = n1 * n2;
        System.out.println("Multiplication = " + mul);
        break;

      case "/":
        int div = n1 / n2;
        System.out.println("Division = " + div);
        break;
      default:
        System.out.println("Invalid Operation");

    }
    sc.close();
  }
}
