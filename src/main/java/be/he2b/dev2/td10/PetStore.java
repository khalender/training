package be.he2b.dev2.td10;

import be.he2b.dev2.td9.Animal;
import be.he2b.dev2.td9.Cat;
import be.he2b.dev2.td9.Dog;

import java.util.ArrayList;
import java.util.List;

/**
 * A pet store holding a mix of {@link Animal} instances (dogs, cats, …).
 *
 * <p>Demonstrates polymorphism: all animals are stored as {@code Animal} and
 * dispatched polymorphically via {@link #makeNoise()}. Subtype-specific
 * access uses {@code instanceof} and explicit casting.
 *
 * @author DEV2
 */
public class PetStore {

    private final List<Animal> animals;

    public PetStore() {
        this.animals = new ArrayList<>();
    }

    public PetStore(List<Animal> animals) {
        this.animals = new ArrayList<>(animals);
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        this.animals.remove(animal);
    }

    /** Calls {@code sound()} on every animal — polymorphic dispatch. */
    public void makeNoise() {
        for (Animal a : this.animals) {
            System.out.println("  " + a.getName() + " says: " + a.sound());
        }
    }

    /** Returns all dogs (filtered via {@code instanceof}). */
    public List<Dog> allDog() {
        List<Dog> dogs = new ArrayList<>();
        for (Animal a : this.animals) {
            if (a instanceof Dog dog) {
                dogs.add(dog);
            }
        }
        return dogs;
    }

    /** Returns all cats (filtered via {@code instanceof}). */
    public List<Cat> allCat() {
        List<Cat> cats = new ArrayList<>();
        for (Animal a : this.animals) {
            if (a instanceof Cat cat) {
                cats.add(cat);
            }
        }
        return cats;
    }

    public List<Animal> getAnimals() {
        return this.animals;
    }

    public int size() {
        return this.animals.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Animal a : this.animals) {
            sb.append("  ").append(a).append("\n");
        }
        return sb.toString();
    }
}
