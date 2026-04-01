# Lab Assessment: Liskov Substitution Principle (LSP)

This repository contains a Java code snippet demonstrating a violation of the **Liskov Substitution Principle (LSP)** within the SOLID framework.

## The Problem: Breaking the Contract
The `SocialMedia` abstract class defines a contract that assumes all social platforms share the same features. When `WhatsApp` inherits from this class, it is forced to implement `postStory()`, a feature it does not support in the same context as Instagram.

### Code Overview
* **SocialMedia**: The base class that establishes an incorrect generalization.
* **WhatsApp**: A subclass that breaks the application's behavior by throwing an `UnsupportedOperationException`. This means a `WhatsApp` object cannot be substituted for a `SocialMedia` object without causing potential runtime crashes.

---

## Suggested Refactor
To fix this violation, the hierarchy should be restructured to ensure that subclasses truly fulfill the behavior of their parent:

1.  **Extract Core Logic**: Keep only universal features (like `chat()`) in the base class.
2.  **Use Interfaces**: Create a `StoryFeature` interface for platforms that actually support stories.
3.  **Specific Inheritance**: Only `Instagram` should implement the `StoryFeature` interface.

