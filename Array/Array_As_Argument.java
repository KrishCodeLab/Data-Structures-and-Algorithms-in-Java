package Array;

import java.util.*;

public class Array_As_Argument {
  public static void printarray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(i);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num[] = new int[10];
    printarray(num);
    sc.close();
  }
}
