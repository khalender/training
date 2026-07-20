package be.he2b.dev2.td1;

/**
 * A cat. It meows, the same way {@link Dog} barks.
 *
 * <p>Notice how much this class duplicates {@link Dog}: same shape, nothing
 * shared. That duplication is left in on purpose - it is the motivation for
 * inheritance later in the course.
 *
 * @author DEV2
 */
public class Cat {

    public void meow() {
        System.out.println("Miaou !");
    }
}
