package interfaces;

import java.util.Random;

public interface Product {
    String getName();

    void setName(String name);

    default void print() {
        System.out.println(getName());
    }

    default double getPrice() {
        var random = new Random();
        return random.nextDouble();
    }

    default void setPrice(double price) {

    }
}
