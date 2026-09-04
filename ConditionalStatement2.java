import java.util.*;

public class ConditionalStatement2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // else if Statement

    // Check Grade of Students based on their marks
    System.out.println("Enter marks of student");
    int marks = sc.nextInt();

    if (marks >= 90 && marks <= 100) {
      System.out.println("Grade A+");
    } else if (marks >= 80 && marks <= 89) {
      System.out.println("Grade A");
    } else if (marks >= 70 && marks <= 79) {
      System.out.println("Grade B");
    } else if (marks >= 60 && marks <= 69) {
      System.out.println("Grade C");
    } else if (marks < 35) {
      System.out.println("Grade F");
    } else {
      System.out.println("Average Student");
    }

    // Income Tax Calculator
    // Income Tax Calculator
    System.out.println("Enter Salary : ");
    float salary = sc.nextFloat();

    if (salary <= 500000) {

      System.out.println("Tax Free Salary Enjoy!!!");

    } else if (salary > 500000 && salary <= 1000000) {

      float tax = (salary * 5) / 100;
      System.out.println("Income Tax : " + tax);

    } else if (salary > 1000000 && salary <= 1500000) {

      float tax = (salary * 10) / 100;
      System.out.println("Income Tax : " + tax);

    } else if (salary > 1500000 && salary <= 2000000) {

      float tax = (salary * 15) / 100;
      System.out.println("Income Tax : " + tax);

    } else if (salary > 2000000 && salary <= 2500000) {

      float tax = (salary * 20) / 100;
      System.out.println("Income Tax : " + tax);

    } else if (salary > 2500000 && salary <= 5000000) {

      float tax = (salary * 25) / 100;
      System.out.println("Income Tax : " + tax);

    } else {

      float tax = (salary * 30) / 100;
      System.out.println("Income Tax : " + tax);
    }

    sc.close();
  }
}
