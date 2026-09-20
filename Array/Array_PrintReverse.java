package Array;

public class Array_PrintReverse {
  public static void Reverse(int n[]) {
    // Print the array in reverse order.
    int i = n.length - 1;
    // using while loop
    while (i >= 0) {
      System.out.println(n[i]);
      i--;
    }
    System.out.println();
    System.out.println();

    // Using for loop
    for (int j = n.length - 1; j >= 0; j--) {
      System.out.println(n[j]);
    }

  }

  public static void main(String[] args) {
    int n[] = { 1, 2, 3, 4, 5, 6 };
    Reverse(n);
    // System.out.println(n.length);
  }
}
