# TD 05 — JUnit – Les tests unitaires

Unit testing.

## Learning objectives
- Detect program errors through automated unit tests instead of manual/naïve checking
- Write meaningful test cases, especially at boundary values
- Understand refactoring and Test-Driven Development (TDD)

## Running example
`Dog.sound()` returns "Yip yip" / "Wouf" / "WOUUUF" depending on weight thresholds (<10, 10–30, >30) — tested exhaustively at boundary values 9, 10, 11, 29, 30, 31.
Also: `MyDate`/`isLenient()` (leap year logic) used as a small TDD demo, plus references back to TD03's `Phonebook`/`Contact` and TD04's `Board.setLetters()`.

## Key concepts
- JUnit 5: `@Test` annotation
- Assertions: `assertEquals`, `assertTrue` / `assertFalse`, `assertThrows(IllegalArgumentException.class, () -> ...)`
- Test naming conventions
- Test coverage
- Refactoring (defined, not yet deeply practiced — see TD13)
- Test-Driven Development (TDD) methodology
- Test plans: tables of inputs / expected results / notes

## Gotchas / things to watch for
- Naïve approaches (print-and-eyeball, hardcoded booleans) are shown first as bad practice, to motivate JUnit
- "Error in the test class" box: when a test fails, check the *test code* first, then the implementation
- Test boundary/limit values deliberately — common bugs live in `<` vs `<=`, AND vs OR mix-ups, off-by-one loop errors, and a missing `this` in a constructor/setter
- Exercise on simplifying boolean logic (removing double negatives) without breaking any existing test — tests as a safety net for refactoring
