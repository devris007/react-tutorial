import java.util.Scanner;

public class CountNums {
  public static void main(String[] args) {
    // count the number of times a single digit is occuring in a given number

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    int count = 0;
    while (n > 0) {
      int rem = n % 10;
      if (rem == 3) {
        count++;
      }

      n = n / 10;
    }

    System.err.println(count);
  }
}
