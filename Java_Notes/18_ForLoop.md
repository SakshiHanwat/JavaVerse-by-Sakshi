# 📘 Java For Loop – Complete Guide

## 📌 Introduction

A for loop is a control flow structure in programming that iterates over a sequence of elements, such as a range of numbers, items in a list, or characters in a string.

It is an entry-controlled loop, meaning it determines the number of iterations before entering the loop.

The for loop provides a concise way of writing the loop control structure in a single line, unlike other loops where initialization, condition, and increment/decrement steps are specified separately.

---

# 🔹 Syntax of For Loop

```java
for (initialization; condition; update) {
    // code block to be executed
}
```

## 🔎 Explanation of Components

* **Initialization**: This step sets the starting value of the loop control variable.
* **Condition**: This is the test condition that must be true for the loop to continue executing.
* **Update**: This modifies the loop control variable after each iteration.

---

# 🔹 Example and Output

## ✅ Code Example:

```java
public class Hello {
    public static void main(String[] args) {

        // Example 1: Printing "Hi" with indices
        for (int i = 0; i <= 4; i++) {
            System.out.println("Hi " + i);
        }

        // Example 2: Nested for loops to display days and working hours
        for (int i = 1; i <= 7; i++) {
            System.out.println("Day " + i);

            for (int j = 1; j <= 9; j++) {
                System.out.println(" " + (j + 8) + " - " + (j + 9));
            }
        }

        // Example 3: For loop with initialization outside the loop
        int i = 1;
        for (; i <= 5;) {
            System.out.println("DAY " + i);
            i++;
        }
    }
}
```

---

# 🔹 Explanation of Examples

## 1️⃣ Example 1

* The loop starts from `i = 0`.
* It runs while `i <= 4`.
* After each iteration, `i++` increases the value of `i`.
* Output: Hi 0 to Hi 4.

## 2️⃣ Example 2 (Nested Loop)

* The outer loop runs from Day 1 to Day 7.
* The inner loop runs 9 times for each day.
* This demonstrates how nested loops work.
* Used in real scenarios like timetable, matrix operations, pattern printing.

## 3️⃣ Example 3

* Initialization is done outside the loop.
* Condition and update are handled inside.
* Shows flexibility of the for loop.

---

# 🔑 Key Points

* For loop is an **entry-controlled loop**.
* Condition is checked before execution.
* Best used when the number of iterations is known.
* Supports nested loops.
* Initialization, condition, and update can be customized or even left empty if handled manually.
