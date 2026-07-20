# TD 04 — Scrabble

A mini object-oriented program.

## Learning objectives
- Build a first small multi-class OO program from scratch
- Get introduced to packages, `private`, 2D arrays, and enumerations (developed further later)

## Running example
A mini-mini Scrabble game:
- `Letter` — a single letter (`char`), private attribute + getter
- `Board` — a 15x15 `Letter[][]` grid, `get(row, col)`, `setLetters(row, col, Direction, Letter[])`
- `Direction` — enum with `HORIZONTAL`/`VERTICAL`
- `Bag` — `List<Letter>` holding all game letters, `draw()` / `draw(int n)`, shuffling
- `App` — main class with a game loop reading console commands (`quit`, `set <row> <col> <dir> <letter indices>`)
- Optional part 2: letter point values and a running score

## Key concepts
- Packages: qualified names (`g12345.scrabble.App`), the `package` keyword, `import`
- `private` attributes
- 2D arrays: `Letter[][] squares = new Letter[15][15];`
- A first `enum`: `public enum Direction { HORIZONTAL, VERTICAL; }`
- `ArrayIndexOutOfBoundsException` when accessing out-of-range indices
- Reading console input: `Scanner`, `System.in`, `nextLine()`, `String.split("\\s+")`
- String comparison via `.equals(...)`, string-to-int via `Integer.parseInt(...)`
- `Collections.shuffle(list)`

## Gotchas / things to watch for
- Always check `row`/`col` bounds before writing into the array, and check a cell is `null` (empty) before placing a letter
- `String.split(" ")` breaks on multiple/mixed whitespace — use `"\\s+"` instead
- `Integer.parseInt` throws if the string isn't a valid number (foreshadows TD15)
- Known limitations left in place on purpose: no crossing words, no dictionary check, no undo — good discussion points for "what's still missing"

## Homework exercises
1. Extract the chevalet (rack) handling currently inline in `App`/the game loop into its own `Rack` class with `add`, `remove`, and `display` methods.
2. Add a `Board.isEmpty(int row, int col)` helper and use it inside `setLetters` instead of the inline `null` check.
3. Add a `Bag.remaining()` method that prints how many tiles of each letter are still left in the bag (group and count by character).

