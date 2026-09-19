package Array;

import java.util.*;

public class Array_LinearSearch {
  public static int LinearSearch(int arr[], int x) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        System.out.println("Number found at index : " + i);
        break;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter element to search in array : ");
    int x = sc.nextInt();
    int arr[] = { 654, 787, 342, 23, 566, 898, 54, 3423, 754 };

    LinearSearch(arr, x);
    sc.close();
  }
}
