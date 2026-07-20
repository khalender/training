package be.he2b.dev2.td1;

/** Console demo matching TD01 - Intro Orienté Objet. */
public final class Td1Demo {

    private Td1Demo() {
    }

    public static void run() {
        System.out.println("=== TD01 - Intro OO ===");

        Dog medor = new Dog();
        medor.bark();

        Cat felix = new Cat();
        felix.meow();
    }
}
