import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    // syntax
    ArrayList<Integer> list = new ArrayList<>(10);

    // list.add(23);
    // list.add(654);
    // list.add(54);
    // list.add(478);
    // list.add(88);
    // list.add(457);
    // list.add(546);

    // System.out.println(list.contains(478));

    // to takr input
    for (int i = 0; i < 5; i++) {
      list.add(in.nextInt());
    }

    // to get element at index
    for (int i = 0; i < 5; i++) {
      System.out.print(list.get(i) + " "); // list[index] syntax will not work here.
    }

    // System.out.println(list);
    // list.set(0, 99);
    // list.remove(2);
    // System.out.println(list);

  }
}
