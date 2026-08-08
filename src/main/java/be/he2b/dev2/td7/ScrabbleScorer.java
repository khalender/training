package be.he2b.dev2.td7;

/**
 * Static Scrabble letter values and a {@code static} word-scoring method.
 *
 * <p>Homework exercise 2: a {@code MathUtil}-style utility with {@code static}
 * constants for Scrabble letter values and a {@code static} method that scores
 * a word.
 *
 * @author DEV2
 */
public final class ScrabbleScorer {

    private static final int[] LETTER_VALUES = {
        1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 10, 1, 2, 1, 1, 3, 8, 1, 1, 1, 1, 4, 10, 10, 10, 10
    };

    private ScrabbleScorer() {
    }

    /** Returns the Scrabble point value of a single uppercase letter A–Z. */
    public static int letterValue(char letter) {
        int index = letter - 'A';
        if (index < 0 || index >= LETTER_VALUES.length) {
            throw new IllegalArgumentException("Lettre invalide : " + letter);
        }
        return LETTER_VALUES[index];
    }

    /** Returns the total Scrabble score for {@code word} (case-insensitive). */
    public static int scoreWord(String word) {
        int total = 0;
        for (char c : word.toUpperCase().toCharArray()) {
            total += letterValue(c);
        }
        return total;
    }
}
