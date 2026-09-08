import java.util.Scanner;

public class CheckTemprature {
  public static void main(String[] args) {
    // Check the temperature if it is more than 100 then print you have a fever
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Temperature ");
    float temp = sc.nextFloat();

    if (temp >= 100) {
      System.out.println("You have fever ");

    } else {
      System.out.println("You are ok !!!");
    }

    String ans = temp > 100 ? "Fever" : "No Fever";
    System.out.println(ans);

    sc.close();
  }
}
