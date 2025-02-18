public class Scope {
  public static void main(String[] args) {
    // int a = 4;
    // String name = "Rishu Kumar";

    {
      // int a = 20; // a is already initialized above
      // a = 40; // but we can change the value.(reassign the original reference
      // variable to some
      // other value)
      // System.out.println(a);
      // name = "Mohan Gupta";
      // System.out.println(name);

      int c = 100;
      System.out.println(c);

    }

    // System.out.println(a);
    // System.out.println(name);

    int c = 200; // c can be reinitialized although it is already initialized in the above block
    System.out.println(c);
  }
}
