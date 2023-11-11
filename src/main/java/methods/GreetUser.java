package methods;

import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        String name = getUsername();
        greetUser(name);
    }

    public static String getUsername() {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        scanner.close();
        return userName;
    }

    public static void greetUser(String name) {
        System.out.println("Hello, " + name);
    }

    // Overloading methods
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(int a, double b) {
        a = 3;
        return a + b;
    }
}
