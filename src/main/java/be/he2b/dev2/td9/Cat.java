package be.he2b.dev2.td9;

/**
 * A cat — extends {@link Animal} and adds meowing.
 *
 * <p>Cats are more agile: they don't risk injury when running (override run()).
 *
 * @author DEV2
 */
public class Cat extends Animal {

    public Cat(String name, int weight) {
        super(name, weight);
    }

    public void meow() {
        System.out.println(this.name + " a fait : Miaou !");
    }

    @Override
    public String sound() {
        return "Miaou";
    }

    @Override
    public void run() {
        if (this.hungry) {
            throw new IllegalStateException(this.name + " a faim !");
        }
        System.out.println(this.name + " court comme un fou !");
        this.hungry = true;
    }

    @Override
    public String toString() {
        return "Chat " + this.name + " : poids = " + this.weight + "kg";
    }
}
