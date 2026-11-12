package Array_2D;

import java.util.*;

public class Transpose_Matrix {
  public static void Transpose(int[][] array) {
    Scanner sc = new Scanner(System.in);
    // total rows = exist column
    int rows = array[0].length;
    // total column = exist row
    int columns = array.length;
    int[][] new_arr = new int[rows][columns];

    // Assigning values
    for (int i = 0; i < new_arr.length; i++) {
      for (int j = 0; j < new_arr[0].length; j++) {
        new_arr[i][j] = array[j][i];
      }
    }

    // print
    for (int i = 0; i < new_arr.length; i++) {
      for (int j = 0; j < new_arr[0].length; j++) {
        System.out.print(new_arr[i][j] + " ");
      }
      System.out.println();
    }
    sc.close();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Write function to transpose matrix
    System.out.println("Enter rows : ");
    int rows = sc.nextInt();
    System.out.println("Enter columns : ");
    int columns = sc.nextInt();
    int[][] new_arr = new int[rows][columns];

    // User input
    for (int i = 0; i < new_arr.length; i++) {
      for (int j = 0; j < new_arr[0].length; j++) {
        new_arr[i][j] = sc.nextInt();
      }
    }

    // print
    for (int i = 0; i < new_arr.length; i++) {
      for (int j = 0; j < new_arr[0].length; j++) {
        System.out.print(new_arr[i][j] + " ");
      }
      System.out.println();
    }
    // Function call
    Transpose(new_arr);
    sc.close();
  }
}
