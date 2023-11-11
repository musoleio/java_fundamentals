package decision_structures;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;
        switch (grade) {
            case "A":
                message = "Excellent job.";
                break;
            case "B":
                message = "Good job.";
                break;
            case "C":
                message = "Room for improvement";
                break;
            case "D":
                message = "You can do better";
                break;
            case "F":
                message = "Damn son";
                break;
            default:
                message = "Error invalid grade";
        }

        System.out.println(message);
        scanner.close();
    }
}
