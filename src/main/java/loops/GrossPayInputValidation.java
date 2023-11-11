package loops;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        int rate = 15, maxHours = 40;
        System.out.println("How many hours have you worked");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked < 0 || hoursWorked > maxHours) {
            System.out.println("Invalid number of hours. Must be between 0 and 40");
            hoursWorked = scanner.nextDouble();
        }

        double grossPay = hoursWorked * rate;
        System.out.println("You gross pay is: " + grossPay);
        scanner.close();
    }
}
