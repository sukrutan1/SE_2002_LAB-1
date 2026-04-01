# Lab Assessment: Dependency Inversion Principle (DIP)

This repository contains a Java code snippet demonstrating a common architectural pitfall: **Tight Coupling**.

## The Problem: Violation of DIP
In this example, the `NotificationApp` class is directly dependent on the concrete `GmailService` class. This violates the **Dependency Inversion Principle**, making the code difficult to extend (e.g., adding Outlook or SMS support) and hard to unit test.

### Code Overview
* **GmailService**: A low-level concrete class that handles message delivery.
* **NotificationApp**: A high-level class that is forced to rely on a specific implementation rather than an abstraction.

## Suggested Refactor
To improve this design, the code should follow these steps:
1. Create a `MessageService` interface.
2. Implement the interface in `GmailService`.
3. Use **Dependency Injection** to pass the interface into `NotificationApp`.

