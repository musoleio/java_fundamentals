package decision_structures;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;
        System.out.println("How many sales did you make this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        if (sales >= quota) {
            System.out.println("Congratulations. You've met your quota");
        } else {
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. You were short by " + salesShort + " sales");
        }

        scanner.close();
    }
}
