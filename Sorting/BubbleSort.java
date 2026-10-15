package Sorting;

public class BubbleSort {
  public static void main(String[] args) {
    int arr[] = { 8, 4, 3, 7, 9, 1 };

    // Number of pass
    for (int i = 0; i < arr.length - 1; i++) {
      // Checking each number of array and run it lenght-i because i pass already
      // performed.
      for (int j = 0; j < arr.length - i - 1; j++) {
        // Swapping Two Numbers
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    // System.out.println(java.util.Arrays.toString(arr));
    // print
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

  }
}
