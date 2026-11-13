package Array_2D;

import java.util.*;

public class Print_Boundary {
  public static void Boundary_Print(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        if (i == 0 || j == 0 || i == array.length - 1 || j == array[0].length - 1) {
          System.out.print(array[i][j] + " ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter rows : ");
    int rows = sc.nextInt();
    System.out.println("Enter columns : ");
    int columns = sc.nextInt();

    int[][] array = new int[rows][columns];

    // user input
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = sc.nextInt();
      }
    }

    System.out.println("2D Array ! ");
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }

    // function call
    Boundary_Print(array);
    sc.close();
  }
}
