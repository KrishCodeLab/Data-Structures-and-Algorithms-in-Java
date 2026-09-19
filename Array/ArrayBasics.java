package Array;

import java.util.*;

public class ArrayBasics {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // What is Array : It is collection of similar data types that is stoted in
    // memory
    // Array is linear data stucture in which similar data types' elements are
    // stored

    // Oprations : Creation ,Input,Output,Update

    // Creation : Creating Array
    int array[] = new int[10];

    array[0] = 100;
    array[1] = 200;
    array[2] = 300;
    array[3] = 500;
    array[4] = 400;
    array[5] = 900;

    int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    System.out.println(numbers[2]);

    System.out.println(array[7] = 800);

    String Fruits[] = { "apple", "mango", "pineapple", "orange" };
    System.out.println(Fruits[3]);

    // Input : Assigning value to array's indexes using user input
    int marks[] = new int[10];
    for (int i = 0; i < marks.length; i++) {
      System.out.println("Enter value of index : " + i);
      marks[i] = sc.nextInt();
    }

    // length of the array
    System.out.println("Length of the marks array is " + marks.length);

    sc.close();

  }
}
