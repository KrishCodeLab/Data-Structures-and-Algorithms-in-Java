import java.util.*;

public class Loops_ReverseNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Print the reverse of the number
    System.out.println("Enter Number : ");
    int number = sc.nextInt();

    System.out.println(number);

    int rev_no = 0;
    while (0 < number) {
      int last_digit = number % 10;
      rev_no = (rev_no * 10) + last_digit;
      number = number / 10;
    }

    System.out.println(rev_no);
    sc.close();

  }
}
