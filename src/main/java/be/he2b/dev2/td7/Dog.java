package be.he2b.dev2.td7;

/**
 * Dog with a {@code static} counter — demonstrates {@code static} attributes
 * shared across all instances.
 *
 * <p>Homework exercise 3: a {@code static} counter attribute ({@code nDogsCreated}),
 * incremented in the constructor, with a {@code static} getter.
 *
 * @author DEV2
 */
public class Dog {

    private final String name;
    private static int nDogsCreated = 0;

    public Dog(String name) {
        this.name = name;
        nDogsCreated++;
    }

    public String getName() {
        return this.name;
    }

    public static int getNDogsCreated() {
        return nDogsCreated;
    }

    public static void resetCounter() {
        nDogsCreated = 0;
    }
}
