public class Max {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 23, 9, 18 };
    // System.out.println(max(arr));
    System.out.println(maxRange(arr, 1, 4));
  }

  // static int max(int[] arr) {
  // int maxVal = arr[0];
  // for (int i = 0; i < arr.length; i++) {
  // if (arr[i] > maxVal) {
  // maxVal = arr[i];
  // }
  // }

  // to find max in a range
  static int maxRange(int[] arr, int start, int end) {
    int maxVal = arr[start];
    for (int i = 0; i < end; i++) {
      if (arr[i] > maxVal) {
        maxVal = arr[i];
      }
    }
    return maxVal;
  }

}
