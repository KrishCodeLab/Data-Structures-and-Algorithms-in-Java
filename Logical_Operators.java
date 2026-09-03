import java.util.*;

public class Logical_Operators {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Logical Operators :- and,or
    System.out.println("Enter Makrs");
    int marks = sc.nextInt();

    // Grade
    if (marks >= 90 & marks <= 100) {
      System.err.println("Grade A+ ");
    } else if (marks >= 80 & marks <= 89) {
      System.out.println("Grade A");
    } else if (marks >= 70 & marks <= 79) {
      System.out.println("Grade B");
    } else if (marks >= 60 & marks <= 69) {
      System.out.println("Grade C");
    } else if (marks >= 101) {
      System.out.println("WRONG INFORMARION !!! ");
    } else {
      System.out.println("Avg");
    }

    sc.close();
  }
}
