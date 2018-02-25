import java.util.Scanner;

public class Sequencing {
  public static void main(String[] args) {
    // This code is broken until you fix it

    Scanner keyboard = new Scanner(System.in);
    double price = 0, salesTax, total;

    System.out.print("How much is the purchase price?");
    price = keyboard.nextDouble();

    salesTax = price * 0.0825;
    total = price + salesTax;

    System.out.println("Item price:\t" + price);
    System.out.println("Sales tax:\t" + salesTax);
    System.out.println("Total cost:\t" + total);
  }
}

// 1. The code does not compile since Price is not initialized.
// 2. The program works after moving the calculations after price is received.
