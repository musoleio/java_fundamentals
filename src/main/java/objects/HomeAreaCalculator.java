package objects;

public class HomeAreaCalculator {
    public static void main(String[] args) {
        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        room1.setWidth(25);
        double areaOfRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(25, 70);
        var areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom2 + areaOfRoom1;
        System.out.printf("Area of all rooms: %.0f", totalArea);
    }
}
