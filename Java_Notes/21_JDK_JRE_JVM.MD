# 📘 JDK, JRE, and JVM – Complete Guide

---

# 🔹 Introduction

Understanding the Java Development Kit (JDK), Java Runtime Environment (JRE), and Java Virtual Machine (JVM) is crucial for Java development.

These three components work together to develop, compile, and run Java applications.

---

# 🔹 1️⃣ Java Development Kit (JDK)

## 📌 Definition

The JDK is a software development environment used for developing Java applications and applets.

It is a comprehensive package containing tools necessary for Java development.

---

## 🔹 Components of JDK

* **JRE (Java Runtime Environment)** – Provides the libraries and components needed to run Java applications.
* **JVM (Java Virtual Machine)** – Executes Java bytecode.
* **Development Tools**, including:

  * `java` (Launcher) – Runs Java applications
  * `javac` (Compiler) – Compiles Java source code into bytecode
  * `jar` (Archiver) – Packages files into JAR format
  * `javadoc` – Generates documentation
  * Debugging and other development tools

---

## 🎯 Purpose of JDK

The JDK is required to:

* Write Java programs
* Compile Java programs
* Debug Java programs
* Run Java applications

👉 Without JDK, you cannot develop Java applications.

---

# 🔹 2️⃣ Java Runtime Environment (JRE)

## 📌 Definition

The JRE is a set of software tools for running Java applications.

It includes the JVM and other components that support the execution of Java programs.

---

## 🔹 Components of JRE

* **JVM** – The engine that executes Java bytecode.
* **Libraries** – A set of class libraries and other runtime files required for execution.

---

## 🎯 Purpose of JRE

The JRE provides the necessary environment to run Java applications by offering:

* Required libraries
* Supporting files
* Runtime components

👉 Without JRE, you cannot run Java applications.

---

# 🔹 3️⃣ Java Virtual Machine (JVM)

## 📌 Definition

The JVM is an abstract machine that provides a runtime environment in which Java bytecode can be executed.

It is called a virtual machine because it does not physically exist as hardware but is implemented in software.

---

## 🔹 Key Functions of JVM

* **Class Loader** – Loads class files into memory.
* **Bytecode Verifier** – Ensures bytecode is valid and follows security rules.
* **Interpreter** – Converts bytecode into machine code line by line.
* **Just-In-Time (JIT) Compiler** – Improves performance by compiling bytecode into native machine code at runtime.

---

## 🎯 Purpose of JVM

* Executes Java bytecode.
* Enables platform independence (Write Once, Run Anywhere).
* Can also run programs written in other languages compiled into Java bytecode.

---

# 🔹 Relationship between JDK, JRE, and JVM

## 📊 Layered Structure

* **JDK** – Topmost layer

  * Contains JRE
  * Contains Development Tools

* **JRE** – Inside JDK

  * Contains JVM
  * Contains Runtime Libraries

* **JVM** – Inside JRE

  * Executes Java bytecode

---

# 🔑 Final Summary

* JDK = Development Kit (Write + Compile + Run)
* JRE = Runtime Environment (Run only)
* JVM = Engine that executes bytecode

👉 JDK ⊃ JRE ⊃ JVM

This layered architecture makes Java platform-independent and powerful for enterprise development.
