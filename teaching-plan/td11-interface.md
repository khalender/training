# TD 11 — Interface

Interfaces as a way to treat different classes' objects as the same type.

## Learning objectives
- Define and implement interfaces
- Implement multiple interfaces on one class
- Understand interface extension

## Running example
A single `View` interface (`makeTitle`, `makeSubTitle`, `makeItem`, `makeParagraph`) implemented three different ways:
- `DecoratorView` — ASCII framing/underlining
- `ColorView` — ANSI color codes (`[...m`)
- `HTMLView` — HTML tags; also implements a second interface, `BlockView` (`beginItemize`/`endItemize`)

## Key concepts
- `interface` keyword — methods are implicitly `public`, attributes implicitly `public static`
- `implements`
- Implementing multiple interfaces on one class
- Interface extension: `interface BlockView extends View`

## Gotchas / things to watch for
- Implementing methods must be explicitly declared `public`, even though the interface doesn't restate it
- Nested-list indentation must stay coherent when lists appear inside list items (HTMLView)
- Once `BlockView extends View`, `HTMLView` no longer needs to separately declare `implements View`

## Homework exercises
1. Add a fourth `View` implementation, `MarkdownView`, using `#` headers and `-` bullets.
2. Add a new method to the `View`/`BlockView` interfaces (e.g. `makeLink(String text, String url)`) and implement it across all existing views.
3. Write a small `report(View view)` function that produces the same fixed content regardless of implementation, proving it works unchanged for all four views.

