# 📘 Java Do-While Loop – Complete Guide

## 📌 Introduction

A do-while loop is an exit-controlled control flow structure in programming. It ensures that a block of code is executed at least once and then continues to execute the block as long as a specified condition remains true.

The key feature of a do-while loop is that the condition is evaluated after the code block, guaranteeing at least one execution, even if the condition is initially false.

---

# 🔹 Syntax of Do-While Loop

```java
do {
    // code block to be executed
} while (condition);
```

### 📝 Working:

* The code block inside the `do` section is executed first.
* After execution, the condition inside the `while` statement is evaluated.
* If the condition evaluates to **true**, the loop executes again.
* If the condition evaluates to **false**, the loop terminates.

---

# 🔹 Example: Do-While Loop Usage

This example ensures that a message is printed at least once, regardless of the condition.

## ✅ Example Code:

```java
public class Main {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 4);
    }
}
```

---

## 🔍 Explanation of the Example

* The variable `i` is initialized to 1.
* The `do` block prints the value of `i`.
* After printing, `i` is incremented by 1.
* The loop continues while `i <= 4`.
* As a result, numbers from **1 to 4** are printed.
* Even if `i` was initially greater than 4, the message would still print once because the condition is checked after executing the code block.

---

# 🔹 Differences Between While and Do-While Loops

## 1️⃣ Execution Guarantee

* The **do-while loop guarantees** that the code block executes at least once.
* The **while loop may not execute at all** if the condition is false initially.

## 2️⃣ Condition Check

* In a **while loop**, the condition is checked before the loop body.
* In a **do-while loop**, the condition is checked after the loop body.

---

# 🔑 Key Points

* Do-while is an **exit-controlled loop**.
* It always executes the code block at least once.
* Best used when at least one execution is required (e.g., menu-driven programs, user input validation).
* Condition is evaluated after the loop body execution.
