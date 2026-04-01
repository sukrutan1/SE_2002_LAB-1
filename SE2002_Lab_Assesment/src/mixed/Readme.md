# Lab Assessment: Multiple SOLID Violations

This repository contains a Java code snippet that demonstrates several architectural issues, primarily focusing on the **Interface Segregation Principle (ISP)** and the **Open/Closed Principle (OCP)**.

## The Problem: Polluted Interfaces and Rigid Logic
The current design forces all devices to implement features they may not possess (like temperature control for a light bulb) and uses type-checking logic that is hard to maintain.

### Key Issues
* **ISP Violation**: The `Device` interface is too broad. `Light` is forced to implement `adjustTemperature()`, leading to a `RuntimeException`.
* **OCP Violation**: The `HomeAutomation` class uses `instanceof` checks. Every time a new device type is added, the `manage` method must be modified.
* **LSP Violation**: `Light` breaks the expected behavior of the `Device` contract by throwing an exception for a standard interface method.

---

## Suggested Refactor
To resolve these issues, the design should be decoupled using more specific interfaces and polymorphism:

1.  **Segregate Interfaces**: Create a base `Switchable` interface for `turnOn()` and a separate `Thermostat` interface for temperature control.
2.  **Remove Type Checking**: Use polymorphic method calls so `HomeAutomation` doesn't need to know the specific class type.

