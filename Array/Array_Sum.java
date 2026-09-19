package Array;

public class Array_Sum {
  public static int sumOfArray(int num[]) {
    int sum = 0;
    for (int i = 0; i < num.length; i++) {
      sum += num[i];
    }
    return sum;
  }

  public static void main(String[] args) {
    int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    System.out.println(sumOfArray(num));
  }
}
