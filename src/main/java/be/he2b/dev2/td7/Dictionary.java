package be.he2b.dev2.td7;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Loads a Scrabble dictionary (ODS6 format) from the classpath and provides
 * word-validation via {@link #contains(String)}.
 *
 * <p>The dictionary file ({@code ods6.txt}) is loaded through
 * {@code getClass().getClassLoader().getResourceAsStream()} — a resource
 * accessed from the classpath.
 *
 * @author DEV2
 */
public class Dictionary {

    private static final String FILENAME = "ods6.txt";

    private final List<String> words;

    public Dictionary() {
        this.words = new ArrayList<>();
        System.out.println("loading dictionary from file: " + FILENAME);
        InputStream is = getClass().getClassLoader().getResourceAsStream(FILENAME);
        Scanner scan = new Scanner(is);
        while (scan.hasNext()) {
            this.words.add(scan.next());
        }
        System.out.println("dictionary loaded");
    }

    /**
     * Returns {@code true} if {@code word} (uppercased) exists in the
     * dictionary.
     */
    public boolean contains(String word) {
        if (word == null) {
            return false;
        }
        return this.words.contains(word.toUpperCase());
    }

    public int size() {
        return this.words.size();
    }
}
