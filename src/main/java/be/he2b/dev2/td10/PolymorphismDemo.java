package be.he2b.dev2.td10;

import be.he2b.dev2.td9.Animal;
import be.he2b.dev2.td9.Cat;
import be.he2b.dev2.td9.Dog;

import java.util.List;

/**
 * Demonstrates polymorphism and casting — including a deliberate
 * {@link ClassCastException}.
 *
 * <p>Homework exercises 2 and 3.
 *
 * @author DEV2
 */
public final class PolymorphismDemo {

    private PolymorphismDemo() {
    }

    /**
     * Calls a common feeding method polymorphically across all animals.
     *
     * <p>Homework exercise 2.
     */
    public static void feedAll(List<Animal> animals) {
        for (Animal a : animals) {
            System.out.println("  Feeding " + a.getName());
        }
    }

    /**
     * Deliberately casts a {@code Cat} (declared as {@code Animal}) down to
     * {@code Dog}, triggering a {@link ClassCastException}.
     */
    public static void triggerClassCastException() {
        Animal animal = new Cat("Felix", 5);
        try {
            Dog dog = (Dog) animal;
        } catch (ClassCastException e) {
            System.out.println("  ClassCastException caught: " + e.getMessage());
        }
    }
}
