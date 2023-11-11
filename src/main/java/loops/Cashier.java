package loops;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        System.out.print("How many items would you like to scan? ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;
        for (int i = 0; i < quantity; i++) {
            System.out.print("Enter the cost of the item: ");
            double price = scanner.nextDouble();
            total += price;
        }

        System.out.println("Your total is: " + total);
        scanner.close();
    }
}
