import java.util.Scanner;

public class Fruits {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // String fruit = in.nextLine();

    // switch (fruit) {
    // case "Apple" -> System.out.println("King");

    // case "Orange" -> System.out.println("Queen");

    // default -> System.out.println("Please enter a valid fruit");
    // }

    // int day = in.nextInt();
    // switch (day) {
    // case 1:
    // case 2:
    // case 3:
    // case 4:
    // case 5:
    // System.out.println("Weekday");
    // break;

    // case 6:
    // case 7:
    // System.out.println("Weekend");
    // break;
    // }

    // better way to write
    // switch (day) {
    // case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
    // case 6, 7 -> System.out.println("Weekend");
    // }

    int EmpID = in.nextInt();
    String department = in.next();

    // switch (EmpID) {
    // case 1:
    // System.out.println("Rishu Kuamr");
    // break;

    // case 2:
    // System.out.println("Alok Daitya");
    // break;

    // case 3:
    // System.out.println("Employ no. 3");
    // switch (department) {
    // case "IT":
    // System.out.println("IT dept.");
    // break;
    // case "Finance":
    // System.out.println("Finance dept.");
    // break;
    // default:
    // System.out.println("No department entered");
    // break;
    // }
    // break;
    // default:
    // System.out.println("enter correct employ id");
    // }

    // better way to write
    switch (EmpID) {
      case 1 -> System.out.println("Rishu Kuamr");
      case 2 -> System.out.println("Alok Daitya");
      case 3 -> {
        System.out.println("Employ no. 3");
        switch (department) {
          case "IT" -> System.out.println("IT dept.");
          case "Finance" -> System.out.println("Finance dept.");
          default -> System.out.println("No department entered");
        }
      }
      default -> System.out.println("enter correct employ id");
    }
  }
}
