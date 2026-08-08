package be.he2b.dev2.td3;

/**
 * A dog that barks, runs and eats, and complains loudly (via exceptions)
 * when asked to do something it shouldn't.
 *
 * @author DEV2
 */
public class Dog {

    private final String name;
    private boolean hungry;
    private boolean injured;

    public Dog(String name) {
        this.name = name;
        this.hungry = false;
        this.injured = false;
    }

    public void bark() {
        System.out.println(this.name + " a fait : Wouf !");
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

    /** Overload of {@link #run()}: run several times in a row. */
    public void run(int nbRepeat) {
        if (nbRepeat <= 0) {
            throw new IllegalArgumentException("nbRepeat doit être strictement positif");
        }
        for (int i = 0; i < nbRepeat; i++) {
            this.run();
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

    public String getName() {
        return this.name;
    }
}
