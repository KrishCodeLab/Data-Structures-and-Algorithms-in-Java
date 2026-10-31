package Strings;

import java.util.*;

public class IntroductionToString {
  public static void main(String[] args) {
    // What is string ?
    System.out.println("A String is a swquence of characters used to store text.");
    String FirstName = "Krushna";
    String LastName = "Govardhane";
    System.out.println("Name : " + FirstName);
    System.out.println("Name : " + LastName);

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Language Name : ");
    String LanguageName = sc.nextLine();
    System.out.println(LanguageName);

    sc.close();

  }
}
