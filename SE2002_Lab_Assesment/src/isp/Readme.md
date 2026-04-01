
### Interface Segregation Principle (ISP)

```markdown
# Lab Assessment: Interface Segregation Principle (ISP)

This repository contains a Java code snippet demonstrating a violation of the **Interface Segregation Principle (ISP)**.

## The Problem: Fat Interfaces
The `SmartDevice` interface is a "fat interface" because it bundles multiple responsibilities (print, scan, fax) into a single contract. This forces the `SimplePrinter` class to implement methods it cannot physically perform.

### Code Overview
* **SmartDevice**: An interface that lacks granularity.
* **SimplePrinter**: A class forced to provide empty or "do-nothing" implementations for `scan()` and `fax()`, which leads to misleading code.

## Suggested Refactor
To adhere to ISP, the large interface should be split into smaller, specific interfaces:
1. **Printer**: Contains `print()`.
2. **Scanner**: Contains `scan()`.
3. **Fax**: Contains `fax()`.

`SimplePrinter` should only implement the `Printer` interface.