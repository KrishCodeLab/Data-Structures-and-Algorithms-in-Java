public class TypeCasting {
  public static void main(String[] args) {
    // Narrowing Type Casting : manual
    // When you convert a larger data type into a smaller data type, Java does not
    // do it automatically

    // Syntax : smallerType variable = (smallerType) value;
    double price = 99.99;

    int result = (int) price;

    System.out.println(result);

    double num = 4524.68674;
    float number = (float) num;
    System.out.println(number);
  }
}
