# TD 03 — Listes et boucles for

Overloading, exceptions, list, `for` loop and `foreach`.

## Learning objectives
- Repeat one or more instructions a set number of times (`for` loop)
- Identify and implement method overloading
- Throw (raise) an exception
- Choose the right exception between `IllegalStateException` and `IllegalArgumentException`
- Iterate over a list by value (`foreach` loop)

## Running example
Still `Dog`: repeats `bark()` calls via a classic `for` loop, then adds `bark(int nbRepeat)` — first as a distinctly named method (`barkMultiple`), then renamed to `bark` to demonstrate overloading. `run()`/`eat()`/`bark(int)` are hardened to throw exceptions on invalid state or arguments (hungry, injured, negative repeat count).

New example: `Phonebook` holding a `List<Contact>`, with `add(Contact c)` and `display()` iterating via `foreach`.

## Key concepts
- Classic `for (init; condition; increment)` loop and its execution order
- Enhanced `for` / `foreach`: `for (Type variable : iterable) { ... }`
- Method overloading: same name, different signature (parameter list)
- `throw new IllegalStateException(...)` — for invalid *object state* (e.g. dog is hungry)
- `throw new IllegalArgumentException(...)` — for invalid *method arguments* (e.g. negative repeat count)
- `List<Contact>` and `ArrayList<>()`; the need for `import java.util.List` / `java.util.ArrayList`
- Interface vs. implementation preview: declare `List`, instantiate `ArrayList`

## Gotchas / things to watch for
- A crashing program is often *more* useful than one that silently prints a warning — exceptions make problems visible immediately
- Picking the right exception type matters: state-related → `IllegalStateException`; bad argument → `IllegalArgumentException`
- Don't forget the required `import` for `List`/`ArrayList` (IntelliJ can auto-add it)
