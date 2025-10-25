
# Introduction to Java ☕

## What is Java?
- Java is a **high-level, object-oriented, platform-independent programming language**.
- Developed by **Sun Microsystems (James Gosling, 1995)**.
- **Write Once, Run Anywhere (WORA)** – Java code runs on all platforms that support JVM.

---

## JDK, JRE, JVM

### 🔹 JVM (Java Virtual Machine)
- It is the engine that runs Java bytecode.
- Converts **bytecode (.class files)** into machine code.
- Provides platform independence.
- Part of JRE.

### 🔹 JRE (Java Runtime Environment)
- Contains JVM + Libraries.
- Provides environment to **run Java programs**.
- Does NOT contain development tools (like compiler).

### 🔹 JDK (Java Development Kit)
- Contains JRE + Development tools (compiler, debugger, etc.).
- Used by developers to **write, compile, and run Java programs**.

---

## Java Program Flow 🚦

1. **Write Code** → `.java` file (e.g., `Main.java`)
2. **Compile** → `javac Main.java` → generates `.class` file (Bytecode)
3. **Execute** → JVM loads `.class` file → converts bytecode → machine code
4. Runs on OS + Hardware via JVM.

---

## Components in Execution

- **Source Code (.java)** → written by developer.
- **Compiler (javac)** → converts `.java` → `.class` (bytecode).
- **Bytecode (.class)** → platform-independent instructions.
- **JVM** → executes bytecode on any OS.
- **OS + Hardware** → actual execution layer.

---
Example: Hello World
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}

🔹 Flow for this Program:

Developer writes Main.java.

Run → javac Main.java → generates Main.class.

Run → java Main → JVM loads Main.class.

JVM executes → Calls main() method.

Output on Console →

Hello, Java!
---
# 📘 Variables in Java

---

## 🔹 What Happens Behind the Scenes
- As a Java developer, you **write code** with a `.java` extension.  
- The code is compiled by **`javac` (Java Compiler)** → generates **Bytecode** (`.class` file).  
- Bytecode is run inside the **JVM** (Java Virtual Machine), which is part of **JRE**.  
- **JRE** = JVM + Built-in Libraries.  
- JRE runs on top of the **Operating System (OS)**.  
- Developers install **JDK** (Java Development Kit), which provides:
  - Compiler (`javac`)
  - Updated JRE + JVM  
- Current LTS version: **JDK 17** (but concept remains the same even in future versions).  

---

## 🔹 Why Do We Build Software?
- To **solve real-world problems** with virtual solutions.  
- Examples:
  - **Amazon** → Online shopping  
  - **Uber** → Cab booking  
  - **Online Banking** → Money transfers  
- The most important thing in software is **DATA**.

---

## 🔹 Working with Data
- Applications **accept data from the user**, process it, and may store it.  
- **Storage Types**:
  - **Permanent Storage** → Database (data remains even after shutdown).  
  - **Temporary Storage** → **Variables** (data exists while program runs).  

---

Syntax of a Variable
type variableName = value;

Type → defines what data can be stored.

Variable Name → identifier chosen by programmer.

= (Assignment Operator) → assigns value (RHS → LHS).

; (Semicolon) → ends the statement.

📌 Example:

int num = 3;

int → type.

num → variable name.

3 → value.

🔹 Printing Variables

System.out.print() → prints without newline.

System.out.println() → prints with newline.

Example:

System.out.println(num);

🔹 Using Variables in Expressions

Variables can be used in operations.

Example 1: Direct addition in print statement:

System.out.println(3 + 5); // Output: 8

Example 2: Using variables:

int num1 = 3;
int num2 = 5;
System.out.println(num1 + num2); // Output: 8

Example 3: Storing result in another variable:

int num1 = 3;
int num2 = 5;
int result = num1 + num2;
System.out.println(result); // Output: 8
