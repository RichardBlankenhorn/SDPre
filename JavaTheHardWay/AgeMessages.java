import java.util.Scanner;

public class AgeMessages {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int age;

    System.out.println("How old are you? ");
    age = keyboard.nextInt();

    System.out.println("You are: ");
    if (age < 13) {
      System.out.println("\ttoo young to create a Facebook account");
    }
    if (age >= 13) {
      System.out.println("\told enough to create a Facebook account");
    }
    if (age < 16) {
      System.out.println("\ttoo young to get a driver's license");
    }
    if (age >= 16) {
      System.out.println("\told enough to get a driver's license");
    }
    if (age < 18) {
      System.out.println("\ttoo young to get a tattoo");
    }
    if (age >= 18) {
      System.out.println("\told enough to get a tattoo");
    }
    if (age < 21) {
      System.out.println("\ttoo yound to drink alcohol");
    }
    if (age >= 21) {
      System.out.println("\told enough to drink alcohol");
    }
    if (age < 35) {
      System.out.println("\ttoo young to run for president of the U.S.");
      System.out.println("\t\t(How sad!)");
    }
    if (age >= 35) {
      System.out.println("\told enough to run for president of the U.S.");
    }
    if (age >= 65) {
      System.out.println("\told enought to retire!");
    }
    if (age < 65) {
      System.out.println("\ttoo young to retire!");
    }
  }
}

// 1. Typing in 35 products "You are: " and then nothing else. There is no
// statement for an age at 35 or higher.
