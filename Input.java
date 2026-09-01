import java.util.*;

public class Input {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your name : ");
    String name = sc.next();

    System.out.println("Enter your full name ");
    String fullname = sc.nextLine();

    System.out.println("Enter your age : ");
    int age = sc.nextInt();

    System.out.println("Enter your marks :");
    float marks = sc.nextFloat();

    System.out.println("My name is : " + name);
    System.out.println("My fullname is : " + fullname);
    System.out.println("My age is : " + age);
    System.out.println("My marks are : " + marks);

    sc.close();
  }
}
