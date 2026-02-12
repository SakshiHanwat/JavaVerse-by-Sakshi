# 📘 Java Class and Object – Theory & Practical Guide

---

# 🔹  Class and Object Theory

## 📌 Introduction

Java is primarily an object-oriented programming language. While it extensively uses objects and classes to structure code, it also includes primitive data types. Classes and objects are fundamental concepts in Java's implementation of Object-Oriented Programming (OOP), used to represent real-world concepts and entities.

---

## 🔹 Understanding Objects

* An object has **properties (attributes)** and **functions (methods)** — it knows something and does something.
* Example: A pen

  * Attributes: height, dimensions, color
  * Functions: writing

---

## 🔹 Java Classes

* A class in Java is a **blueprint for creating objects**.
* It defines common behaviors and properties shared by all objects of that class.
* Classes are user-defined data types that act as templates for objects.

---

## 🔹 Java Objects

* An object in Java is an **instance of a class**.
* It is a basic unit of Object-Oriented Programming.
* Objects represent real-life entities.

---

## 🔹 Object-Oriented Programming (OOP)

* In OOP, an object has:

  * Properties (attributes)
  * Behaviors (methods)

* To create an object, the first step is to create a class.

* The class serves as the blueprint for the object.

* Once the class is created, the Java compiler compiles the class file into bytecode.

* The JVM executes the bytecode and manages object creation at runtime.

---

# 🔹 Class and Object Practical

We will first write a simple program to add two numbers in the Demo class.
Then, we will create a separate Calculator class to handle the addition functionality.
This will make our code modular and reusable.

---

## 🔹 Simple Addition in Demo Class

```java
public class Demo {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        int result = num1 + num2;
        System.out.println(result);
    }
}
```

---

## 🔹 Creating the Calculator Class

We will create a Calculator class with an add method to handle the addition.
This will allow us to reuse the Calculator class for various addition operations.

```java
public class Calculator {

    // Method to add two numbers
    public int add(int n1, int n2) {
        System.out.println("In add method");
        int res = n1 + n2;
        return res;
    }
}
```

---

## 🔹 Accessing the Calculator Class Method in Demo Class

To use the add method from the Calculator class in the Demo class, we need to create an object of the Calculator class using the `new` keyword.

---

# 🔹 Complete Code

## Calculator Class

```java
public class Calculator {

    // Method to add two numbers
    public int add(int n1, int n2) {
        System.out.println("In add method");
        int res = n1 + n2;
        return res;
    }
}
```

## Demo Class

```java
public class Demo {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        // Creating an object of the Calculator class
        Calculator calc = new Calculator();

        // Calling the add method of Calculator class
        int result = calc.add(num1, num2);

        // Printing the result
        System.out.println("The sum is: " + result);
    }
}
```

---

# 🔹 Explanation of Code Using Steps

## 1️⃣ Define the Calculator Class

* Class Definition:

  ```java
  public class Calculator { }
  ```

* Method to Add Two Numbers:

  ```java
  public int add(int n1, int n2) {
      System.out.println("In add method");
      int res = n1 + n2;
      return res;
  }
  ```

---

## 2️⃣ Create the Demo Class

* Class Definition:

  ```java
  public class Demo { }
  ```

* Main Method:

  ```java
  public static void main(String[] args) { }
  ```

---

## 3️⃣ Initialize Variables in Main Method

```java
int num1 = 4;
int num2 = 5;
```

---

## 4️⃣ Create an Object of the Calculator Class

```java
Calculator calc = new Calculator();
```

### Explanation:

* `Calculator` is the class name.
* `calc` is a reference variable.
* `new Calculator()` creates a new object of the Calculator class.
* The JVM allocates memory and manages object creation at runtime.

---

## 5️⃣ Call the Add Method Using the Calculator Object

```java
int result = calc.add(num1, num2);
```

### Explanation:

* `calc.add(num1, num2)` calls the add method.
* The method adds the numbers.
* It prints "In add method".
* It returns the result.

---

## 6️⃣ Print the Result

```java
System.out.println("The sum is: " + result);
```

This prints the final result.

---

# 🔹 Summary

By separating the addition functionality into the Calculator class, we make our code more modular and reusable.

The Demo class creates an object of the Calculator class and calls the add method to perform the addition.

This approach follows Object-Oriented Programming principles and promotes:

* Better code organization
* Reusability
* Modularity
* Maintainability

---

# 🔑 Key Takeaway

Class = Blueprint
Object = Real implementation of that blueprint
OOP helps in organizing real-world logic into structured and reusable code.
