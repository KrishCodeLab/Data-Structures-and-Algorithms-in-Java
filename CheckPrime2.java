import java.util.*;

public class CheckPrime2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Prime Number - Optimized Code
    System.out.println("Enter number to check is it prime or not ");
    int number = sc.nextInt();
    boolean isPrime = true;
    // O(log n)
    if (number == 1) {
      isPrime = false;
    } else if (number == 2) {
      isPrime = false;
    } else {
      // Traverse remainging numbers
      for (int i = 2; i < Math.sqrt(number); i++) {
        // for (int i = 2; i < number; i++) {
        if (number % i == 0) {
          isPrime = true;
          break;
        }
      }

    }

    if (isPrime == true) {
      System.out.println("The number is not Prime number ");
    } else {
      System.out.println("The number is  Prime number ");
    }
    sc.close();

  }
}
