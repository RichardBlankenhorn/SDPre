import java.util.Scanner;

public class Objective6Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;
    boolean value = true;

    while (value) {
      System.out.println("____Menu____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My Favorite Foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = scanner.nextInt();

      if (selection == 1) {
        System.out.println("Hello Human");
      }
      else if (selection == 2) {
        System.out.println("Apple, Banana, Coconut");
      }
      else if (selection == 3) {
        System.out.println("Goodbye");
        value = false;
      }
    }
    scanner.close();
  }
}
