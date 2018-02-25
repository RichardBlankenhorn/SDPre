import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, kgRatio, mRatio, inch, pound, feet;

    kgRatio = 1/2.2046226218;
    mRatio = 0.0254;

    System.out.print("Your height in m: ");
    m = keyboard.nextDouble();

    System.out.print("Your weight in kg: ");
    kg = keyboard.nextDouble();

    bmi = kg / (m*m);

    System.out.println("Your BMI is " + bmi);

    System.out.print("Your height in inches: ");
    inch = keyboard.nextDouble();

    System.out.print("Your height in feet: ");
    feet = keyboard.nextDouble();

    System.out.print("Your weight in pounds: ");
    pound = keyboard.nextDouble();

    bmi = (pound*kgRatio) / (Math.pow(inch*mRatio, 2));

    System.out.print("Your BMI is " + bmi);
  }
}
