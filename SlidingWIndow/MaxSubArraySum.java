package SlidingWIndow;

public class MaxSubArraySum {
  public static int MaxSubarraySum(int arr[]) {
    // Initilaized Maxsum with Min Integer value
    int maxSum = Integer.MIN_VALUE;

    // Outer loop run for the first index
    for (int i = 0; i < arr.length; i++) {

      // currsum calculate for the every subarray
      int currSum = 0;
      // Inner loop run for the next elements of the starting index
      for (int j = i; j < arr.length; j++) {
        // System.out.println("SubArray of " + arr[i] + "= " + arr[j]);
        // Add a current index into currsum
        currSum += arr[j];

        // System.out.println("The currsum of Latest Subarray is : " + currSum);
        if (currSum > maxSum) {
          maxSum = currSum;
        }

      }
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int arr[] = { 2, -1, 3, 4, -2 };
    System.out.println("Maximum Subarray sum : " + MaxSubarraySum(arr));
  }
}
