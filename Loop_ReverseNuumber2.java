import java.util.*;

public class Loop_ReverseNuumber2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Print Reverse Number
    System.out.println("Enter Number : ");
    int number = sc.nextInt();

    while (number > 0) {
      int last_digit = number % 10;
      System.out.print(last_digit);
      number /= 10;
    }

  }
}
