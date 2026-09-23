package Array;

public class Array_SumOfPairs {
  public static int PrintPairsAndReturnSum(int arr[]){
    // Print Pairs and Also print the sum of all pairs
    int currsum=0;
    int count=0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i+1; j < arr.length; j++) {
        currsum +=arr[i]+arr[j];
        System.out.println("( "+arr[i]+" , "+arr[j]+" ) ");
        count++;
      }
    }
    System.out.println(count);
    return currsum;
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    System.out.println(PrintPairsAndReturnSum(arr));
  }
}
