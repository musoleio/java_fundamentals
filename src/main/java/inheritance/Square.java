package inheritance;

import objects.Rectangle;

public class Square extends Rectangle {

    @Override
    public double calculateArea() {
        return sides * length;
    }

    public void print(String value) {
        System.out.println(value);
    }
}
