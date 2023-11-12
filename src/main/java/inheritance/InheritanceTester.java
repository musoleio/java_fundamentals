package inheritance;

import objects.Rectangle;

public class InheritanceTester {
    public static void main(String[] args) {
//        Employee employee1 = new Employee();
        var sq1 = new Square();
        sq1.setLength(25);

        var rec1 = new Rectangle();
        rec1.print();
        sq1.print("blue");

    }

}
