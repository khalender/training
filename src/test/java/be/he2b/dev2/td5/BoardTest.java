package be.he2b.dev2.td5;

import be.he2b.dev2.td4.Board;
import be.he2b.dev2.td4.Direction;
import be.he2b.dev2.td4.Letter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit tests for {@link Board#setLetters(int, int, Direction, Letter[])}.
 *
 * <p>Homework exercise 3: a test that would catch a bug where {@code <} is
 * changed to {@code <=} in the bounds check.
 */
class BoardTest {

    @Test
    void setLetters_horizontal_placesCorrectly() {
        Board board = new Board();
        Letter[] letters = {new Letter('C'), new Letter('A'), new Letter('T')};
        board.setLetters(7, 3, Direction.HORIZONTAL, letters);

        assertEquals('C', board.get(7, 3).getLetter());
        assertEquals('A', board.get(7, 4).getLetter());
        assertEquals('T', board.get(7, 5).getLetter());
    }

    @Test
    void setLetters_vertical_placesCorrectly() {
        Board board = new Board();
        Letter[] letters = {new Letter('D'), new Letter('O'), new Letter('G')};
        board.setLetters(2, 5, Direction.VERTICAL, letters);

        assertEquals('D', board.get(2, 5).getLetter());
        assertEquals('O', board.get(3, 5).getLetter());
        assertEquals('G', board.get(4, 5).getLetter());
    }

    @Test
    void setLetters_emptyArray_doesNothing() {
        Board board = new Board();
        board.setLetters(0, 0, Direction.HORIZONTAL, new Letter[0]);
        assertNull(board.get(0, 0));
    }

    @Test
    void setLetters_outOfBounds_throws() {
        Board board = new Board();
        Letter[] letters = {new Letter('A'), new Letter('B')};
        assertThrows(IllegalArgumentException.class,
                () -> board.setLetters(14, 14, Direction.HORIZONTAL, letters));
    }

    @Test
    void setLetters_occupiesExactLastColumn_succeeds() {
        Board board = new Board();
        Letter[] letters = {new Letter('A'), new Letter('B')};
        board.setLetters(0, 13, Direction.HORIZONTAL, letters);
        assertEquals('A', board.get(0, 13).getLetter());
        assertEquals('B', board.get(0, 14).getLetter());
    }

    @Test
    void setLetters_occupiesExactLastRow_succeeds() {
        Board board = new Board();
        Letter[] letters = {new Letter('A'), new Letter('B')};
        board.setLetters(13, 0, Direction.VERTICAL, letters);
        assertEquals('A', board.get(13, 0).getLetter());
        assertEquals('B', board.get(14, 0).getLetter());
    }

    @Test
    void setLetters_overwrite_throws() {
        Board board = new Board();
        board.setLetters(0, 0, Direction.HORIZONTAL, new Letter[]{new Letter('A')});
        assertThrows(IllegalStateException.class,
                () -> board.setLetters(0, 0, Direction.HORIZONTAL, new Letter[]{new Letter('B')}));
    }
}
