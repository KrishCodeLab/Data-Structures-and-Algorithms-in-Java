package Array_2D;

import java.util.*;

public class Introduction {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Declaration
    // datatype [][] name=new datatype [rows][columns]
    System.out.println("Enter rows ");
    int rows = sc.nextInt();
    System.out.println("Enter columns : ");
    int columns = sc.nextInt();

    int[][] numbers = new int[rows][columns];
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[i].length; j++) {

        numbers[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[i].length; j++) {
        System.out.print(numbers[i][j] + " ");
      }
      System.out.println();
    }

    // datatype[][] name = { {} ,{}, {} };
    int[][] num = {
        { 1, 2, 3, 4, 5 },
        { 1, 2, 3, 4, 5 },
        { 1, 2, 3, 4, 5 }

    };

    // Outer loop run for rows
    for (int i = 0; i < num.length; i++) {
      // Inner loop run for columns
      for (int j = 0; j < num[i].length; j++) {
        System.out.print(num[i][j] + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
