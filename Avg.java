import java.util.*;

public class Avg {
  public static void main(String[] args) {
    // Average of 3 numbers
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter value of num1");
    int num1 = sc.nextInt();

    System.out.println("Enter value of num2");
    int num2 = sc.nextInt();

    System.out.println("Enter value of num3 ");
    int num3 = sc.nextInt();

    // Calculating Average of three numbers
    int avg = (num1 + num2 + num3) / 3;

    System.out.println("Average : " + avg);

    sc.close();
  }
}
