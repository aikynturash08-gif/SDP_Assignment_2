
```markdown
# Logistics & UI Framework Application

**Course:** Software Design Patterns (ShP-2216)  
**Academic Year:** 2026–2027  
**Assignment:** Assignment 2 — Factory Method and Abstract Factory  

---

## Project Overview
This application is a Java console system that combines two creational design patterns:
1. **Factory Method (Part A):** Manages transport creation (`Truck` or `Ship`) through logistics creators (`RoadLogistics` or `SeaLogistics`).
2. **Abstract Factory (Part B):** Manages cross-platform UI component families (`WindowsFactory` or `MacOSFactory`) to produce matching `Button` and `Checkbox` pairs.

The client (`DeliveryApplication`) receives both abstractions and executes UI rendering and transport delivery workflows without depending on concrete classes.

---

## Package Structure
```text
src/
└── main/
    └── java/
        └── com/
            └── logistics/
                ├── Main.java
                ├── app/
                │   └── DeliveryApplication.java
                ├── abstractfactory/
                │   ├── Button.java
                │   ├── Checkbox.java
                │   ├── GUIFactory.java
                │   ├── MacOSButton.java
                │   ├── MacOSCheckbox.java
                │   ├── MacOSFactory.java
                │   ├── WindowsButton.java
                │   ├── WindowsCheckbox.java
                │   └── WindowsFactory.java
                └── factorymethod/
                    ├── Logistics.java
                    ├── RoadLogistics.java
                    ├── SeaLogistics.java
                    ├── Ship.java
                    ├── Transport.java
                    └── Truck.java

```

---

## Prerequisites

* **JDK:** Version 17 or higher
* **IDE:** IntelliJ IDEA (or any standard Java IDE / terminal)

---

## How to Build and Run

### Option 1: IntelliJ IDEA

1. Open the project folder in IntelliJ IDEA.
2. Ensure Project SDK is set to JDK 17 (`File` -> `Project Structure` -> `Project`).
3. Run `Main.java` located in `src/main/java/com/logistics/Main.java`.

### Option 2: Terminal / Command Line

1. Navigate to the project root directory.
2. Compile all Java source files:
```bash
javac -d out src/main/java/com/logistics/*.java src/main/java/com/logistics/*/*.java

```


3. Run the application with interactive console input:
```bash
java -cp out main.java.com.logistics.Main

```


4. Or pass arguments directly via CLI:
```bash
java -cp out main.java.com.logistics.Main ROAD WINDOWS

```



---

## Supported Input Values

* **Delivery Mode:** `ROAD`, `SEA`
* **UI Platform:** `WINDOWS`, `MACOS`

---

## Sample Run

### Input

```text
Enter delivery mode (ROAD / SEA): ROAD
Enter UI platform (WINDOWS / MACOS): WINDOWS

```

### Output

```text
Delivery mode: ROAD
UI platform: WINDOWS
Rendering Windows button
Rendering Windows checkbox
Truck delivers laboratory equipment to Aktau warehouse

```

```

```
