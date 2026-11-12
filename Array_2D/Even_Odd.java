package Array_2D;

import java.util.*;

public class Even_Odd {
  public static void Even_Odd_Numbers(int[][] n) {
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[0].length; j++) {
        if (n[i][j] % 2 == 0) {
          System.out.println("Even Number : " + n[i][j]);
        } else {
          System.out.println("Odd Number : " + n[i][j]);
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Write Down function that prints even or odd elements of 2D array
    System.out.println("Enter rows : ");
    int rows = sc.nextInt();
    System.out.println("Enter columns : ");
    int columns = sc.nextInt();
    int[][] numbers = new int[rows][columns];

    // User input
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[0].length; j++) {
        numbers[i][j] = sc.nextInt();
      }
    }

    // print
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[0].length; j++) {
        System.out.print(numbers[i][j] + " ");
      }
      System.out.println();
    }

    // function call
    Even_Odd_Numbers(numbers);
    sc.close();
  }
}
