package SlidingWIndow;

public class ConstantWindow {
  public static int ConstantSizeSubArraySum(int arr[], int n) {
    int k = n;
    // int left=0;
    // int right=k-1;
    int maxSum = Integer.MIN_VALUE;
    // Last Starting index to calculate subarray
    int last_Starting_index = arr.length - n;
    for (int i = 0; i <= last_Starting_index; i++) {
      int currsum = 0;

      // To select exactly n elements from starting index
      int next_n_elements = i + n;
      for (int j = i; j < next_n_elements; j++) {
        currsum += arr[j];
      }

      if (currsum > maxSum) {
        maxSum = currsum;
      }
      k++;
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int n = 4;
    int arr[] = { -1, 2, 3, 3, 4, 5, -1 };
    System.out.println("The  Max sum of constant Window : " + ConstantSizeSubArraySum(arr, n));
  }
}
