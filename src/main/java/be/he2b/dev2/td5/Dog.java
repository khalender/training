package be.he2b.dev2.td5;

/**
 * A dog whose sound depends on its weight.
 *
 * <p>Weight thresholds:
 * <ul>
 *   <li>{@code < 10}  → "Yip yip"</li>
 *   <li>{@code 10–30} → "Wouf"</li>
 *   <li>{@code > 30}  → "WOUUUF"</li>
 * </ul>
 *
 * @author DEV2
 */
public class Dog {

    private String name;
    private int weight;
    private boolean hungry = false;
    private boolean injured = false;

    public Dog(String name, int weight) {
        this.name = name;
        if (weight <= 0) {
            throw new IllegalArgumentException("Le poids doit être un entier positif !");
        }
        this.weight = weight;
    }

    /** Returns the sound the dog makes, based on its weight. */
    public String sound() {
        if (this.weight < 10) {
            return "Yip yip";
        } else if (this.weight <= 30) {
            return "Wouf";
        } else {
            return "WOUUUF";
        }
    }

    public void bark() {
        System.out.println(this.name + " a fait : " + this.sound());
    }

    /** Overload of {@link #bark()}: bark several times in a row. */
    public void bark(int nbRepeat) {
        if (nbRepeat <= 0) {
            throw new IllegalArgumentException("nbRepeat doit être strictement positif");
        }
        for (int i = 0; i < nbRepeat; i++) {
            this.bark();
        }
    }

    public void run() {
        if (this.hungry) {
            throw new IllegalStateException(this.name + " a faim !");
        }
        if (this.injured) {
            throw new IllegalStateException(this.name + " est blessé !");
        }
        System.out.println(this.name + " court comme un fou !");
        this.hungry = true;
        if (Math.random() < 0.2) {
            this.injured = true;
            System.out.println(this.name + " s'est blessé en courant !");
        }
    }

    public void eat() {
        if (!this.hungry) {
            throw new IllegalStateException(this.name + " n'a pas faim !");
        }
        System.out.println(this.name + " mange et se rétablit.");
        this.hungry = false;
        this.injured = false;
    }

    /**
     * Check if weight is between nb1 and nb2.
     * If nb1 > nb2, it checks if weight is between nb2 and nb1.
     *
     * @param nb1 defines one end of the interval.
     * @param nb2 defines the other end of the interval.
     * @return true if dog's weight is between min(nb1,nb2) and max(nb1,nb2) (both included).
     */
    public boolean isWeightBetween(int nb1, int nb2) {
        if (nb1 > nb2) {
            int t = nb1;
            nb1 = nb2;
            nb2 = t;
        }
        return this.weight >= nb1 && this.weight <= nb2;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public boolean isHungry() {
        return this.hungry;
    }

    public boolean isInjured() {
        return this.injured;
    }
}
