package Sorting;

public class InsertionSort {
  public static void main(String[] args) {
    int arr[] = { 3, 6, 7, 2, 9, 1 };
    // Starting outerloop from 1 to check previous elements
    for (int i = 1; i < arr.length; i++) {
      int key = arr[i];
      int j;
      for (j = i - 1; j >= 0; j--) {
        if (arr[j] > key) {
          arr[j + 1] = arr[j];
        } else {
          break;
        }

      }
      // Insert key after the inner loop
      arr[j + 1] = key;

    }

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
