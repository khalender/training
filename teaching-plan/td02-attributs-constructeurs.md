# TD 02 — Attributs et constructeurs

Adding attributes to classes, plus types and visibility basics.

## Learning objectives
- Add meaningful state (attributes) to a class
- Write and use constructors
- Distinguish accessors (getters) from mutators (setters)

## Running example
Continues `Dog`: adds `name`, `weight`, `hungry` attributes, a constructor, `bark()` referencing `this.name`, a weight-dependent bark message, plus `run`/`eat` methods.

New example: `Contact` class (name, firstName, address, phone as `int`) with a constructor, hand-written getters (`getAddress`, `getFullName`), and an IntelliJ-generated setter (`setPhone`).

## Key concepts
- Attributes vs. methods
- The `this` keyword
- Constructors — default vs. user-defined; IntelliJ "Generate → Constructor"
- Typed variables
- Accessor/getter and mutator/setter vocabulary
- `if / else if / else` syntax
- Default attribute values (e.g. `boolean hungry = false`)

## Gotchas / things to watch for
- Adding a custom constructor removes the implicit default no-arg constructor — this can break other code that relied on it (use IntelliJ's Find panel to locate the fallout)
- IntelliJ's constructor-generation dialog isn't always the right call — think about which attributes should actually be constructor parameters vs. defaulted
- Type-checking errors are caught at compile time (e.g. passing an `int` where a `String` is expected)
