package be.he2b.dev2.td4;

/**
 * The 15x15 Scrabble board.
 *
 * @author DEV2
 */
public class Board {

    public static final int SIZE = 15;

    private final Letter[][] squares;

    public Board() {
        this.squares = new Letter[SIZE][SIZE];
    }

    public Letter get(int row, int col) {
        checkBounds(row, col);
        return this.squares[row][col];
    }

    /** Places {@code letters} in a row starting at (row, col), one square per letter. */
    public void setLetters(int row, int col, Direction direction, Letter[] letters) {
        int endRow = direction == Direction.VERTICAL ? row + letters.length - 1 : row;
        int endCol = direction == Direction.HORIZONTAL ? col + letters.length - 1 : col;
        checkBounds(endRow, endCol);

        for (int i = 0; i < letters.length; i++) {
            int r = direction == Direction.VERTICAL ? row + i : row;
            int c = direction == Direction.HORIZONTAL ? col + i : col;
            if (this.squares[r][c] != null) {
                throw new IllegalStateException("La case (" + r + "," + c + ") est déjà occupée");
            }
        }

        for (int i = 0; i < letters.length; i++) {
            int r = direction == Direction.VERTICAL ? row + i : row;
            int c = direction == Direction.HORIZONTAL ? col + i : col;
            this.squares[r][c] = letters[i];
        }
    }

    private void checkBounds(int row, int col) {
        if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
            throw new IllegalArgumentException("Position (" + row + "," + col + ") hors du plateau");
        }
    }

    public void display() {
        String separator = "+---".repeat(SIZE) + "+";
        for (int i = 0; i < SIZE; i++) {
            System.out.println(separator);
            for (int j = 0; j < SIZE; j++) {
                Letter letter = this.squares[i][j];
                if (letter != null) {
                    System.out.print("| " + letter.getLetter() + " ");
                } else {
                    System.out.print("|   ");
                }
            }
            System.out.println("|");
        }
        System.out.println(separator);
    }
}
