package decision_structures;

import java.util.Scanner;

public class GradeMessageSwitchExpression {
    public static void main(String[] args) {
        System.out.println("Enter your grade");
        Scanner scanner = new Scanner(System.in);
        char grade = scanner.next().charAt(0); // read in a single character from stdin

        String message = switch (grade) {
            case 'A' -> "Excellent job.";
            case 'B' -> "Good job.";
            case 'C' -> "Room for improvement";
            case 'D' -> "You can do better";
            case 'F' -> "Damn son";
            default -> "Error invalid grade";
        };

        System.out.println(message);
        scanner.close();
    }
}
