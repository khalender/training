# TD 12 — Enumerations et records

`enum` (limited-value types) and `record` (data aggregation) classes.

## Learning objectives
- Model a fixed set of values with `enum`, including per-constant attributes
- Model simple immutable data aggregates with `record`
- Know when to reach for `enum` vs. `record`

## Running example
- `Day` enum (days of the week, `workingDay` boolean, constructor, `isWorkingDay()`)
- `Transport` enum exercise (AIRPLANE, BOAT, CAR, TRAIN, TRUCK with a `speed` attribute)
- `Product` record (name, id, price)
- `Student` record (lastName, firstName, idNumber)

## Key concepts
- `enum` keyword; constants are implicitly `public static final`
- Enums cannot be instantiated with `new` and cannot extend other classes (they implicitly extend `java.lang.Enum`)
- `==` is valid (and correct) for enum constants, since they're singleton instances
- `switch` over enum values
- Enum constructors (implicitly `private`) and per-constant parameterization
- Built-in enum methods: `values()`, `valueOf(String)`, `ordinal()`, `compareTo()`
- `record` keyword: auto-generated private final fields, accessor methods (same name, no "get" prefix), canonical constructor, auto `toString`/`equals`/`hashCode`

## Gotchas / things to watch for
- The enum constant list must end with `;` once custom members (constructor, methods) are added
- `Day d3 = new Day();` is shown explicitly as an ERROR
- Closing reflection exercise: reason about when to model something as an `enum` vs. a `record`

## Homework exercises
1. Add a method using the `Day` enum that returns a `List<Day>` containing only the working days of the week.
2. Turn `Contact` (from TD02/TD03) into a `record`, and note in a comment what has to change given that records are immutable (e.g. `setPhone`).
3. Add a `priceWithTax()` method to the `Product` record that computes a total from `price` plus a fixed tax rate.

