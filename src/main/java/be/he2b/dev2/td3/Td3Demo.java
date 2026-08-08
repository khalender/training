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

        Phonebook mustafaPhoneBook = new Phonebook();
        mustafaPhoneBook.add(new Contact("Albert", "Einstein", "rue d'Ailleurs", 12345));
        mustafaPhoneBook.add(new Contact("Mahatma", "Gandhi", "rue d'Autre Part", 54321));
        mustafaPhoneBook.add(new Contact("Nelson", "Mandela", "Avenue l'eau de là", 123321));
        mustafaPhoneBook.display();

        for(int i = 0 ; i < mustafaPhoneBook.getContacts().size(); i++){
            System.out.println(i);
            System.out.println(mustafaPhoneBook.getContacts().get(i).getFullName());
        }

        for(Contact contact : mustafaPhoneBook.getContacts()){
            System.out.println(contact.getFullName());
        }

        mustafaPhoneBook.getContacts().forEach(x -> System.out.println(x.getFullName()));
    }
}
