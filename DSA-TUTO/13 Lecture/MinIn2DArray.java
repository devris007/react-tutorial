public class MinIn2DArray {
  public static void main(String[] args) {
    int[][] arr = { { 4, 5, 8 }, { 12, 15, 64, 8 }, { 45, 69, 89, 78, 53 } };
    System.out.println(max(arr));
  }

  static int max(int[][] arr) {
    int max = Integer.MIN_VALUE;
    for (int[] ints : arr) {
      for (int element : ints) {
        if (element > max) {
          max = element;
        }
      }
    }

    return max;
  }
}
