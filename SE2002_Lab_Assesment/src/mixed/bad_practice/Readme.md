# Lab Assessment: 

This repository contains a Java code snippet demonstrating violations of the **Dependency Inversion Principle (DIP)** and the **Single Responsibility Principle (SRP)**.

## The Problem: Tight Coupling and Mixed Concerns
The `PaymentProcessor` class is currently "doing too much" and is "too rigid." It handles the core logic of payment, but it is also responsible for instantiating its own dependencies and managing file system logging.

### Key Issues
* **DIP Violation**: `PaymentProcessor` depends directly on the concrete `BankAPI` class. If you wanted to switch to a `PayPalAPI` or a `StripeAPI`, you would have to modify the core logic of the processor.
* **SRP Violation**: The class has multiple reasons to change: if the payment logic changes, if the bank integration changes, or if the logging mechanism changes (e.g., switching from a file to a database).
* **Hard-coded Dependency**: Because `BankAPI` is instantiated inside the method (`new BankAPI()`), it is impossible to inject a mock version for unit testing.

---

## Suggested Refactor
To clean up this architecture, the responsibilities should be separated and dependencies should be injected:

1.  **Define an Interface**: Create a `PaymentGateway` interface that `BankAPI` implements.
2.  **Externalize Logging**: Move the file writing logic to a dedicated `Logger` class.
3.  **Constructor Injection**: Pass the dependencies into `PaymentProcessor` so it doesn't care about their specific implementations.

