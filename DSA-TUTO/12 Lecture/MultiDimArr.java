import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArr {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    /*
     * 1 2 3
     * 4 5 6
     * 7 8 9
     */
    // int[][] arr = new int[3][]; // number of columns is not necessary to specify
    // System.out.println(arr.length); // no. of rows

    // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    // individual arrays can have different size when column size is not specified
    // int[] arr = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };

    // taking input
    int[][] arr = new int[3][3];

    // for rows
    for (int row = 0; row < arr.length; row++) {
      // for each column in each row
      for (int col = 0; col < arr[row].length; col++) {
        arr[row][col] = in.nextInt();
      }
    }

    // output
    // for (int row = 0; row < arr.length; row++) {
    // // for each column in every row
    // for (int col = 0; col < arr[row].length; col++) {
    // System.out.print(arr[row][col] + " ");
    // }
    // System.out.println();
    // }

    // output method 2
    // for (int row = 0; row < arr.length; row++) {
    // System.out.println(Arrays.toString(arr[row]));
    // }

    // output method 3
    for (int[] a : arr) {
      System.out.println(Arrays.toString(a));
    }

  }
}
