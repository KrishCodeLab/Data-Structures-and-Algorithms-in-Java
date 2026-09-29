
public class Array_CurrSum_And_MaxSum {
  public static void PrintMaxSumofSubArray(int arr[]) {
    // Initialized maxsum=0 to calculate maxsum after every iteration
    int maxsum = 0;

    // Running outer loop to make a pairs of the single elements with others

    for (int i = 0; i < arr.length; i++) {
      // Currsum to calculate the sum every time and after caculation compare it with
      // maxsum then again initialize with 0
      int currsum = 0;
      // Initilized currStart with arr[i] to run code from currstart to
      int currStart = arr[i];
      for (int j = i + 1; j < arr.length; j++) {
        for (int k = currStart; k < arr.length; k++) {
          System.out.println();
        }
        System.out.println("( " + currStart + "," + arr[j] + " )");
        currsum += arr[i] + arr[j];
        System.out.println("Sub Array sum = " + currsum);

      }
      if (maxsum < currsum) {
        maxsum = currsum;
      }
    }
    System.out.println("Max Sub array sum : " + maxsum);
  }

  public static void main(String[] args) {
    int arr[] = { 2, -1, 3, 4, -2 };
    PrintMaxSumofSubArray(arr);
  }
}
