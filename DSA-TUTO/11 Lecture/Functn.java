import java.util.Arrays;

public class Functn {

  public static void main(String[] args) {
    // String name = "Rishu Kumar";
    // nameChange(name);
    // System.out.println(name);

    // arrays will be changed on calling a function
    int[] arr = { 2, 5, 4, 8, 6 };
    changeValue(arr);
    System.out.println(Arrays.toString(arr));

  }

  // static void nameChange(String naam) {
  // naam = "Rahul Kumar"; // here we are not modifying, infact we are creating a
  // new object thats why original value of name is never changed. or say string
  // is passed by value
  // System.out.println(naam);
  // }

  static void changeValue(int[] nums) {
    nums[0] = 7; // arr is changed because we are modifying the array. or we can say that array
                 // is passed by reference
  }
}