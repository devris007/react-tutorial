public class Evendigits {
  public static void main(String[] args) {
    int[] nums = { 12, 345, 2, 6, 7896, 546987, -47 };
    int ans = findEven(nums);
    System.out.println(ans);
  }

  static int findEven(int[] arr) {
    int count = 0;
    for (int el : arr) {
      if (even(el)) {
        count++;
      }
    }

    return count;
  }

  static boolean even(int el) {
    int numberOfDigits = digits2(el);
    // System.out.print(numberOfDigits + " "); // shortcut to find the number of
    // digits

    // if (numberOfDigits % 2 == 0) {
    // return true;
    // }
    // return false;

    return numberOfDigits % 2 == 0;
  }

  static int digits2(int num) {
    return (int) (Math.log10(num)) + 1;

  }

  // static int digits(int num) {

  // if (num < 0) {
  // num = num * -1;
  // }

  // if (num == 0) {
  // return 1;
  // }

  // int count = 0;
  // while (num > 0) {
  // count++;
  // num = num / 10;
  // }
  // return count;
  // }
}
