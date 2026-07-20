# TD 10 — Polymorphisme

Treating different classes' objects as objects of a common parent type.

## Learning objectives
- Understand and use polymorphism
- Understand implicit vs. explicit casting
- Use `instanceof` safely

## Running example
- `PetStore` holding `List<Animal>` (mix of `Dog`/`Cat`), with `addAnimal`, `removeAnimal`, `makeNoise`, `allDog`/`allCat` (via `instanceof`) — plus overloaded constructors (`PetStore()` no-arg vs. list-arg)
- `BusinessContact extends Contact` added to the `PhoneBook`/`Contact` system, with `becomeProfessional`, `nPrivateContact`, `nCompanyContact`, `inCompany`

## Key concepts
- Casting: implicit (widening, e.g. `int` → `double`) vs. explicit (`(int) double_b`)
- Polymorphism: treating subclass objects as their superclass type
- `instanceof` operator
- Constructor overloading

## Gotchas / things to watch for
- Casting a child instance *up* to its parent type is implicit; casting a parent instance *down* to a child type needs an explicit cast and can fail at runtime — exercise explicitly asks "why" for both directions
- `medor.bark()` fails to compile when `medor` is declared as type `Animal`, even though the runtime object is a `Dog` — calling a subtype-only method on a supertype reference doesn't compile
- `toString()` dispatch uses the actual *runtime* class, not the declared type — this is polymorphism in action

## Homework exercises
1. Add a `PetStore.countByType()` method that loops over `List<Animal>` and counts dogs vs. cats using `instanceof`.
2. Write a `feedAll(List<Animal> animals)` method that calls a common feeding method polymorphically across all animals.
3. Deliberately trigger a `ClassCastException`: cast an `Animal` you know is a `Cat` down to `Dog`, catch the exception, and print its message.

