package Array_2D;

import java.util.*;

public class Print_Spiral_Boundary {
  public static void print_Spiral_Boundary(int[][] spiral) {
    int startRow = 0;
    int endRow = spiral.length - 1;
    int startCol = 0;
    int endCol = spiral[0].length - 1;

    while (startCol <= endRow && startRow <= endRow) {
      // Print top border: Left ----> Right
      for (int i = startCol; i <= endCol; i++) {
        System.out.print(spiral[startRow][i] + " ");
      }
      startRow++;
      // Print right border : Top ---> Bottom
      for (int i = startRow; i <= endRow; i++) {
        System.out.print(spiral[i][endCol] + " ");
      }
      endCol--;
      // Print bottom border : Right ---->Left
      if (startRow <= endRow) {
        for (int i = endCol; i >= startCol; i--) {
          System.out.print(spiral[endRow][i] + " ");
        }
        endRow--;
      }
      // Print left border : Bottom ----> Top
      if (startCol <= endCol) {
        for (int i = endRow; i >= startRow; i--) {
          System.out.print(spiral[i][startCol] + " ");
        }
        startCol++;
      }
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
    // Function call
    print_Spiral_Boundary(array);
    sc.close();
  }
}
