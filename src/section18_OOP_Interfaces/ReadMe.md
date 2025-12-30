# Chapter: Interfaces in Java

Interfaces define a **contract** that classes must follow. They specify **what a class should do**, not **how it should do it**. This chapter explains interfaces conceptually and practically using multiple real-world and core Java examples.

---

## Why Interfaces?

Interfaces are used to achieve:

- **Abstraction** – hiding implementation details
- **Loose Coupling** – reducing dependency between components
- **Multiple Inheritance** – inheriting behavior from multiple sources
- **Polymorphism** – programming to a contract, not an implementation

An interface is declared using the `interface` keyword and implemented using the `implements` keyword.

---

## Interface vs Abstract Class (Warm-up Example)

### Example 1: Abstract Class Polymorphism

```java
abstract class ParentTest1 {
    abstract void method1();
    abstract void method2();
}
```

```java
ParentTest1 obj = new ChildTest1();
obj.method1();
obj.method2();
```

### Key Observation

- Reference type controls **accessible methods**
- Object type controls **actual method execution**

---

## Basic Interface Example

### Example 2: Interface Implementation

```java
interface ParentTest2 {
    void method1();
    void method2();
}
```

```java
ParentTest2 obj = new ChildTest2();
obj.method1();
obj.method2();
```

### Key Takeaway

> The reference type is the **interface**, while the object is of the implementing class.

This enables **flexible and scalable design**.

---

## Multiple Inheritance Using Interfaces

Java does **not support multiple inheritance with classes**, but it does support it using **interfaces**.

### Example 3: SmartPhone

```java
class SmartPhone extends Phone implements ICamera, IMusicPlayer {
}
```

### Why This Works

- Interfaces contain **no instance state**
- No method implementation conflict
- The implementing class provides the logic

### Interface-Based Polymorphism

```java
IMusicPlayer m = smartphone;
ICamera c = smartphone;
```

Each reference exposes **only its own behavior**.

---

## Real-World Use Case: Loose Coupling & Callback

### Example 4: Store and Customer

```java
interface IMember {
    void callback();
    boolean isPremiumMember();
}
```

### Design Benefits

- `Store` depends only on `IMember`, not `Customer`
- New member types can be added without modifying `Store`
- Demonstrates **Dependency Inversion Principle**

---

## Advanced Interface Features (Java 8+)

### Default Methods

- Allow method implementation in interfaces
- Used for backward compatibility

```java
default void method5() {
    System.out.println("Default Method");
}
```

---

### Static Methods

- Belong to the interface itself
- Cannot be overridden

```java
Test1.method3();
```

---

### Private Methods (Java 9+)

- Used internally by default methods
- Reduce code duplication
- Not accessible outside the interface

---

## Interface Inheritance

Interfaces can extend other interfaces.

```java
interface Test2 extends Test1 {
    void method4();
}
```

Implementing class must implement **all inherited methods**.

---

## Rules of Interfaces

- All methods are **public and abstract** by default
- All variables are **public, static, and final**
- Interfaces cannot have constructors
- Interfaces cannot have instance variables

---

## Do’s and Don’ts of Interfaces

### ✅ Do’s

- Use interfaces to define contracts
- Prefer interfaces when designing APIs
- Keep interfaces focused (ISP)
- Program to interfaces, not implementations

### ❌ Don’ts

- Do not add state to interfaces
- Do not overload interfaces with unrelated methods
- Do not misuse default methods
- Avoid breaking existing interfaces

---

## Summary

- Interfaces are fundamental to clean Java design
- Enable abstraction, loose coupling, and polymorphism
- Support multiple inheritance safely
- Modern Java interfaces support default, static, and private methods

---

End of Chapter: **Interfaces**

