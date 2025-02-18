public class FunctnOverloading {
  public static void main(String[] args) {
    fun(07);
    fun("Rishu", 007);
  }

  // two functions with the same name can coexist if they have the different
  // argument

  static void fun(int a) {
    System.out.println(a);
  }

  static void fun(String name, int b) {
    System.out.println(name);
  }

  static void demo(String... v) {

  }

  static void demo(int... v) {

  }
}
