import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputs {
  public static void main(String[] args) {
    int[] arr = new int[5];
    Scanner in = new Scanner(System.in);

    // taking input
    for (int i = 0; i < 5; i++) {
      arr[i] = in.nextInt();
    }

    // print the array -> method 1
    // for (int i = 0; i < 5; i++) {
    // System.out.print(arr[i] + " ");
    // }

    // method 2 to print array
    // for (int num : arr) { // for every element in array, print the element
    // System.out.print(num + " "); // here num represents the elements of the array
    // }

    // method 3 to print array
    System.out.println(Arrays.toString(arr));

  }
}
