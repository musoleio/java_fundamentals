package basics;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        System.out.println("How man hours did you work");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("What is your hourly pay rate");
        double rate = scanner.nextDouble();

        double payRate = hours * rate;

        System.out.println("Gross pay: " + payRate);
        scanner.close();
    }
}
