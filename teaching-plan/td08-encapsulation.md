# TD 08 — Encapsulation

Encapsulation and argument-passing semantics.

## Learning objectives
- Apply encapsulation to keep objects internally coherent
- Understand Java visibility levels
- Understand pass-by-value semantics for primitives vs. reference types

## Running example
- `Dog` made fully encapsulated: weight/name validated via `IllegalArgumentException` in setters/constructor
- `Contact` similarly encapsulated (name/firstName/address ≥ 2 characters, phone a positive int ≥ 4 digits)
- `PhoneBook` (from TD03) gains `update()` and `merge()` methods
- Pass-by-value experiments comparing an `int` parameter vs. a `Dog` parameter, with memory diagrams (boxes and arrows) for `List<Dog>`
- `feed(Dog, int)` overloaded to `feed(List<Dog>, int)`

## Key concepts
- Encapsulation: private attributes + public methods keep the object's internal state coherent
- Java visibility levels: `private`, `public`, package-default, `protected` (mentioned, deferred to TD09/inheritance)
- Primitive types vs. reference types
- Pass-by-value semantics: primitives are copied; for references, the *reference* is copied — a method can mutate the referenced object but cannot reassign the caller's variable
- Memory diagrams to visualize references

## Gotchas / things to watch for
- **Attention**: all non-primitive types (including `String` and arrays) are reference types
- Exercises deliberately show the surprising difference between mutating an object through its reference (visible to the caller) vs. reassigning the parameter itself (invisible to the caller)
- A footnote flags `final` on a setter without fully explaining it yet — that's reserved for the inheritance TD
