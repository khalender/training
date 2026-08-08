package be.he2b.dev2.td6;

/** Console demo matching TD06 - Le débogage. */
public final class Td6Demo {

    private Td6Demo() {
    }

    public static void run() {
        System.out.println("=== TD06 - Le débogage ===");

        System.out.println("\n-- Tuto1 : arithmetic / modulo --");
        Tuto1.main(null);

        System.out.println("\n-- Ex1.fibonacci (itératif) --");
        Ex1.fibonacci(20);

        System.out.println("\n-- Palindrome (version boguée) --");
        int[][] tests = {
            {1, 2, 3, 2, 1},
            {1, 2, 3, 4},
            {1, 2, 3, 4, 1}
        };
        String[] notes = {"palindrome", "pas palindrome", "début seulement"};
        for (int t = 0; t < tests.length; t++) {
            StringBuilder sb = new StringBuilder("  test " + (t + 1) + " : [");
            for (int i = 0; i < tests[t].length; i++) {
                if (i > 0) sb.append(", ");
                sb.append(tests[t][i]);
            }
            sb.append("] → attendu=").append(t == 0 ? "true" : "false");
            sb.append(" | isPalindrome = ").append(Palindrome.isPalindrome(tests[t]));
            sb.append(" | isPalindromeFixed = ").append(Palindrome.isPalindromeFixed(tests[t]));
            sb.append(" (").append(notes[t]).append(")");
            System.out.println(sb);
        }

        System.out.println("\nUtilisez le debugger IntelliJ pour tracer l'exécution.");
        System.out.println("Le bug dans isPalindrome : return true dans le else au 1er tour de boucle.");
        System.out.println("Le test 3 échoue : {1,2,3,4,1} devrait retourner false mais retourne true.");
    }
}
