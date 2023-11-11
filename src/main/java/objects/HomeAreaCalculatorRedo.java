package objects;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        var calculator = new HomeAreaCalculatorRedo();
        Rectangle room1 = calculator.getRoom();
        var room2 = calculator.getRoom();

        double totalArea = calculator.calculateAreaOfRoom(room1, room2);
        System.out.printf("Area of all rooms: %.0f", totalArea);
    }

    public Rectangle getRoom() {
        System.out.print("Enter the length of the room: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the room: ");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateAreaOfRoom(Rectangle room1, Rectangle room2) {
        return room1.calculateArea() + room2.calculateArea();
    }
}
