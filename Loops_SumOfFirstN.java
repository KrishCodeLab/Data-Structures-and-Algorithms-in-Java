import java.util.*;

public class Loops_SumOfFirstN {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // print sum of first n numbers using while loop
    System.out.println("Enter value of n : ");
    int n = s.nextInt();
    int sum = 0;
    int count = 0;
    while (count <= n) {
      sum = count + sum;
      count++;
    }
    System.out.println("Sum = " + sum);

    // print sum of first n number using for loop
    int sum2 = 0;
    for (int i = 0; i <= n; i++) {
      sum2 = sum2 + i;

    }
    System.out.println("Sum = " + sum2);

    s.close();
  }
}
