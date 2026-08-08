package be.he2b.dev2.td9;

import java.util.Objects;

/**
 * A generic animal — superclass of {@link Dog}, {@link Cat}, {@link Bird}.
 *
 * <p>Provides common attributes ({@code name}, {@code weight}, {@code hungry},
 * {@code injured}) and methods ({@code run()}, {@code eat()}, {@code sound()}).
 * Subclasses override {@code sound()} and add their own vocalizations.
 *
 * @author DEV2
 */
public class Animal {

    protected String name;
    protected int weight;
    protected boolean hungry = false;
    protected boolean injured = false;

    public Animal(String name, int weight) {
        this.name = name;
        if (weight <= 0) {
            throw new IllegalArgumentException("Le poids doit être un entier positif !");
        }
        this.weight = weight;
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

    public String sound() {
        return "(silence)";
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return weight == animal.weight
                && hungry == animal.hungry
                && injured == animal.injured
                && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, hungry, injured);
    }

    @Override
    public String toString() {
        return name + ": poids = " + weight + "kg";
    }
}
