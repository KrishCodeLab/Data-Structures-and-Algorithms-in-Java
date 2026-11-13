package Array_2D;

import java.util.*;

public class Addtion_2Matrices {
  public static void Matrices_Addition(int[][] first, int[][] second) {
    if (first.length != second.length || first[0].length != second[0].length) {
      System.out.println("Both array must have same rows and columns : ");
      return;
    }
    int rows = first.length;
    int columns = first[0].length;

    int[][] addition = new int[rows][columns];

    for (int i = 0; i < addition.length; i++) {
      for (int j = 0; j < addition[i].length; j++) {
        // Addition of first and second
        addition[i][j] = first[i][j] + second[i][j];
      }
    }

    System.out.println("Addition Matix : ");
    // Print Addition array
    for (int i = 0; i < addition.length; i++) {
      for (int j = 0; j < addition[i].length; j++) {
        System.out.print(addition[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Addition of 2 Matrices
    System.out.println("Enter Rows of Matrix 1 : ");
    int rows1 = sc.nextInt();
    System.out.println("Enter Columns of Matrix 1 : ");
    int columns1 = sc.nextInt();

    System.out.println("Enter Rows of Matrix 2 : ");
    int rows2 = sc.nextInt();
    System.out.println("Enter Columns of Matrix 2 :");
    int columns2 = sc.nextInt();

    // User input for 1st matrix
    int[][] first_matrix = new int[rows1][columns1];

    for (int i = 0; i < first_matrix.length; i++) {
      for (int j = 0; j < first_matrix[i].length; j++) {
        first_matrix[i][j] = sc.nextInt();
      }
    }
    System.out.println("First matrix insertion of elements completed");
    int[][] second_matrix = new int[rows2][columns2];

    for (int i = 0; i < second_matrix.length; i++) {
      for (int j = 0; j < second_matrix[i].length; j++) {
        second_matrix[i][j] = sc.nextInt();
      }
    }
    System.out.println("Second matrix insertion of elements completed");

    // function call
    Matrices_Addition(first_matrix, second_matrix);
    sc.close();
  }
}
