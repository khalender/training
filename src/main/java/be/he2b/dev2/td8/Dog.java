package be.he2b.dev2.td8;

/**
 * A fully encapsulated dog: name and weight are validated in the constructor
 * and setters, throwing {@link IllegalArgumentException} on invalid input.
 *
 * @author DEV2
 */
public class Dog {

    private String name;
    private int weight;
    private boolean hungry;

    public Dog(String name, int weight) {
        setName(name);
        setWeight(weight);
        this.hungry = false;
    }

    public void bark() {
        if (this.weight < 10) {
            System.out.println(this.name + " a fait : Yip yip !");
        } else if (this.weight <= 30) {
            System.out.println(this.name + " a fait : Wouf !");
        } else {
            System.out.println(this.name + " a fait : WOUUUF !");
        }
    }

    public void run() {
        if (this.hungry) {
            throw new IllegalStateException(this.name + " a faim !");
        }
        System.out.println(this.name + " court comme un fou !");
        this.hungry = true;
    }

    public void eat() {
        if (!this.hungry) {
            throw new IllegalStateException(this.name + " n'a pas faim !");
        }
        System.out.println(this.name + " mange et se rétablit.");
        this.hungry = false;
        this.weight += 1;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 2 || name.length() > 30) {
            throw new IllegalArgumentException("Le nom doit comporter entre 2 et 30 caractères");
        }
        this.name = name;
    }

    public int getWeight() {
        return this.weight;
    }

    public final void setWeight(int weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Le poids doit être un entier positif !");
        }
        this.weight = weight;
    }

    public boolean isHungry() {
        return this.hungry;
    }
}
