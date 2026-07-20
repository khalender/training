# TD 07 — package, static

Revisiting packages and the `static` keyword.

## Learning objectives
- Understand package-qualified names and how `import` works
- Organize code into user-defined packages
- Understand `static` attributes/methods and class-level constants

## Running example
- Real Scrabble French dictionary (`ods6.txt`) loaded into a `Dictionary` class via `Scanner` / `getResourceAsStream`
- `MathUtil` utility class: `static` `pi`, `e`, and methods `circleArea`, `circlePerimeter`, `ellipseArea`
- Scrabble project (TD04) extended with a `BOARD_SIZE` constant and dictionary-based word validation

## Key concepts
- Package-qualified names (`java.util.ArrayList`)
- Built-in packages: `java.lang`, `java.util`, `java.io` / `java.nio`
- `import` as syntactic sugar over fully-qualified names
- User-defined packages (`package g12345.scrabble;`) and matching directory structure
- `static` attributes/methods: class-level, shared across instances, callable without instantiation
- Constants via `static final` in `UPPER_SNAKE_CASE`

## Gotchas / things to watch for
- Reserve public/package-visible attributes for rare cases — default to `private`
- Uppercase dictionary words when validating user input (`toUpperCase()`) to match the dictionary format
- Test example code directly rather than assuming it works
