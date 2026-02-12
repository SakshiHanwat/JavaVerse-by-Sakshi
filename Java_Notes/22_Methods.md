# 05 - Methods in Java

## Introduction to Methods

### Definition

A method in Java is a collection of statements that perform a specific task. Methods define the behaviour of a class and may return a value to the caller. However, not all methods are required to return a value.

In Java, every method must belong to a class. Unlike some other programming languages such as C, C++, and Python, standalone functions are not allowed in Java.

The `main()` method is the starting point of every Java application.

---

## Syntax of a Method

```
<access_modifier> <return_type> <method_name>(<parameters>) {
    // method body
}
```

### Components of a Method

* **Access Modifier** – Defines visibility (public, private, protected, default)
* **Return Type** – Type of value returned (void if nothing is returned)
* **Method Name** – Identifier used to call the method
* **Parameters** – Input values passed to the method
* **Method Body** – Code that defines the task performed

---

## Advantages of Using Methods

* **Code Reusability** – Avoid rewriting the same logic
* **Code Organization** – Makes code structured and readable
* **Easy Maintenance** – Changes can be made in one place
* **Modularity** – Breaks large programs into smaller parts

---

## Real-Life Analogy

Consider a car as a final product:

* Car → Final Product
* Engine, Wheels, Dashboard → Components (Classes)
* Start Engine, Rotate Wheels → Methods (Behaviours)

Each class contains behaviours represented using methods.

---

# Types of Methods in Java

## 1. Predefined Methods

These methods are already available in Java libraries.

Example:

```
System.out.println("Hello");
```

---

## 2. User-Defined Methods

These methods are created by the programmer.

Example:

```
public void playMusic() {
    System.out.println("Playing music");
}

public String giveMePen(int cost) {
    if (cost >= 10)
        return "Pen";
    return "Nothing";
}
```

Usage:

```
public static void main(String[] args) {
    Computer obj = new Computer();
    obj.playMusic();
    String str = obj.giveMePen(10);
    System.out.println(str);
}
```

---

# Static Method

A method declared with the `static` keyword belongs to the class rather than an object.

### Key Points:

* Can be called without creating an object
* Access only static members directly
* Called using class name

Example:

```
public class Display {
    public static void main(String[] args) {
        show();
    }

    static void show() {
        System.out.println("It is an example of static method.");
    }
}
```

---

# Instance Method

A non-static method belongs to an object of the class.

### Key Points:

* Requires object creation
* Can access both static and instance variables

Example:

```
public class Calculator {
    int s;

    public int add(int a, int b) {
        s = a + b;
        return s;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println("The sum is: " + obj.add(12, 13));
    }
}
```

---

# Abstract Method

An abstract method is a method without a body. It must be declared inside an abstract class.

### Rules:

* Declared using `abstract` keyword
* Class must also be abstract
* Must be implemented in subclass

Example:

```
abstract class Demo {
    abstract void display();
}

class MyClass extends Demo {
    void display() {
        System.out.println("Abstract method implementation");
    }

    public static void main(String[] args) {
        Demo obj = new MyClass();
        obj.display();
    }
}
```

---

# Final Method

The `final` keyword prevents method overriding.

### Key Points:

* Cannot be overridden in subclass
* Ensures method behaviour remains unchanged

Example:

```
class Calculator {
    public final void display() {
        System.out.println("This is a final method.");
    }
}

class Demo extends Calculator {
    // This will cause compilation error
    public final void display() {
        System.out.println("Overriding the final method.");
    }
}
```

Compiler Error:

```
error: display() in Demo cannot override display() in Calculator
The overridden method is final
```

---

# FAQs

### Q1. What is a method in Java?

A method is a block of code that performs a specific task and may return a value.

### Q2. What are the parts of a method?

* Modifiers
* Return Type
* Method Name
* Parameters
* Method Body

---

# Quick Summary

* Methods define behaviour of a class
* Java does not allow standalone functions
* Static methods belong to class
* Instance methods belong to objects
* Abstract methods have no body
* Final methods cannot be overridden

---

End of Document – Java Methods
