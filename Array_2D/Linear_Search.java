package Array_2D;

import java.util.*;

public class Linear_Search {
  public static void LinearSearch(int numbers[][], int target) {
    boolean found = false;
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[0].length; j++) {
        if (target == numbers[i][j]) {
          found = true;
          System.out.println("The number found at index : " + i + "," + j);
          break;
        }
      }
    }
    if (!found) {
      System.out.println("The array does not exist element " + target);
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Write Down Linear Search Function to find X number in array
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
    System.out.println("Enter number to serach in array : ");
    int target = sc.nextInt();

    // print
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[0].length; j++) {
        System.out.println(numbers[i][j]);
      }
    }

    // function call
    LinearSearch(numbers, target);

    sc.close();
  }
}
