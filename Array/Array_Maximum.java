package Array;

import java.util.*;

public class Array_Maximum {
  public static int findMax(int numbers[]) {
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < numbers.length; i++) {
      if (max <= numbers[i]) {
        max = numbers[i];
      }
    }
    return max;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numbers[] = new int[6];
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Enter value of array's index i : " + i);
      numbers[i] = sc.nextInt();
    }

    System.out.println(findMax(numbers));
    sc.close();

  }
}
