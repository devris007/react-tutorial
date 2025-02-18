import java.util.Arrays;

public class VarArgs {
  // public static void main(String[] args) {
  // fun(); // give empty array
  // fun(2, 3, 5, 45, 8, 89);
  // }

  // static void fun(int... v) { // ...v is passing an array of integers ->
  // variable length argument
  // System.out.println(Arrays.toString(v));

  // }

  public static void main(String[] args) {
    multiple(1, 2, "Rishu", "Priya", "Alok", "Aman");
  }

  static void multiple(int a, int b, String... v) { // variable length argument should always come at // the end becoz
                                                    // how would u know the length of that if u write in between

  }
}
