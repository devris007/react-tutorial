public class TypeCasting {
  public static void main(String[] args) {

    // type casting
    // int num = (int) (67.54f);
    // System.out.println(num);

    // automatic type promotion in expressions
    // int a = 257;
    // int b = (byte) (a);a
    // System.out.println(b); // 257 % 256 = 1

    // byte a = 40;
    // byte b = 50;
    // byte c = 100;

    // int d = (a * b) / c; // 20
    // System.out.println(d);

    // int num = 'a';
    // System.out.println(num);

    byte b = 42;
    char c = 'a';
    short s = 1024;
    int i = 50000;
    float f = 5.67f;
    double d = 0.1234;
    double result = (f * b) + (i / c) - (d * s);
    // float + integer - double = double
    System.out.println((f * b) + " " + (i / c) + " " + (d * s));
    System.out.println(result);
  }
}
