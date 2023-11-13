package inheritance;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        Cat tee = new Cat();

        feedAnimal(rocky);
        feedAnimal(tee);
    }

    public static void feedAnimal(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Here's your dog food");
        } else if (animal instanceof Cat) {
            System.out.println("Here's your cat food");
        }

        if (animal instanceof Dog myDog) {
            myDog.fetch();
        }

    }
}
