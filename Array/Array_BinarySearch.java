package Array;

// import java.util.*;

public class Array_BinarySearch {
  public static void BinarySearch(int n[], int x) {
    int start = 1;
    int end = n.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (n[mid] == x) {
        System.out.println("Found at idx " + mid);
        break;
      }

      if (n[mid] < x) {
        mid = mid + 1;
      } else {
        mid = mid - 1;
      }
    }

  }

  public static void main(String[] args) {

    int n[] = { 2, 4, 6, 8, 12, 14, 16, 18, 20 };
    BinarySearch(n, 12);
  }
}
