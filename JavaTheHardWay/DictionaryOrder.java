import java.util.Scanner;

public class DictionaryOrder {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String name;

    System.out.print("Make up the name of a programming language! ");
    name = keyboard.nextLine();

    if (name.compareToIgnoreCase("c++") < 0)
      System.out.println(name + " comes before c++");
    if (name.compareToIgnoreCase("c++") == 0)
      System.out.println("c++ isn't a made-up language!");
    if (name.compareToIgnoreCase("c++") > 0)
      System.out.println(name + " comes after c++");

    if (name.compareToIgnoreCase("go") < 0)
      System.out.println(name + " comes before go");
    if (name.compareToIgnoreCase("go") == 0)
      System.out.println("go isn't a made-up language!");
    if (name.compareToIgnoreCase("go") > 0)
      System.out.println(name + " comes after go");

    if (name.compareToIgnoreCase("java") < 0)
      System.out.println(name + " comes before java");
    if (name.compareToIgnoreCase("java") == 0)
      System.out.println("java isn't a made-up language!");
    if (name.compareToIgnoreCase("java") > 0)
      System.out.println(name + " comes after java");

    if (name.compareToIgnoreCase("lisp") < 0)
      System.out.println(name + " comes before lisp");
    if (name.compareToIgnoreCase("lisp") == 0)
      System.out.println("lisp isn't a made-up language!");
    if (name.compareToIgnoreCase("lisp") > 0)
      System.out.println(name + " comes after lisp");

    if (name.compareToIgnoreCase("python") < 0)
      System.out.println(name + " comes before python");
    if (name.compareToIgnoreCase("python") == 0)
      System.out.println("python isn't a made-up language!");
    if (name.compareToIgnoreCase("python") > 0)
      System.out.println(name + " comes after python");

    if (name.compareToIgnoreCase("ruby") < 0)
      System.out.println(name + " comes before ruby");
    if (name.compareToIgnoreCase("ruby") == 0)
      System.out.println("ruby isn't a made-up language!");
    if (name.compareToIgnoreCase("ruby") > 0)
      System.out.println(name + " comes after ruby");

    if (name.compareToIgnoreCase("visualbasic") < 0)
      System.out.println(name + " comes before visualbasic");
    if (name.compareToIgnoreCase("visualbasic") == 0)
      System.out.println("visualbasic isn't a made-up language!");
    if (name.compareToIgnoreCase("visualbasic") > 0)
      System.out.println(name + " comes after visualbasic");

  }
}
