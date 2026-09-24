Logistics & UI Management System (Software Design Patterns - Assignment 2)

Project Overview

This Java application simulates a unified delivery and UI rendering system, created for Astana IT University (Software Design Patterns Course 2026-2027). The project demonstrates the combined use of two creational design patterns:

Factory Method Pattern (Part A): Manages transport creation (Truck or Ship) and encapsulates the delivery workflow through abstract creators (RoadLogistics, SeaLogistics).

Abstract Factory Pattern (Part B): Provides a family of matching UI components (Button and Checkbox) for different operating system platforms (WindowsFactory, MacOSFactory).

Both patterns are integrated dynamically at runtime through command-line arguments or user console input.

Package Structure

src/main/java/com/logistics/
│
├── abstractfactory/         # Abstract Factory Pattern (Part B)
│   ├── Button.java          # Product interface for buttons
│   ├── Checkbox.java        # Product interface for checkboxes
│   ├── GUIFactory.java      # Abstract Factory interface
│   ├── WindowsButton.java   # Concrete Product (Windows)
│   ├── WindowsCheckbox.java # Concrete Product (Windows)
│   ├── WindowsFactory.java  # Concrete Factory (Windows)
│   ├── MacOSButton.java     # Concrete Product (macOS)
│   ├── MacOSCheckbox.java   # Concrete Product (macOS)
│   └── MacOSFactory.java    # Concrete Factory (macOS)
│
├── factorymethod/           # Factory Method Pattern (Part A)
│   ├── Transport.java       # Product interface for delivery modes
│   ├── Truck.java           # Concrete Product (Road)
│   ├── Ship.java            # Concrete Product (Sea)
│   ├── Logistics.java       # Abstract Creator declaring factory method
│   ├── RoadLogistics.java   # Concrete Creator (Road)
│   └── SeaLogistics.java    # Concrete Creator (Sea)
│
├── app/
│   └── DeliveryApplication.java # Client using abstract contracts
│
└── Main.java                # Entry point & input validation


Prerequisites

Java Development Kit (JDK): Version 17 or higher.

IDE / Build Tool: IntelliJ IDEA (or any Java IDE) or standard JDK CLI tools (javac / java).

Build and Run Instructions

Option 1: Using IntelliJ IDEA

Open the project folder in IntelliJ IDEA.

Ensure Project SDK is set to JDK 17.

Right-click on Main.java located in src/main/java/com/logistics/Main.java.

Click Run 'Main.main()'.

Enter the requested choices (ROAD/SEA and WINDOWS/MACOS) in the IDE terminal.

Option 2: Using Command Line (CLI)

Navigate to the source directory:

cd src


Compile all Java sources:

javac main/java/com/logistics/*.java main/java/com/logistics/*/*.java


Run using interactive console input:

java main.java.com.logistics.Main


Run using command-line arguments:

java main.java.com.logistics.Main ROAD WINDOWS


Supported Input Values

Delivery Modes: ROAD, SEA (case-insensitive)

UI Platforms: WINDOWS, MACOS (case-insensitive)

Sample Execution & Output

Example 1: ROAD + WINDOWS

Input:

Enter delivery mode (ROAD / SEA): ROAD
Enter UI platform (WINDOWS / MACOS): WINDOWS


Console Output:

Delivery mode: ROAD
UI platform: WINDOWS
Rendering Windows button
Rendering Windows checkbox
Truck delivers laboratory equipment to Aktau warehouse


Example 2: Invalid Input Handling

Input:

Enter delivery mode (ROAD / SEA): AIR
Enter UI platform (WINDOWS / MACOS): WINDOWS


Console Output:

Error: Unsupported or missing delivery mode: 'AIR'
