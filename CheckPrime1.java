import java.util.*;

public class CheckPrime1 {
  public static void main(String[] args) {

    // A prime number is a number greater than 1 that has exactly two factors:1 ,
    // itself

    // Taking input
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of n : ");
    int n = sc.nextInt();

    boolean value = true; // Value=false if n is not divisble by any number
    // check for 1
    if (n <= 1) {
      value = false;
      // System.out.println("Hello from first block");

    } else if (n == 2) { // check for 2
      value = true;
      // System.out.println("Hello from second block");

    } else {
      // Run loop for existing n-1
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          value = false;
          // System.out.println("Hello from third block" + i);

          break; // Does not need to check furture numbers
        }

      }
    }

    // checking value
    if (value == true) {
      // System.out.println("Hello from fourth block");

      System.out.println("The " + n + " is prime number");
    } else {
      // System.out.println("Hello from fifth block");

      System.out.println("The " + n + " is not prime number");

    }
    sc.close();
  }
}
