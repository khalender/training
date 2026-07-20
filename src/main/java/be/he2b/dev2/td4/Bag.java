package be.he2b.dev2.td4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The bag holding every letter tile in the game, drawn at random.
 *
 * @author DEV2
 */
public class Bag {

    // French Scrabble letter distribution (100 tiles, no blanks).
    private static final String LETTERS =
            "AAAAAAAAABBCCDDDEEEEEEEEEEEEEEEFFGGHHIIIIIIIIJKLLLLLMMMNNNNNNOOOOOOPPQRRRRRRSSSSSSTTTTTTUUUUUUVVWXYZ";

    private final List<Letter> letters;

    public Bag() {
        this.letters = new ArrayList<>();
        for (char c : LETTERS.toCharArray()) {
            this.letters.add(new Letter(c));
        }
        Collections.shuffle(this.letters);
    }

    /** Draws a single letter, removing it from the bag. */
    public Letter draw() {
        if (this.letters.isEmpty()) {
            throw new IllegalStateException("Le sac est vide");
        }
        return this.letters.remove(this.letters.size() - 1);
    }

    /** Draws {@code n} letters, removing them from the bag. */
    public List<Letter> draw(int n) {
        List<Letter> drawn = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            drawn.add(this.draw());
        }
        return drawn;
    }

    public int size() {
        return this.letters.size();
    }
}
