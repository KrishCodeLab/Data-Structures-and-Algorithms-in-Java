package Sorting;

public class SelectionSort {
  public static void main(String[] args) {
    int arr[] = { 8, 4, 3, 7, 9, 1 };
    // int smallest = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length - 1; i++) {
      // Stores the smallest number index
      int minIdx = i;

      // Finding smallest number in unsorted array then stores it's index
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[minIdx] > arr[j]) {
          minIdx = j;
        }
      }
      // Swapping smallest number of unsorted array with sorted array's smallest
      int temp = arr[i];
      arr[i] = arr[minIdx];
      arr[minIdx] = temp;

    }

    // Printing arrya after sorting
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
