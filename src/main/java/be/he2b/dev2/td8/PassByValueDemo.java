package be.he2b.dev2.td8;

import java.util.List;

/**
 * Demonstrates pass-by-value semantics: primitives vs. reference types.
 *
 * <p>Key insight:
 * <ul>
 *   <li>Primitives are copied — the caller's variable is unaffected.</li>
 *   <li>References are copied too, but the copy still points to the same
 *       object — mutating that object is visible to the caller.</li>
 *   <li>Reassigning the parameter itself (the reference copy) does NOT
 *       affect the caller's variable.</li>
 * </ul>
 *
 * @author DEV2
 */
public final class PassByValueDemo {

    private PassByValueDemo() {
    }

    /** A primitive int is copied — the caller's value is unchanged. */
    public static void modify(int i) {
        i = 10;
    }

    /** Mutating the object through its reference — visible to the caller. */
    public static void modify(Dog myDog) {
        myDog.setWeight(10);
    }

    /** Reassigning the parameter — NOT visible to the caller. */
    public static void reassignDog(Dog myDog) {
        myDog = new Dog("Milou", 3);
    }

    /**
     * Feeds the dog if its weight is below {@code minWeight}.
     *
     * @param myDog the dog to potentially feed
     * @param minWeight the minimum weight threshold
     */
    public static void feed(Dog myDog, int minWeight) {
        if (myDog.getWeight() < minWeight) {
            myDog.eat();
        }
    }

    /**
     * Overload: feeds all dogs in the list whose weight is below
     * {@code minWeight}.
     *
     * @param dogs the list of dogs to potentially feed
     * @param minWeight the minimum weight threshold
     */
    public static void feed(List<Dog> dogs, int minWeight) {
        for (Dog dog : dogs) {
            feed(dog, minWeight);
        }
    }
}
