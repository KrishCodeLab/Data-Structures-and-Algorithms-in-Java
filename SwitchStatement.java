import java.util.*;

public class SwitchStatement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Switch :-In Java, the switch statement is a decision-making statement used to
    // execute one block of code from multiple possible options. It is often cleaner
    // and easier to read than using many if-else statements.

    System.out.println("Enter Fruit name to check fruit information");
    String fruit = sc.nextLine();

    switch (fruit) {
      case "Apple":
        System.out.println("Red fruit");
        break;

      case "Banana":
        System.out.println("Yellow fruit");
        break;

      case "Orange":
        System.out.println("Orange fruit");
        break;

      case "Guava":
        System.out.println("Green Fruit");
        break;

      case "Pineapple":
        System.out.println("Gray Fruit");
        break;

      case "DragonFruit":
        System.out.println("Pink Fruit");
        break;
      default:
        System.out.println("Unknown fruit");
    }
    sc.close();
    // Working of switch Statement :
    // The expression is evaluated once.
    // Its value is compared with each case.
    // If a matching case is found, the corresponding code runs.
    // The break statement exits the switch.
    // If no case matches, the default block executes (if provided).
  }
}
