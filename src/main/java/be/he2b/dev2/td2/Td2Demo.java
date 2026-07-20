package be.he2b.dev2.td2;

/** Console demo matching TD02 - Attributs et constructeurs. */
public final class Td2Demo {

    private Td2Demo() {
    }

    public static void run() {
        System.out.println("=== TD02 - Attributs et constructeurs ===");

        Dog medor = new Dog("Médor", 20);
        medor.bark();
        medor.run();
        medor.run();
        medor.eat();

        Contact albert = new Contact("Albert", "Einstein", "rue d'Ailleurs", 12345);
        System.out.println(albert.getFullName() + " - " + albert.getAddress() + " - " + albert.getPhone());
        albert.setPhone(54321);
        System.out.println("Nouveau numéro : " + albert.getPhone());
    }
}
