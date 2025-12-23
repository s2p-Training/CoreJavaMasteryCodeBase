# What Is An Interface?

## Definition and Purpose

An **interface** is a blueprint of a class that defines a set of abstract methods (and constants) without providing their implementation. It specifies **what a class must do**, not **how it does it**.

In Java, interfaces are used to achieve:

* **Abstraction** – hiding implementation details
* **Loose coupling** – reducing dependency between components
* **Multiple inheritance** – allowing a class to inherit behavior from multiple sources

An interface is declared using the `interface` keyword, and a class implements it using the `implements` keyword.

---

# Multiple Inheritance

## How Interfaces Enable Multiple Inheritance

Java does not support multiple inheritance with classes (to avoid ambiguity), but it **does support multiple inheritance through interfaces**.

A class can implement **multiple interfaces**, thereby inheriting method contracts from all of them.

### Why This Works

* Interfaces contain **no state** (no instance variables)
* There is **no method implementation conflict**
* The implementing class provides the actual logic

### Syntax Example

```java
class PaymentService implements UpiPayment, CardPayment {
    // must implement all methods from both interfaces
}
```

---

# Example Of Interface

## Basic Interface Example

```java
interface Payment {
    void pay(double amount);
}
```

## Implementing the Interface

```java
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}
```

## Using the Interface (Polymorphism)

```java
Payment payment = new CreditCardPayment();
payment.pay(5000);
```

### Key Takeaway

The reference type is the **interface**, while the object is of the **implementing class**. This enables flexible and scalable design.

---

# Default, Static, and Private Methods in Interface

From Java 8 onwards, interfaces became more powerful by allowing **method implementations** in a controlled way.

## Default Methods

Default methods allow interfaces to provide a **method with implementation**.

### Why Default Methods?

* To add new methods to existing interfaces **without breaking** implementing classes

```java
interface Vehicle {
    void start();

    default void fuelType() {
        System.out.println("Petrol or Diesel");
    }
}
```

## Static Methods

Static methods belong to the **interface itself**, not to implementing classes.

```java
interface MathUtil {
    static int add(int a, int b) {
        return a + b;
    }
}
```

Usage:

```java
int result = MathUtil.add(10, 20);
```

## Private Methods (Java 9+)

Private methods are used **inside the interface** to avoid code duplication in default methods.

```java
interface Logger {
    default void info(String msg) {
        log("INFO", msg);
    }

    default void error(String msg) {
        log("ERROR", msg);
    }

    private void log(String level, String msg) {
        System.out.println(level + ": " + msg);
    }
}
```

### Key Rules

* `default` methods **can be overridden**
* `static` methods **cannot be overridden**
* `private` methods are **not accessible** outside the interface

---

# Dos And Don't Of Interface

## ✅ Do's

* **Use interfaces to define contracts** that multiple classes can follow
* **Prefer interfaces** when designing APIs
* **Keep interfaces focused** (follow Interface Segregation Principle)
* **Use default methods cautiously** for backward compatibility
* **Program to interfaces, not implementations**

## ❌ Don'ts

* **Do not add state** (instance variables) to interfaces
* **Do not overload interfaces** with too many unrelated methods
* **Do not use interfaces for code reuse** (use abstract classes instead)
* **Do not break existing interfaces**—it affects all implementing classes
* **Avoid unnecessary default methods** that complicate design

---

### Summary

Interfaces are a powerful tool for designing clean, scalable, and maintainable Java applications. Modern Java interfaces support **default**, **static**, and **private** methods, making them more flexible while still preserving abstraction and good design principles.
