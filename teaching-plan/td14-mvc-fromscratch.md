# TD 14 — Modèle-Vue-Contrôleur (suite)

Building a full MVC application from scratch on a new domain, backed by a real database.

## Learning objectives
- Design an MVC application from scratch (not just refactor one)
- Integrate a real persistence layer (SQLite via JDBC)
- Apply constructor validation and state-transition guards in a realistic domain

## Running example
New "bank" Maven project:
- Model: `Customer` (num, name, address); `Account` (owner, amount, negative flag, IBAN — validating constructor, `add(double amount)`); `Status` enum (SUBMITTED / REJECTED / COMPLETED); `Transaction` (debtor/creditor accounts, amount, status, `execute()` logic); provided `DatabaseAccessor` reading/writing SQLite `bank.db` via JDBC
- View: `BankingView` (title, ask IBAN debtor/creditor, ask amount, display transaction result)
- Controller: `Controler.startPayment()` orchestrating the full flow
- Entry point: `BankingApp.main`

## Key concepts
- SQLite JDBC dependency in `pom.xml` (`org.xerial:sqlite-jdbc`)
- MVC applied to a "real", persistence-backed application
- Constructor validation patterns using `IllegalArgumentException`
- `IllegalStateException` for invalid transaction state transitions
- JUnit tests provided for `Account` using `assertDoesNotThrow` / `assertThrows` with lambdas
- Separation of concerns reinforced: "all display must happen in the view"

## Gotchas / things to watch for
- A transaction's amount must always be positive (unlike an account balance, which may go negative if allowed) — validated in the constructor
- `execute()` must reject re-execution if the transaction's status isn't `SUBMITTED` (throw `IllegalStateException`)
- Insufficient-funds case sets status to `REJECTED` without touching either account
- Note box flags the object-relational mapping mismatch as a preview of later coursework on alternative persistence models
