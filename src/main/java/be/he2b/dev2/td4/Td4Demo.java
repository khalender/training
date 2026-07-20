package be.he2b.dev2.td4;

import java.util.List;
import java.util.Scanner;

/**
 * Interactive console demo matching TD04 - Scrabble (mini-project).
 *
 * <p>Commands:
 * <ul>
 *   <li>{@code set <row> <col> <h|v> <indice> [indice...]} - places rack letters on the board
 *   <li>{@code quit} - ends the game
 * </ul>
 */
public final class Td4Demo {

    private Td4Demo() {
    }

    public static void run() {
        System.out.println("=== TD04 - Scrabble (mini) ===");
        System.out.println("Commandes : 'set <row> <col> <h|v> <indice> [indice...]' ou 'quit'");

        Bag bag = new Bag();
        Board board = new Board();
        List<Letter> rack = bag.draw(7);

        Scanner in = new Scanner(System.in);
        while (true) {
            board.display();
            displayRack(rack);

            System.out.print("> ");
            if (!in.hasNextLine()) {
                break;
            }
            String[] elements = in.nextLine().trim().split("\\s+");
            String command = elements[0];

            if (command.equals("quit")) {
                break;
            } else if (command.equals("set")) {
                handleSet(elements, board, rack, bag);
            } else {
                System.out.println("Commande inconnue : " + command);
            }
        }
        System.out.println("Fin de la partie.");
    }

    private static void handleSet(String[] elements, Board board, List<Letter> rack, Bag bag) {
        try {
            int row = Integer.parseInt(elements[1]);
            int col = Integer.parseInt(elements[2]);
            Direction direction = elements[3].equalsIgnoreCase("h") ? Direction.HORIZONTAL : Direction.VERTICAL;

            Letter[] letters = new Letter[elements.length - 4];
            for (int i = 0; i < letters.length; i++) {
                int index = Integer.parseInt(elements[4 + i]);
                letters[i] = rack.get(index);
            }

            board.setLetters(row, col, direction, letters);

            for (Letter letter : letters) {
                rack.remove(letter);
            }
            rack.addAll(bag.draw(Math.min(letters.length, bag.size())));
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            System.out.println("Commande mal formée. Exemple : set 7 3 h 0 1");
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Coup invalide : " + e.getMessage());
        }
    }

    private static void displayRack(List<Letter> rack) {
        System.out.print("Chevalet : ");
        for (int i = 0; i < rack.size(); i++) {
            System.out.print("[" + i + ":" + rack.get(i).getLetter() + "] ");
        }
        System.out.println();
    }
}
