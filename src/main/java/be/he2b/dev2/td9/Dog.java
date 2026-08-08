package be.he2b.dev2.td9;

/**
 * A dog — extends {@link Animal} and adds barking.
 *
 * @author DEV2
 */
public class Dog extends Animal {

    public Dog(String name, int weight) {
        super(name, weight);
    }

    public void bark() {
        System.out.println(this.name + " a fait : " + this.sound());
    }

    @Override
    public String sound() {
        if (this.weight < 10) {
            return "Yip yip";
        } else if (this.weight <= 30) {
            return "Wouf";
        } else {
            return "WOUUUF";
        }
    }

    @Override
    public String toString() {
        return "Chien " + this.name + " : poids = " + this.weight + "kg";
    }
}
