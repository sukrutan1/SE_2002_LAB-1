# Lab Assessment: Single Responsibility Principle (SRP)

This repository contains a Java code snippet demonstrating a violation of the **Single Responsibility Principle (SRP)**, the first principle of SOLID.

## The Problem: God Class / Multiple Responsibilities
The `Invoice` class is currently doing too much. It handles business logic, data persistence, and communication. According to SRP, a class should have only one reason to change. As it stands, this class must be modified if the tax calculation changes, if the database schema changes, or if the email service provider changes.

### Code Overview
* **Business Logic**: `calculateTotal()` manages financial calculations.
* **Persistence**: `saveToDatabase()` handles storage concerns.
* **Notification**: `sendEmail()` handles external communications.

---

## Suggested Refactor
To comply with SRP, the responsibilities should be delegated to specialized classes:

1.  **Invoice**: Should only contain the data (amount) and core logic.
2.  **InvoiceRepository**: Should handle the `saveToDatabase()` logic.
3.  **EmailService**: Should handle the `sendEmail()` logic.

