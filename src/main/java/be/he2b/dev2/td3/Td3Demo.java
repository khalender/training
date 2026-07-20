package be.he2b.dev2.td3;

/** Console demo matching TD03 - Listes et boucles for. */
public final class Td3Demo {

    private Td3Demo() {
    }

    public static void run() {
        System.out.println("=== TD03 - Listes et boucles for ===");

        Dog medor = new Dog("Médor");
        medor.bark(5);

        try {
            medor.bark(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }

        medor.run();
        try {
            medor.run();
        } catch (IllegalStateException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }
        medor.eat();

        Phonebook annuaire = new Phonebook();
        annuaire.add(new Contact("Albert", "Einstein", "rue d'Ailleurs", 12345));
        annuaire.add(new Contact("Mahatma", "Gandhi", "rue d'Autre Part", 54321));
        annuaire.add(new Contact("Nelson", "Mandela", "Avenue l'eau de là", 123321));
        annuaire.display();
    }
}
