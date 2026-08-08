package be.he2b.dev2.td9;

/** Console demo matching TD09 - Inheritance. */
public final class Td9Demo {

    private Td9Demo() {
    }

    public static void run() {
        System.out.println("=== TD09 - Inheritance ===");

        System.out.println("\n-- Animal / Dog / Cat / Bird --");
        Dog medor = new Dog("Medor", 25);
        Cat felix = new Cat("Felix", 5);
        Bird tweety = new Bird("Tweety", 2);

        medor.bark();
        felix.meow();
        tweety.chirp();

        System.out.println("\n-- sound() (polymorphic via runtime type) --");
        System.out.println("  " + medor + " -> sound = " + medor.sound());
        System.out.println("  " + felix + " -> sound = " + felix.sound());
        System.out.println("  " + tweety + " -> sound = " + tweety.sound());

        System.out.println("\n-- Puppy extends Dog --");
        Puppy puppy = new Puppy("Baby", 4);
        puppy.bark();

        System.out.println("\n-- Vehicle hierarchy --");
        Moto moto = new Moto("Yamaha", 15);
        Car car = new Car("Toyota", 50, 5);
        HybridCar hybrid = new HybridCar("Prius", 40, 4);

        moto.fillUpGaz();
        car.fillUpGaz();
        hybrid.fillUpGaz();

        moto.ride(100);
        car.ride(100);
        hybrid.ride(100);

        System.out.println("\n-- equals() / hashCode() on Contact --");
        Contact c1 = new Contact("Albert", "Einstein", "Somewhere St", 12345);
        Contact c2 = new Contact("Albert", "Einstein", "Somewhere St", 12345);
        Contact c3 = new Contact("Marie", "Curie", "Radium St", 67890);

        System.out.println("  c1.equals(c2) = " + c1.equals(c2) + " (same data)");
        System.out.println("  c1 == c2      = " + (c1 == c2) + " (different objects)");
        System.out.println("  c1.equals(c3) = " + c1.equals(c3) + " (different data)");
        System.out.println("  hashCode(c1)  = " + c1.hashCode());
        System.out.println("  hashCode(c2)  = " + c2.hashCode());
    }
}
