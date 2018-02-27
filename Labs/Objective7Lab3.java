import java.util.Scanner;

public class Objective7Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;
    boolean answer = true;
    while (answer) {
      printMenu();

      selection = scanner.nextInt();

      if (selection == 1) {
        print1();
      }
      else if (selection == 2) {
        print2();
      }
      else if (selection == 3) {
        print3();
        answer = false;
      }
    }

    scanner.close();
  }

  public static void printMenu() {
    System.out.println("____Menu____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My Favorite Foods");
    System.out.println("3: Exit");
    System.out.println();
  }

  public static void print1() {
    System.out.println("Hello Human");
  }

  public static void print2() {
    System.out.println("Apples, Bananas, Coconuts");
  }

  public static void print3() {
    System.out.println("Goodbye");
  }
}
