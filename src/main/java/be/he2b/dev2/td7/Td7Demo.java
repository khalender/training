package be.he2b.dev2.td7;

/** Console demo matching TD07 - package, static. */
public final class Td7Demo {

    private Td7Demo() {
    }

    public static void run() {
        System.out.println("=== TD07 - package, static ===");

        System.out.println("\n-- MathUtil (static constants & methods) --");
        System.out.println("  PI = " + MathUtil.PI);
        System.out.println("  E  = " + MathUtil.E);
        System.out.println("  circleArea(5)       = " + MathUtil.circleArea(5));
        System.out.println("  circlePerimeter(5)  = " + MathUtil.circlePerimeter(5));
        System.out.println("  ellipseArea(4, 2)   = " + MathUtil.ellipseArea(4, 2));

        System.out.println("\n-- ScrabbleScorer (static letter values) --");
        String[] words = {"CHAT", "ZYTHUM", "BONJOUR"};
        for (String w : words) {
            System.out.println("  score(\"" + w + "\") = " + ScrabbleScorer.scoreWord(w));
        }

        System.out.println("\n-- Dictionary (loaded from classpath) --");
        Dictionary dict = new Dictionary();
        System.out.println("  Taille du dictionnaire : " + dict.size() + " mots");
        String[] testWords = {"BONJOUR", "XYZABC", "CHAT"};
        for (String w : testWords) {
            System.out.println("  contains(\"" + w + "\") = " + dict.contains(w));
        }

        System.out.println("\n-- Dog static counter --");
        Dog.resetCounter();
        Dog d1 = new Dog("Médor");
        Dog d2 = new Dog("Rex");
        Dog d3 = new Dog("Brutus");
        System.out.println("  nDogsCreated = " + Dog.getNDogsCreated());
    }
}
