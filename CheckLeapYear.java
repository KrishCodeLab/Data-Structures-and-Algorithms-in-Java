import java.util.*;

public class CheckLeapYear {
  public static void main(String[] args) {
    // Check the given year is leap year or not
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter year ");
    int year = sc.nextInt();

    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
      System.out.println("The year " + year + " is leap year");
    } else {
      System.out.println("The year is not leap year");
    }

    sc.close();
  }
}
