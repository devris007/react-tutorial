public class OrderAgnostics {
  public static void main(String[] args) {
    // int[] arr = { -22, -10, -15, -7, 0, 12, 15, 18, 36, 45, 54, 65, 69, 89 };
    int[] arr2 = { 89, 75, 65, 55, 45, 32, 22, 15, 8, 0, -5, -7, -15, -23, -31 };
    int target = 55;
    int ans = orderAgnosticsBS(arr2, target);
    System.out.println(ans);
  }

  static int orderAgnosticsBS(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    // find whether the array is sorted in ascending or descending order
    boolean isAsc = arr[start] < arr[end];

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (arr[mid] == target) {
        return mid;
      }

      if (isAsc) {
        if (target < arr[mid]) {
          end = mid - 1;
        } else { // target > arr[mid]
          start = mid + 1;
        }
      } else {
        if (target > arr[mid]) {
          end = mid - 1;
        } else { // target > arr[mid]
          start = mid + 1;
        }
      }

    }
    return -1;
  }
}
