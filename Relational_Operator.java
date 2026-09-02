import java.util.*;;

public class Relational_Operator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Relational Operator : >,<,==,<=,>=,!=
    System.out.println("Enter value of number1");
    int number1 = sc.nextInt();

    System.out.println("Enter value of number2");
    int number2 = sc.nextInt();

    System.out.println("Enter value of number3");
    int number3 = sc.nextInt();

    System.out.println("Enter value of number4");
    int number4 = sc.nextInt();

    System.out.println("Value of number1 : " + number1);
    System.out.println("Value of number2 : " + number2);
    System.out.println("Value of number3 : " + number3);
    System.out.println("Value of number4 : " + number4);

    System.out.println("Is number1 > number2 " + (number1 > number2));
    System.out.println("Is number1 < number2 " + (number1 < number2));
    System.out.println("Is number3 > number1 " + (number3 > number1));
    System.out.println("Is number2 > number3 " + (number2 > number3));
    System.out.println("Is number4 > number3 " + (number4 > number3));
    System.out.println("Is number3 == number2 " + (number3 == number2));
    System.out.println("Is number3 != number1 " + (number3 != number1));
    System.out.println("Is number2 <= number4 " + (number2 <= number4));
    System.out.println("Is number1 != number2 " + (number1 != number2));
    System.out.println("Is number2 >= number3 " + (number2 >= number3));
    // System.out.println("Is number2 == number2 " + (number2 == number2));

    sc.close();
  }
}
