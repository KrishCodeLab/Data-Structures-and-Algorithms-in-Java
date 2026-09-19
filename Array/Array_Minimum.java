package Array;

import java.util.*;

public class Array_Minimum {
  public static int Minimum(int number[]) {
    int Min = Integer.MAX_VALUE;
    for (int i = 0; i < number.length; i++) {
      if (Min > number[i]) {
        Min = number[i];
      }
    }
    return Min;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number[] = new int[5];
    for (int i = 0; i < number.length; i++) {
      System.out.println("Enter value of array's index i : " + i);
      number[i] = sc.nextInt();
    }

    System.out.println(Minimum(number));
    sc.close();
  }
}
