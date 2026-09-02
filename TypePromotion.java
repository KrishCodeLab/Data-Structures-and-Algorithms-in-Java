public class TypePromotion {
  public static void main(String[] args) {
    // Automatically promotes small data types into big when evaluating an
    // expression

    char a = 'a';
    char b = 'b';
    System.out.println((int) a);
    System.out.println((int) b);
    System.out.println(a - b);

    char d = 'd';
    short s = 15;
    byte by = 29;

    // byte be=d*s*by; -->print error

    // All data will convert in int
    int ans = d * s * by;

    System.out.println(ans);

    // All data will convert in double
    int n = 345;
    float n2 = 903493;
    long n3 = 5657654;
    double n4 = 676.7878787;

    double ans2 = n * +n2 + n3 - n4;
    System.out.println(ans2);
  }
}
