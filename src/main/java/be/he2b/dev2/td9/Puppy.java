package be.he2b.dev2.td9;

/**
 * A puppy — extends {@link Dog} and overrides {@code bark()} to produce a
 * smaller sound, calling {@code super.bark()} as part of its own
 * implementation.
 *
 * <p>Homework exercise 3.
 *
 * @author DEV2
 */
public class Puppy extends Dog {

    public Puppy(String name, int weight) {
        super(name, weight);
    }

    public Puppy(String name) {
        this(name, 5);
    }

    @Override
    public void bark() {
        System.out.print("(petit) ");
        super.bark();
    }
}
