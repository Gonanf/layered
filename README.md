<p align="center">
  <img src="assets/banner.png" alt="layered" width="100%">
</p>

<h1 align="center">layered</h1>

<p align="center"><b>Layered architecture demo in Java — Route, View, Service, DAO, Models.</b></p>

<p align="center">
  <img alt="estado" src="https://img.shields.io/badge/estado-prototipo-F59E0B">
  <img alt="lenguaje" src="https://img.shields.io/badge/java-17+-ED8B00">
  <img alt="licencia" src="https://img.shields.io/badge/licencia-ninguna-lightgrey">
  <img alt="última actividad" src="https://img.shields.io/badge/ultima_actividad-2026--09-lightgrey">
</p>

---

## What is it

A minimal Java web application demonstrating layered architecture. The app serves cake ("torta") data through a simple HTTP server with four distinct layers: routing, view rendering, service logic, and data access.

**In one sentence:** An educational project showing how to separate concerns in a Java web app without any external frameworks.

## State

| | |
|---|---|
| **State** | prototype |
| **Last activity** | 2026-09 |
| **Can it be used today** | No — placeholder data only, no build system, no tests |
| **What's missing** | Real database, build configuration (Maven/Gradle), tests, proper error handling |
| **Known issues** | Hardcoded placeholder data, public fields on model classes, no input validation |

## Why it exists

Educational project demonstrating layered architecture patterns in Java. The layers are clearly separated:

```
Route (HTTP)  →  View (HTML)  →  Service (logic)  →  DAO (data)  →  Models
```

Each layer communicates only with the layer directly below it through interfaces, making the architecture testable and replaceable.

## Installation and usage

Requirements: Java 17+

```bash
# Compile (from repo root)
javac -d out $(find app -name "*.java")

# Run
java -cp out app.src.main.chaos.layered.Main
```

Then open `http://localhost:8080/` in a browser.

**Note:** There is no build system configured. Compilation commands are approximate — the `out/` directory contains pre-compiled `.class` files from the original author's environment.

## Stack

- **Language:** Java 17+
- **HTTP server:** `com.sun.net.httpserver.HttpServer` (JDK built-in)
- **Frameworks:** None — pure JDK
- **Build system:** None configured
- **Dependencies:** Zero external dependencies

## Architecture

```
HomeRoute / TortaRoute   ← HTTP handlers
        ↓
    TortaView            ← renders HTML tables
        ↓
    TortaService         ← business logic (thin pass-through)
        ↓
    TortaDAOInterface    ← data access abstraction
        ↓
    TortaDAOPlaceholder  ← hardcoded test data
        ↓
    TortaInfo / IngredientInfo  ← domain models
```

All layers communicate through Java interfaces (`TortaServiceInterface`, `TortaDAOInterface`, `TortaViewInterface`), enabling easy replacement of any layer.

## Repo structure

```
app/src/main/chaos/layered/
  Main.java                # Entry point, wires all layers
  models/
    TortaInfo.java         # Cake model (name, price, ingredients)
    IngredientInfo.java    # Ingredient model (name, quantity)
  route/
    HomeRoute.java         # GET / → renders all cakes
    TortaRoute.java        # GET /torta/{id} → renders one cake
  services/
    TortaService.java      # Business logic layer
    TortaServiceInterface.java
  view/
    TortaView.java         # HTML rendering
    TortaViewInterface.java
  database/
    TortaDAOInterface.java # Data access contract
    TortaDAOPlaceholder.java  # Hardcoded placeholder data
out/                       # Pre-compiled .class files
```

## Roadmap

- [ ] Add Maven or Gradle build system
- [ ] Implement a real DAO (SQLite or in-memory with JSON)
- [ ] Add input validation and error responses
- [ ] Add unit tests for service and view layers
- [ ] Create an API layer (JSON endpoints) — noted as TODO in `Main.java`

## Notes and decisions

- **No frameworks on purpose.** The project exists to demonstrate architecture patterns, not to ship a product. Using `com.sun.net.httpserver` keeps the stack zero-dependency.
- **Placeholder DAO returns hardcoded data.** `TortaDAOPlaceholder` always returns the same cake ("amoga", price 200, one ingredient). This is intentional for the architecture demo.
- **Public fields on models.** `TortaInfo` and `IngredientInfo` use public fields instead of getters/setters. This is a simplification — the view layer accesses them directly.

## License

No license specified. Not open source — visible only.

---

*Original author: Gonanf — https://github.com/Gonanf/layered*
