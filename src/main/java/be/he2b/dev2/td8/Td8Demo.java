package be.he2b.dev2.td8;

import java.util.ArrayList;
import java.util.List;

/** Console demo matching TD08 - Encapsulation. */
public final class Td8Demo {

    private Td8Demo() {
    }

    public static void run() {
        System.out.println("=== TD08 - Encapsulation ===");

        System.out.println("\n-- Dog encapsulé (validation) --");
        Dog medor = new Dog("Médor", 25);
        medor.bark();
        medor.run();
        medor.eat();

        System.out.println("\n  setWeight(0) doit lever une exception :");
        try {
            medor.setWeight(0);
        } catch (IllegalArgumentException e) {
            System.out.println("  Exception : " + e.getMessage());
        }

        System.out.println("\n  setName(\"A\") doit lever une exception :");
        try {
            medor.setName("A");
        } catch (IllegalArgumentException e) {
            System.out.println("  Exception : " + e.getMessage());
        }

        System.out.println("\n-- Contact encapsulé --");
        Contact albert = new Contact("Albert", "Einstein", "rue d'Ailleurs", 12345);
        System.out.println("  " + albert.getFullName() + " - " + albert.getPhone());

        System.out.println("\n  Contact avec prénom trop court :");
        try {
            new Contact("A", "Einstein", "rue", 12345);
        } catch (IllegalArgumentException e) {
            System.out.println("  Exception : " + e.getMessage());
        }

        System.out.println("\n  Contact avec téléphone trop court :");
        try {
            new Contact("Albert", "Einstein", "rue d'Ailleurs", 12);
        } catch (IllegalArgumentException e) {
            System.out.println("  Exception : " + e.getMessage());
        }

        System.out.println("\n-- PhoneBook update() et merge() --");
        PhoneBook pb1 = new PhoneBook();
        pb1.add(new Contact("Albert", "Einstein", "rue d'Ailleurs", 12345));
        pb1.add(new Contact("Marie", "Curie", "rue du Radium", 67890));
        System.out.println("  Avant update :");
        pb1.display();
        pb1.update(0, "rue Nouvelle", 99999);
        System.out.println("  Après update(0, \"rue Nouvelle\", 99999) :");
        pb1.display();

        PhoneBook pb2 = new PhoneBook();
        pb2.add(new Contact("Nikola", "Tesla", "rue des Éclairs", 11111));
        pb1.merge(pb2);
        System.out.println("  Après merge avec pb2 :");
        pb1.display();

        System.out.println("\n-- Pass-by-value --");
        int data = 5;
        System.out.println("  data avant modify : " + data);
        PassByValueDemo.modify(data);
        System.out.println("  data après modify : " + data + " (inchangé)");

        Dog rex = new Dog("Rex", 5);
        System.out.println("  Rex pèse " + rex.getWeight() + " avant modify(Dog)");
        PassByValueDemo.modify(rex);
        System.out.println("  Rex pèse " + rex.getWeight() + " après modify(Dog) (modifié !)");

        Dog brutus = new Dog("Brutus", 30);
        System.out.println("  Brutus s'appelle " + brutus.getName() + " avant reassignDog");
        PassByValueDemo.reassignDog(brutus);
        System.out.println("  Brutus s'appelle " + brutus.getName() + " après reassignDog (inchangé)");

        System.out.println("\n-- feed(Dog, int minWeight) --");
        Dog medor2 = new Dog("Médor2", 5);
        medor2.run();
        PassByValueDemo.feed(medor2, 10);
        System.out.println("  Médor2 pèse maintenant " + medor2.getWeight() + " kg");

        System.out.println("\n-- feed(List<Dog>, int minWeight) overload --");
        List<Dog> pack = new ArrayList<>();
        Dog d1 = new Dog("Rex", 15);
        d1.run();
        Dog d2 = new Dog("Max", 5);
        d2.run();
        pack.add(d1);
        pack.add(d2);
        PassByValueDemo.feed(pack, 10);
        System.out.println("  Rex pèse " + d1.getWeight() + " kg, Max pèse " + d2.getWeight() + " kg");
    }
}
