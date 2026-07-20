# TD 13 — MVC - Refactoring

The MVC (model-view-controller) architectural pattern, and IDE-assisted refactoring.

## Learning objectives
- Understand the MVC pattern and separation of concerns (SOC)
- Refactor an existing program into MVC without changing its behavior
- Use IntelliJ's refactoring tools confidently

## Running example
Refactors the existing Scrabble project (TD04, extended in TD07) into MVC packages:
- `g12345.scrabble.model` — `Letter`, `Direction`, `Bag`, `Dictionary`, `Board`, and a new `Model` class aggregating board/bag/dictionary/score/rack
- `g12345.scrabble.view` — `View` class with `displayBoard()`, `displayRack()`
- `Controller` — owns the game loop, previously living in `App`

Final exercise: swap in a classmate's `View` implementation by changing only one `import` line.

## Key concepts
- MVC pattern: model = business logic/data coherence, view = visual representation, controller = receives user interaction and relays it to the model
- Separation of concerns (SOC)
- Refactoring: improving structure/readability without changing behavior
- `Collections.unmodifiableList()` to expose an internal list read-only
- IntelliJ refactor tools: move class to package, `Ctrl+M` (Move Static Members), `Alt+Insert` (Generate menu), Refactor → Introduce constant

## Gotchas / things to watch for
- This is "MVC non-GUI" — no graphical clicks; the controller handles textual/console interaction instead
- The model must never expose its internal `board`/`rack` collections directly — it returns a single `Letter` via `get(row, col)` and an unmodifiable list for the rack (encapsulation)
- Commit and tag in git *before* starting the refactor, as a safety net
- Word-validation responsibility is explicitly moved out of `Board` and into `Model` — a concrete example of separation of concerns

## Homework exercises
1. Add a second `View` implementation (reusing one from TD11) into the Scrabble MVC app and swap it in by changing only one `import` line.
2. Extract the optional TD04 score-keeping logic into `Model`, exposing only a `getScore()` accessor to the view/controller.
3. Write a JUnit test (TD05 skills) for `Model` that requires no console I/O, demonstrating that the MVC split makes the model easy to test in isolation.

