package be.he2b.dev2.td5;

/** Console demo matching TD05 - JUnit (tests unitaires). */
public final class Td5Demo {

    private Td5Demo() {
    }

    public static void run() {
        System.out.println("=== TD05 - JUnit (tests unitaires) ===");

        System.out.println("\n-- Dog.sound() aux valeurs limites --");
        int[] weights = {9, 10, 11, 29, 30, 31};
        for (int w : weights) {
            Dog dog = new Dog("Dog" + w, w);
            System.out.println("  weight=" + w + " → " + dog.sound());
        }

        System.out.println("\n-- bark(int) --");
        Dog medor = new Dog("Médor", 20);
        medor.bark(3);

        System.out.println("\n-- bark(0) doit lever une exception --");
        try {
            medor.bark(0);
        } catch (IllegalArgumentException e) {
            System.out.println("  Exception attrapée : " + e.getMessage());
        }

        System.out.println("\n-- MyDate / isLenient() (TDD demo) --");
        int[] years = {2003, 2004, 1900, 2000, 2020, 2024, 2100};
        for (int y : years) {
            MyDate date = new MyDate(1, 1, y);
            System.out.println("  " + y + " bissextile ? " + date.isLenient());
        }

        System.out.println("\nLes tests JUnit se trouvent dans src/test/java/be/he2b/dev2/td5/");
    }
}
