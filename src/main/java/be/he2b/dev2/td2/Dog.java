package be.he2b.dev2.td2;

/**
 * A dog with a name, a weight, and an appetite.
 *
 * @author DEV2
 */
public class Dog {

    private String name;
    private int weight;
    private boolean hungry;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.hungry = false;
    }

    public void bark() {
        if (this.weight < 10) {
            System.out.println(this.name + " a fait : Yip yip !");
        } else {
            System.out.println(this.name + " a fait : Wouf !");
        }
    }

    public void run() {
        if (this.hungry) {
            System.out.println(this.name + " a faim !");
        } else {
            System.out.println(this.name + " court comme un fou !");
            this.hungry = true;
        }
    }

    public void eat() {
        System.out.println(this.name + " mange.");
        this.hungry = false;
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
}
