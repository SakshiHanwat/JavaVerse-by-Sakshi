# Introduction to Java

Java is a **high-level, object-oriented programming language** developed by **Sun Microsystems** in **1995**. It is one of the most popular and widely used programming languages in the world. Java is mainly used for building **desktop applications, web applications, Android applications, and large-scale enterprise systems**.

Java follows the principle of **Write Once, Run Anywhere (WORA)**, which means that Java code written on one platform can run on any other platform that supports the Java Virtual Machine (JVM).

---

## Features of Java

<p align="center">
  <img src="images/features_of_java" width="600">
</p>

### 1. Object-Oriented Programming (OOP)

Java supports all major OOP concepts such as **class, object, inheritance, polymorphism, abstraction, and encapsulation**. This helps developers create **modular, reusable, and maintainable code**.

### 2. Platform Independence

Java programs are **platform-independent** because they are compiled into **bytecode**, which can run on any operating system that has a JVM installed (Windows, Linux, macOS, etc.).

### 3. Robust and Secure

Java is designed to be **robust and secure**. It provides strong **memory management**, automatic **garbage collection**, **exception handling**, and avoids common programming errors like pointer misuse.

### 4. Multithreading and Concurrency

Java supports **multithreading**, which allows multiple tasks to run simultaneously within a single program. This improves performance and makes applications more efficient.

### 5. Rich API and Standard Libraries

Java offers a **rich set of APIs and standard libraries** for data structures, networking, file handling, database connectivity, and more. These libraries reduce development time.

### 6. Frameworks for Enterprise and Web Development

Java supports powerful frameworks like **Spring, Spring Boot, Hibernate, and Struts**, which simplify the development of enterprise and web applications.

### 7. Open-Source Libraries

Java has a vast ecosystem of **open-source libraries** that help developers extend functionality and build applications faster.

### 8. Maintainability and Scalability

Java’s structured and object-oriented design makes applications **easy to maintain, modify, and scale** as business requirements grow.

---

## Understanding the Hello World Program in Java

When learning any programming language, the first step is usually writing a simple program to display **"Hello World"**. This helps beginners understand the basic structure and syntax of the language.

### Java Hello World Program

```java
// A Java program to print Hello World!
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```
<p align="center">
  <img src="images/java_program.webp" width="600">
</p>

### Output

```
Hello World!
```

---

## Hello World Program Explanation

* `public class HelloWorld` → Defines a class named **HelloWorld**. In Java, every program starts with a class.
* `public static void main(String[] args)` → This is the **main method**, which is the entry point of any Java program.
* `System.out.println("Hello World!")` → Prints the text **Hello World!** on the screen.

---

## How to Run the Above Code

1. Write the code in a file named **HelloWorld.java**.
2. The **Java Compiler (javac)** compiles the source file into bytecode (**HelloWorld.class**).
3. The **Java Virtual Machine (JVM)** reads the `.class` file.
4. JVM converts the bytecode into **machine-readable binary code (0s and 1s)**.
5. The program is executed and produces the output.

---

## Java Program Execution Flow

<p align="center">
  <img src="images/Execution.webp" width="600">
</p>

1. **Source Code (.java file)** → Written by the programmer.
2. **Compilation** → `javac` converts source code into bytecode.
3. **Bytecode (.class file)** → Platform-independent intermediate code.
4. **JVM Execution** → Bytecode is converted into machine code.
5. **Output Displayed** → Program results are shown to the user.

---

## Comments in Java

Comments are notes written inside the code to explain what the code does. **Comments are not executed** when the program runs.

### Single-Line Comment

```java
// This is a comment
```

### Multi-Line Comment

```java
/*
This is a multi-line comment.
This is useful for explaining larger sections of code.
*/
```

---

## Curly Braces and Indentation in Java

In Java, **curly braces `{}`** are used to define **blocks of code**, such as the body of a class or a method. Proper **indentation** improves code readability.

### Example

```java
public class Geeks {
    public static void main(String[] args) {
        {
            System.out.println("This is inside the block.");
        }

        System.out.println("This is outside the block.");
    }
}
```

### Explanation

* The code inside `{}` runs unconditionally.
* Curly braces group multiple statements into a single block.
* Indentation helps developers understand code structure easily.

---

## Famous Applications Built Using Java

* **Android Apps** – Most Android applications are developed using Java.
* **Netflix** – Uses Java for backend services and content delivery.
* **Amazon** – Java is used for backend systems and large-scale services.
* **LinkedIn** – Java helps handle high traffic and scalability.
* **Minecraft** – One of the world’s most popular games built using Java.
* **Spotify** – Uses Java in server-side infrastructure.
* **Uber** – Java is used for backend services like trip management.
* **NASA WorldWind** – A virtual globe software built using Java.

---

## What Can We Do with Java?

Java can be used in many domains, including:

### 1. Mobile App Development

* Android app development using **Android Studio**.

### 2. Web Development

* Building web applications using frameworks like **Spring, Spring Boot, Struts, and Hibernate**.

### 3. Desktop GUI Applications

* Creating graphical user interface applications using **JavaFX** and **Swing**.

### 4. Enterprise Applications

* Used in banking systems, ERP software, and large-scale business applications.

### 5. Game Development

* Game development using engines like **LibGDX** and **jMonkeyEngine**.

### 6. Big Data Technologies

* Java is used in big data tools like **Hadoop** and **Apache Kafka**.

### 7. Internet of Things (IoT)

* Java can run on embedded systems and IoT devices.

### 8. Cloud-Based Applications

* Java is widely used in cloud services on **AWS, Microsoft Azure, and Google Cloud**.

### 9. Scientific Applications

* Java is used in applications that process and analyze large amounts of scientific data.

---

## Conclusion

Java is a powerful, secure, and versatile programming language. Due to its platform independence, rich libraries, and strong community support, Java remains one of the top choices for beginners as well as professional developers.
