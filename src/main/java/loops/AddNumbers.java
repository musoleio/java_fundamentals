package loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean status;
        double a, b;
        do {
            System.out.print("Enter first number: ");
            a = scanner.nextDouble();
            System.out.print("Enter second number: ");
            b = scanner.nextDouble();
            double sum = a + b;
            System.out.println(a + " + " + b + " = " + " " + sum);

            System.out.println("Do you wish to continue? Enter y to confirm or n to quit");
            status = scanner.nextBoolean();
        } while (status);

        scanner.close();
    }
}
