package Array;

public class Array_CpuntEvenOdd {
  public static void CountEvenOdd(int arr[]) {
    // Count the number of even and odd elements
    int Even = 0;
    int Odd = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        Even += 1;
      } else {
        Odd += 1;
      }

    }

    System.out.println("Even number count : " + Even);
    System.out.println("Odd number count : " + Odd);

  }

  public static void main(String[] args) {
    // Count the number of even and odd elements
    int arr[] = { 34, 6, 2, 0, 39, 54, 0, 12, 0, 31, 25, 0, 69, 56 };
    CountEvenOdd(arr);

  }
}
