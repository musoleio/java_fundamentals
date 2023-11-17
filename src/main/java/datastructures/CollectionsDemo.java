package datastructures;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
//        setDemo();
        listDemo();
//        queueDemo();
//        mapDemo();
    }

    public static void mapDemo() {
        Map<String, String> paths = new HashMap<>();
        paths.put("home", "/");
        paths.put("about", "/about");
        paths.put("products", "/products");
        paths.put("login", "/login");
        System.out.println(paths);

        // is key present in map
        System.out.println(paths.containsValue("/products"));
        println("contains login path: " + paths.containsKey("login"));

        var pathEntries = paths.entrySet();
//        var i = pathEntries.iterator();
//
//        while (i.hasNext()) {
//            Map.Entry<String, String> entry = (Map.Entry) i.next();
//            println(entry.getKey() + " | " + entry.getValue());
//        }

//        for (Map.Entry<String, String> pathEntry : paths.entrySet()) {
//            println(pathEntry.getKey() + " -> " + pathEntry.getValue());
//        }

        paths.forEach((key, value) -> {
            println(key + " /:/ " + value);
        });

    }

    public static void queueDemo() {
        Queue<String> colours = new LinkedList<>();
        colours.offer("red");
        colours.add("green");
        colours.add("blue");
        colours.add("yellow");
        System.out.println(colours);
        colours.add("brown");
        var next = colours.peek();
        System.out.println(next);
        println("the queue contains: " + colours.size() + " elements");

        println(colours.element() == colours.peek());

        System.out.println(colours.contains("brown"));
        var head = colours.remove();
        System.out.println(head);
        System.out.println(colours);
        for (var colour : colours) {
            colours.element();
            System.out.print(colour + " | ");
        }
    }

    public static void listDemo() {
        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");
        fruits.add("kiwi");
//        System.out.println(fruits);

        // duplicates
        fruits.add("apple");
//        System.out.println(fruits);
        fruits.add(1, "guava");
//        System.out.println("fruits = " + fruits);

        fruits.removeAll(fruits);
        fruits.add("pear");
        fruits.add("pawpaw");
        fruits.add("monkey-beer");
        fruits.add("kiwi");

        // get index of first occurrence
        int pearIndex = fruits.indexOf("pear");
        if (pearIndex == -1) ;
//            println("No such element");
        else
//            println("Index of pear = " + pearIndex);

            // insert at specific index
            fruits.add(0, "apple");
        fruits.add("orange");
        fruits.add(2, "orange");
//        System.out.println(fruits);

        // index of last occurrence of an element
//        println(fruits.size());
//        println("last index of orange = " + fruits.lastIndexOf("orange"));
//
//        // does element exist
//        println(fruits.add("mango"));
//        println(fruits.contains("mango"));

//        for (String fruit : fruits) {
//            System.out.print(fruit + " | ");
//        }

        fruits.forEach(fruit -> {
            fruit = "fruit: " + fruit;
            System.out.println(fruit);
        });

    }

    public static void setDemo() {
        Set fruit = new HashSet<String>();
//        fruit.add(2);
        fruit.add("banana");
        fruit.add("lemon");
        fruit.add("apple");
        fruit.add("kiwi");


        fruit.size();


        var otherFruit = Set.of("guava", "raspberry"); // creates an immutable set of these elements

        System.out.println(otherFruit.add("mango"));

    }

    public static void println(Object object) {
        System.out.println(object);
    }
}
