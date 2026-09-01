public class TypeConversion {
  public static void main(String[] args) {
    // Widening Type Conversion — automatic
    // When you convert a smaller data type into a larger data type, Java does it
    // automatically.

    // Destination type > Source type
    // byte > short > int > float > long > double

    int a = 10;
    double b = a;
    long newa = a;

    System.out.println(b);
    System.out.println(newa);

    // Return error
    // long n = 1234567;
    // int num = n;
  }
}
