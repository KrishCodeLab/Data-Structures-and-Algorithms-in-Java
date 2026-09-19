package Array;

import java.util.Scanner;

public class Array_CountExistenceOfNumber {
  public static int CountExistenceOfNumberInArray(int n[], int x) {
    int count = 0;
    for (int i = 0; i < n.length; i++) {
      if (n[i] == x) {
        count += 1;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n[] = { 1, 2, 3, 4, 1, 3, 4, 5, 2, 6, 1, 1, 1, 0, 3, 2, 4, 5, 2, 2, 2, 3, 1, 0, 1, 3, 2, 1 };
    System.out.println("Enter number to count the existence of that number in the collection : ");
    int x = sc.nextInt();
    System.out.println(CountExistenceOfNumberInArray(n, x));
    sc.close();
  }
}
