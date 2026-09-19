package Array;

public class Array_Poduct {
  public static int Product(int num[]) {
    int product = 1;
    for (int i = 0; i < num.length; i++) {
      product *= num[i];
    }
    return product;
  }

  public static void main(String[] args) {
    int num[] = { 1, 2, 3, 4, 5 };
    System.out.println(Product(num));
  }
}
