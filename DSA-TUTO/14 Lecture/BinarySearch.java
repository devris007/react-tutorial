public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = { -22, -10, -15, -7, 0, 12, 15, 18, 36, 45, 54, 65, 69, 89 };
    int target = -77;
    int ans = binarySearch(arr, target);
    System.out.println(ans);
  }

  // return the index
  // return -1 if does not found
  static int binarySearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      // find the moddle element
      // int mid = (start+end)/2; //might be possible (start + end) size exceeds the
      // range int

      // better way to write mid
      int mid = start + (end - start) / 2;

      if (target < arr[mid]) {
        end = mid - 1;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        // else -> target = mid
        return mid; // ans found
      }

    }
    return -1;
  }
}
