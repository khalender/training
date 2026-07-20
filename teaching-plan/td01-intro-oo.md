# TD 01 — Intro Orienté Objet

Introduction to the IntelliJ IDE, the Java language, and object orientation.

## Learning objectives
- Set up and navigate an IntelliJ/Maven project correctly
- Write and run a first object-oriented Java program
- Understand the anatomy of a class and a method

## Running example
`Dog` class that barks. `Main` instantiates a `Dog` and calls `bark()`.

Closing exercise: create a parallel `Cat` class (`meow()` instead of `bark()`) by copy-pasting `Dog` — deliberately shows code duplication, which motivates inheritance in TD09.

## Key concepts
- IntelliJ project creation: Maven, JDK 21 (OpenJDK), unchecking "Add sample code"
- Anatomy of a class (`class`, `public`, braces)
- Anatomy of a method (return type, `void`, `main` signature: `public static void main(String[] args)`)
- Object instantiation with `new`
- Strongly-typed variable declaration
- Javadoc comments (`/** ... */`, `@author`) and generating HTML docs via Tools → Generate Javadoc
- Compiled `.class` files land in `target/`

## Gotchas / things to watch for
- Always use Maven for DEV2 projects
- Open the folder containing `pom.xml` as the project — not a wrong parent/child folder
- Comment code with Javadoc as a professional habit from day one
- IntelliJ's "no usages" hint is a useful signal, not noise — pay attention to it

## Homework exercises
1. Add a `Bird` class with a `fly()` method that prints a message, following the exact same pattern as `Dog`/`Cat`.
2. Add Javadoc (`/** ... */`, `@author`) to `Dog` and `Cat`, then generate the HTML docs via Tools → Generate Javadoc and open the result in a browser.
3. In `Main`, instantiate a `Dog`, a `Cat`, and your new `Bird`, and call each one's action twice in a row (plain repeated calls — no loops yet).

