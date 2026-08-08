package be.he2b.dev2.td9;

/**
 * A bird — extends {@link Animal} and adds chirping.
 *
 * @author DEV2
 */
public class Bird extends Animal {

    public Bird(String name, int weight) {
        super(name, weight);
    }

    public void chirp() {
        System.out.println(this.name + " a fait : Cui cui !");
    }

    @Override
    public String sound() {
        return "Cui cui";
    }

    @Override
    public String toString() {
        return "Oiseau " + this.name + " : poids = " + this.weight + "kg";
    }
}
