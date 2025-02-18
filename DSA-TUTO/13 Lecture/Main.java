public class Main {

  public static void main(String[] args) {
    int[] nums = { 12, 45, 65, 85, 49, 2, -4, 5, -7 };
    int target = 497;
    int ans = linearSearch(nums, target);
    System.out.println(ans);
  }

  // search in the array: return the index if found
  // otherwise if item not found return -1
  static int linearSearch(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }

    // run a for loop
    // for (int i = 0; i < arr.length; i++) {
    // // check for element at every index if it = target
    // int element = arr[i];
    // if (element == target) {
    // return i;
    // }
    // }

    for (int element : arr) {
      if (element == target) {
        return element;
      }
    }

    // this line will execute if none of the return statements above have executed
    // hence the target not found
    return -1;
  }
}