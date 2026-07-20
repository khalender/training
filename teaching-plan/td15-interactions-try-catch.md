# TD 15 — Interactions et try-catch

Catching exceptions and building robust input/output.

## Learning objectives
- Intercept (catch) an exception
- Read a file or standard input robustly
- Distinguish checked exceptions from unchecked exceptions

## Running example
- Robust integer reading from `Scanner`/keyboard: `readInteger()`, then `readInteger(int min, int max)`, then `readString(List<String> choices)`
- File reading via `Files.lines(Path.of(...)).findFirst().get()`, triggering `NoSuchFileException`/`IOException`
- Closing section: revisit the TD13/TD14 MVC apps to make model and view robust against exceptions and bad input

## Key concepts
- `try-catch` syntax
- `InputMismatchException`
- `Scanner.hasNextInt()` as a non-exception alternative — preferred when available
- Multiple `catch` clauses ordered specific → generic (`NoSuchFileException` → `AccessDeniedException` → `IOException`)
- Checked vs. unchecked exceptions (`IOException` is checked and must be handled)
- Catching the root `Exception` class is discouraged
- The "fail fast" principle

## Gotchas / things to watch for
- Catching an exception but not looping still isn't robust — the program can move on without ever getting a valid value; wrap the read in a loop, or `return` inside a `while (true)`
- Catching multiple exception types requires ordering from most specific to most generic, or the code won't compile
- Strong warning against silently swallowing `Exception`: "very bad idea — the program risks ending up in an inconsistent state." Failing fast beats hiding an unknown error.

## Homework exercises
1. Add a robust `readDouble(double min, double max)` loop for `BankingView`'s amount input, mirroring `readInteger(min, max)`.
2. Add file-based transaction logging: append each executed transaction to a text file, handling `IOException` gracefully instead of crashing.
3. Find any overly broad `catch (Exception e)` in your codebase and refactor it into specific, correctly-ordered `catch` clauses — explain your ordering in a comment.

