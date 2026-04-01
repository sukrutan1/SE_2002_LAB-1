# Lab Assessment: Open/Closed Principle (OCP)

This repository contains a Java code snippet demonstrating a violation of the **Open/Closed Principle (OCP)**, which states that software entities should be open for extension but closed for modification.

## The Problem: Modification Required for Every Change
The `DiscountManager` class uses conditional logic (`if-else` blocks) to handle different discount types. Every time a new discount category is added (e.g., "ELDERLY" or "BLACK_FRIDAY"), the existing class must be modified. This increases the risk of introducing bugs into previously tested code.

### Code Overview
* **DiscountManager**: A class that is tightly coupled to specific discount strings and logic.
* **ProcessDiscount Method**: A method that grows in complexity as business requirements evolve, requiring constant manual updates.

---

## Suggested Refactor
To adhere to OCP, the logic should be moved into a polymorphic structure using the **Strategy Pattern**:

1. Create a `DiscountStrategy` interface with a `apply()` method.
2. Implement specific classes for each discount (e.g., `StudentDiscount`, `VipDiscount`).
3. `DiscountManager` will then use the interface to calculate discounts without needing to know the specific types.

