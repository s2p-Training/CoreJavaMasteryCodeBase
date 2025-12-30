# Inner Classes in Java

---

## Topics to Be Covered

1. Nested Inner Class
2. Local Inner Class
3. Anonymous Inner Class
4. Static Inner Class

---

## Why Inner Classes?

When a class becomes **large, complex, or repetitive**, it can be simplified by defining one or more classes **inside it**.

Inner classes help to:
- Reduce the complexity of a large outer class
- Group logically related code together
- Improve encapsulation and readability

Just like classes, **interfaces can also be defined inside another class**.

---

## Types of Inner Classes

1. Nested Inner Class
2. Local Inner Class
3. Anonymous Inner Class
4. Static Inner Class

---

## 1. Nested (Member) Inner Class

A nested inner class is a **non-static class** defined inside another class but outside any method.

### Key Points

- Inner class can **access all members** of the outer class directly (including private members).
- Outer class **cannot access inner class members directly**.
- To access inner class members, the outer class must **create an object** of the inner class.
- If an inner class object is created outside the outer class:
    - First create the outer class object
    - Then create the inner class object using it

### Best Practice

- The **recommended approach** is:
    - Outer class should create and use the inner class object **internally**.
    - Inner class should be accessed **indirectly via the outer class**.

This approach is more **realistic and encapsulated**.

---

## 2. Local Inner Class

A local inner class is a class defined **inside a method** of another class.

### Key Points

- Scope is limited to the method in which it is defined
- Cannot be accessed outside that method
- Used when the class logic is required only within a single method
- Can access:
    - Instance members of the outer class
    - Static members of the outer class

---

## 3. Anonymous Inner Class

An anonymous inner class is a class **without a name** and is defined **at the time of object creation**.

### Key Points

- No explicit class declaration
- Used for **one-time use** implementations
- Commonly used with:
    - Abstract classes
    - Interfaces

### Typical Usage

- When only one method needs to be overridden
- To reduce boilerplate code

---

## 4. Static Inner Class

A static inner class is declared using the `static` keyword inside another class.

### Key Points

- Does **not require** an object of the outer class to be created
- Can access **only static members** of the outer class
- Behaves like a normal class, but is scoped inside another class

---

## Summary

- Inner classes help in organizing and simplifying complex classes
- Java provides multiple types of inner classes for different use cases
- Nested and local inner classes improve encapsulation
- Anonymous inner classes are ideal for short-lived implementations
- Static inner classes are useful when no outer class instance is required

---

End of Chapter: **Inner Classes**

