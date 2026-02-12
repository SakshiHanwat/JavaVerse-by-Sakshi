# 06 - Method Overloading in Java

## Introduction

### Definition

Method Overloading in Java allows multiple methods to have the same name but different method signatures within the same class.

A method signature can differ by:

* Number of parameters
* Type of parameters
* Order of parameters
* Combination of number and type

Method Overloading is also known as:

* Compile-Time Polymorphism
* Static Polymorphism
* Early Binding

During compilation, Java selects the most specific matching method.

---

## Basic Example

```
class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int result = obj.add(2, 5);
        System.out.println(result); // Output: 7
    }
}
```

---

## Why Method Overloading is Needed

If requirements change (for example, adding three numbers instead of two), we would normally need to:

* Modify the existing method
  OR
* Create a new method with a different name

Method overloading solves this by allowing multiple methods with the same name but different parameters.

---

## Example with Multiple Overloaded Methods

```
class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2) {
        return n1 + n2;
    }
}
```

---

# Ways to Achieve Method Overloading

## 1. Changing Number of Parameters

```
public int add(int n1, int n2) {
    return n1 + n2;
}

public int add(int n1, int n2, int n3) {
    return n1 + n2 + n3;
}
```

---

## 2. Changing Data Types of Parameters

```
public int add(int n1, int n2) {
    return n1 + n2;
}

public double add(double n1, double n2) {
    return n1 + n2;
}
```

---

## 3. Changing Order of Parameters

```
public void display(String name, int rollNo) {
    System.out.println("Name: " + name + ", Roll No: " + rollNo);
}

public void display(int rollNo, String name) {
    System.out.println("Roll No: " + rollNo + ", Name: " + name);
}
```

---

# Important Rules

* Method name must be same
* Parameters must be different
* Return type alone cannot overload a method

Example (Invalid Overloading):

```
public int add(int a, int b) {
    return a + b;
}

public double add(int a, int b) {
    return a + b;
}
```

This will cause a compilation error because only return type is different.

---

# Advantages of Method Overloading

* Improved Readability
* Code Reusability
* Reduced Complexity
* Better Program Structure
* Flexible Object Initialization (Constructor Overloading)

---

# Quick Summary

* Same method name
* Different parameters
* Happens at compile time
* Also called Static Polymorphism
* Return type alone is not enough

---

End of Document – Method Overloading in Java
