package Array;

public class Array_CountPositiveNegativeAndPrint {
  public static void CountPostiveNegtive(int arr[]) {
    // Count the positive , neagtive or zero.
    int postive = 0;
    int negative = 0;
    int zero = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        System.out.println("Positive Number " + arr[i]);
        postive += 1;
      } else if (arr[i] < 0) {
        System.out.println("Negative Number " + arr[i]);
        negative += 1;
      } else {
        zero += 1;
      }
    }
    System.out.println("=====================================================================");
    System.out.println("Positive Number Count : " + postive);
    System.out.println("Negative Number Count : " + negative);
    System.out.println("Zero  Number Count : " + zero);

  }

  public static void main(String[] args) {
    int n[] = { 2, 6, -4, 0, 6, -7, -33, -99, -1, 4, 99, 47, 63, 28, 82, 0, 0, 0, 0 - 44, -61, 93 };
    CountPostiveNegtive(n);
  }
}
