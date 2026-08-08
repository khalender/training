package be.he2b.dev2.td10;

import be.he2b.dev2.td9.Animal;
import be.he2b.dev2.td9.Bird;
import be.he2b.dev2.td9.Cat;
import be.he2b.dev2.td9.Contact;
import be.he2b.dev2.td9.Dog;

import java.util.List;

/** Console demo matching TD10 - Polymorphism. */
public final class Td10Demo {

    private Td10Demo() {
    }

    public static void run() {
        System.out.println("=== TD10 - Polymorphism ===");

        System.out.println("\n-- Casting: up (implicit) vs down (explicit) --");
        int intA = 5;
        double doubleA = intA;
        System.out.println("  implicit int->double: " + doubleA);
        double doubleB = 5.9;
        int intB = (int) doubleB;
        System.out.println("  explicit double->int: " + intB);

        System.out.println("\n-- PetStore (List<Animal> mix of Dog/Cat) --");
        PetStore store = new PetStore();
        store.addAnimal(new Dog("Medor", 25));
        store.addAnimal(new Cat("Felix", 5));
        store.addAnimal(new Dog("Rex", 35));
        store.addAnimal(new Cat("Whiskers", 4));
        store.addAnimal(new Bird("Tweety", 2));

        System.out.println("  Size: " + store.size());
        System.out.println("  toString():");
        System.out.print(store);

        System.out.println("  makeNoise():");
        store.makeNoise();

        System.out.println("\n  allDog():");
        for (Dog d : store.allDog()) {
            System.out.println("    " + d.getName());
        }

        System.out.println("  allCat():");
        for (Cat c : store.allCat()) {
            System.out.println("    " + c.getName());
        }

        System.out.println("\n-- Polymorphism: Animal ref, Dog object --");
        Animal medor = new Dog("Medor", 60);
        System.out.println("  toString() = " + medor);
        System.out.println("  (uses Dog.toString() — polymorphic dispatch)");
        System.out.println("  // medor.bark(); // COMPILE ERROR: Animal has no bark()");

        System.out.println("\n-- feedAll(List<Animal>) --");
        PolymorphismDemo.feedAll(store.getAnimals());

        System.out.println("\n-- ClassCastException demo --");
        PolymorphismDemo.triggerClassCastException();

        System.out.println("\n-- PhoneBook with BusinessContact --");
        PhoneBook pb = new PhoneBook();
        Contact albert = new Contact("Albert", "Einstein", "Somewhere St", 12345);
        pb.add(albert);
        pb.add(new BusinessContact("Steve", "Jobs", "Cupertino", 99999,
                "Apple", "1 Apple Park Way", 1001));
        pb.add(new Contact("Marie", "Curie", "Radium St", 67890));
        pb.add(new BusinessContact("Elon", "Musk", "Mars Ave", 11111,
                "SpaceX", "Rocket Rd", 2002));

        System.out.println("  All contacts:");
        pb.display();
        System.out.println("  nPrivateContact  = " + pb.nPrivateContact());
        System.out.println("  nCompanyContact  = " + pb.nCompanyContact());

        System.out.println("\n  inCompany(\"Apple\"):");
        for (Contact c : pb.inCompany("Apple")) {
            System.out.println("    " + c);
        }

        System.out.println("\n  becomeProfessional(albert, \"Princeton\", \"Uni St\", 5555):");
        pb.becomeProfessional(albert, "Princeton", "Uni St", 5555);
        pb.display();
        System.out.println("  nPrivateContact  = " + pb.nPrivateContact());
        System.out.println("  nCompanyContact  = " + pb.nCompanyContact());

        System.out.println("\n-- Upcast/downcast demo --");
        Dog dog = new Dog("Rex", 20);
        Animal upcast = dog;  // implicit — widening
        System.out.println("  upcast (Animal) = " + upcast);
        Dog downcast = (Dog) upcast;  // explicit — narrowing
        System.out.println("  downcast (Dog)  = " + downcast.getName());
    }
}
