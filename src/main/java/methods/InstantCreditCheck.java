package methods;

import java.util.Scanner;

public class InstantCreditCheck {
    static double requiredSalary = 25_000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // The poor man's type inference
        var salary = getSalary();
        var creditScore = getCreditScore();
        var qualified = isUserQualified(salary, creditScore);

        scanner.close();
    }

    public static void notifyUser(boolean qualified) {
        if (qualified) {
            System.out.println("Congratulation. You've been approved");
        } else
            System.out.println("Sorry, you've been declined");
    }

    private static double getSalary() {
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore() {
        System.out.print("Enter your credit score: ");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(double salary, int creditScore) {
        return (salary >= requiredSalary && creditScore >= requiredCreditScore);
    }
}
