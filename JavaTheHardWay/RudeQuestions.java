import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args) {
    String name, date;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello. Wat is your name?");
    name = keyboard.next();

    System.out.print("Hi, " + name + "! How old are you?");
    age = keyboard.nextInt();

    System.out.println("So you're " + age + ", eh? That's not very old.");
    System.out.print("How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();

    System.out.println(weight + "! Better keep that quiet!!");
    System.out.print("Finally, what's your income, " + name + "?");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is " + income + " per hour");
    System.out.println(" and not per year!");
    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println(name + ".");

    System.out.println("One last thing, what is today's date?");
    date = keyboard.next();
    System.out.println("On, I didn't realize it was the " + date + " of this month");
    System.out.println("Thanks for your time today!");

  }
}

// 1. The program does not blow up when an integer is entered for a double.
// It appears that the integer is converted to a double (1 = 1.0).
// 2. THe program does not blow up when an numeric value is entered for string.
// It is possible to have a string number versus a number used for calculation.
// 3. I could not blow up question 1. For question 2, it blows up when entering
// a non-numeric character. For question 3, it blows up if I enter a letter.
// For question 4, it blows up if I enter a letter.
