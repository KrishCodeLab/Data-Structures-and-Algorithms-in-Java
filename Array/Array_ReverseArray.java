package Array;

public class Array_ReverseArray {
  public static void ReverseArray(int n[]) {
    // Reverse a given Array

    int start = 0;
    int end = n.length - 1;
    while (start <= end) {
      int temp = start;
      n[start] = n[end];
      n[end] = temp;

      start++;
      end--;
    }
    for (int i = 0; i < n.length; i++) {
      System.out.println(n[i]);
    }
  }

  public static void main(String[] args) {
    int n[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    ReverseArray(n);

  }
}
