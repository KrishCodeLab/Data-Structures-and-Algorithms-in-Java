import java.util.*;;

public class TernaryOperator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Ternary Operator :
    // Syntax : Variable = Condition ? statement1:statement2; first staement for
    // true and second one is for false

    System.out.println("Enter number to check the number is positive or not ");
    int number = sc.nextInt();

    String result = (number > 0) ? "positive" : "negative";
    System.out.println("The number is " + result);

    // Even or Odd
    System.out.println(number + " is even or odd");
    String evenodd = (number % 2 == 0) ? "Even" : "odd";
    System.out.println("The number is " + evenodd);

  }
}
