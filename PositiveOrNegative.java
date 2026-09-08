import java.util.*;

public class PositiveOrNegative {

  public static void main(String[] args) {
    // Check a given number is positive or negative in some unique way

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int ans = (n > 0) ? 1 : -1;
    if (n == 0) {
      ans = 0;
    }

    switch (ans) {
      case 0:
        System.out.println("The number is zero");
        break;
      case 1:
        System.out.println("The number is positive ");
        break;
      case -1:
        System.out.println("The number is neagative");

      default:
        System.out.println("Wrong Req");
    }
    sc.close();
  }
}
