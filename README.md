# ParkWise Lots – Artefacts 2.1.a & 2.1.b

This repository contains the implementation of:
- 2.1.a: Final UML state diagram for the Conveyor lifecycle
- 2.1.b: UML class diagram (Entity–Control–Boundary) and Java implementation
for basic parking lot management, pricing lists view/import, and conveyor management.

## Repository structure
- `src/` – Java source code
- `resources/sample_data.json` – Example JSON data
- `database/ParkWise.accdb` – Microsoft Access database (schema + sample data)
- `dist/ParkWise.jar` – Executable JAR file
- `docs/diagrams/` – UML diagrams (PlantUML)

# ParkWise Lots – Artefacts 2.1.a & 2.1.b

This repository contains the implementation of the following artefacts:

- 2.1.a: Final UML state chart diagram specifying the Conveyor lifecycle
- 2.1.b: UML class diagram following the Entity–Control–Boundary (ECB) pattern,
  specifying the design related to basic parking lot management, pricing lists view
  and import, and conveyor management

## Repository structure
- `src/` – Java source code
- `resources/sample_data.json` – Example JSON data
- `database/ParkWise.accdb` – Microsoft Access database (schema and instances)
- `dist/ParkWise.jar` – Executable JAR file
- `docs/diagrams/` – UML diagrams (PlantUML)

## How to run
```bash
java -jar dist/ParkWise.jar
If double-clicking the JAR does not open a console window, run the command above.
```bash
java -jar dist/ParkWise.jar