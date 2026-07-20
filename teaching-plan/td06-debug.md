# TD 06 — Le débogage

Using the IntelliJ debugger.

## Learning objectives
- Use a real debugger instead of `System.out.println` to understand program behavior
- Trace execution step by step and inspect live state
- Find and fix a bug using a test plan plus the debugger

## Running example
- `Tuto1` — small arithmetic/modulo program used as a basic debugger tutorial
- `Ex1.fibonacci(int n)` — iterative Fibonacci
- `isPalindrome(int[] tab)` — deliberately buggy method (returns early due to a misplaced `if`/`else`), caught by a 3-case test plan where the 3rd case fails

## Key concepts
- Breakpoints
- Step buttons: step over, step into, run to cursor, resume, stop
- Inspecting variable values live during a paused run
- Hovering to evaluate sub-expressions
- The "Evaluate expression" field

## Gotchas / things to watch for
- `System.out.println` debugging is explicitly discouraged as slower and messier than using the debugger
- The `isPalindrome` exercise is intentionally buggy — the point is to trace it live, find the misplaced control flow, fix it, and then look for performance improvements once it's correct
