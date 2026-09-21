package Array;

public class Array_PairsInArray {
  public static void printAllPairs(int arr[]) {
    // Print number of pairs in array with repetations
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        System.out.println("( " + arr[i] + "," + arr[j] + " )");
        count++;
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6 };
    printAllPairs(arr);
  }
}
