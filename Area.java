import java.util.*;

public class Area {
  public static void main(String[] args) {
    // Calculate area of square,rectangle
    Scanner sc = new Scanner(System.in);

    // Square
    System.out.println("Enter side of square ");
    int side = sc.nextInt();

    int area_of_square = side * side;

    // Rectangle
    System.out.println("Enter height of rectangle ");
    float height = sc.nextFloat();
    System.out.println("Enter  width of rectangle ");
    float width = sc.nextFloat();

    float area_of_rectanlge = 2 * (height + width);

    System.out.println("Area of Square :" + area_of_square);
    System.out.println("Area of Rectangle :" + area_of_rectanlge);
  }
}
