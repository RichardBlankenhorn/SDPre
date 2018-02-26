public class ClubBouncer {
  public static void main(String[] args) {
    int age = 22;
    boolean onGuestList = false;
    double allure = 7.5;
    String gender = "F";

    if (onGuestList || age >= 21 || (gender.equals("F") && allure >= 8)){
      System.out.println("You are allowed to enter the club.");
    }
    else {
      System.out.println("You are not allowed to enter the club.");
    }
  }
}

// 1. The program does not complie if you add a println in between the if and
// else statements. Since the if statement does not execute, the program goes
// to the else statement but there is no else or if in from of the println
// statement.
