# TD 09 — Héritage

Inheritance as a fundamental OO concept.

## Learning objectives
- Create classes based on existing ones
- Reuse code and specialize behavior through inheritance
- Understand `equals`/`hashCode` and object identity vs. equality

## Running example
- `Animal` superclass extracted from the duplicated `Dog`/`Cat` code from TD01 (package `g12345.pets`) — the payoff for that earlier pain point
- `Vehicle` → `Moto` / `Car` / `HybridCar` hierarchy (package `g12345.motorizedvehicle`) with `fillUpGaz()` and `ride(distance)` fuel-consumption logic overridden in `HybridCar`

## Key concepts
- `extends`, `super(...)` constructor calls
- Visibility recap: `public`, `private`, `protected`, package-default — `protected` now explained in the context of inheritance
- `@Override`
- `equals`/`hashCode` generation via IntelliJ ("Generate hashCode() and equals()"), `Objects.equals`, `Objects.hash`
- `Object` as the universal superclass
- `toString()` override
- Casting is mentioned but deferred to TD10

## Gotchas / things to watch for
- `==` vs. `.equals()` differ for objects with identical attributes *until* `equals` is overridden
- Casting to `Animal` inside `equals(Object o)` is necessary to access subclass-specific fields safely
- Exercises explicitly probe encapsulation/inheritance interaction: "what happens if you remove Dog's constructor?" and "what if Animal's attributes become private?"

## Homework exercises
1. Create an `Animal` superclass for `Dog`/`Cat`/`Bird` (from TD01) with a shared `name` attribute, moving the noise-making method up where it makes sense.
2. Override `equals()`/`hashCode()` on `Contact` and manually verify: do two contacts with identical data satisfy `.equals()`? Do they satisfy `==`?
3. Add a `Puppy extends Dog` class that overrides `bark()` to print a smaller sound, calling `super.bark()` as part of its own implementation.

