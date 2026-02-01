# Fundamentals of Programming
**Source:** Telusko — Lesson 4.2 | **Instructor:** Navin Reddy

---

## 1. What is a Computer?

A computer is a machine that was made to reduce human workload. Humans give instructions to the computer and the computer completes those tasks. The computer does all this very fast and accurately, but it can only understand instructions in a specific way — using 0s and 1s.

---

## 2. CPU — The Brain of the Computer

The CPU (Central Processing Unit) is called the brain of the computer. It is the part that understands and executes all instructions.

The CPU is made using **semiconductor technology**. Inside the CPU there are billions of tiny components called **transistors**. These transistors are of two types:

- **NPN (Negative-Positive-Negative)**
- **PNP (Positive-Negative-Positive)**

A transistor has only two states:

- **High Voltage** → represented as **1**
- **Low Voltage** → represented as **0**

So the CPU only understands **0 and 1**. This is the most basic and important thing to understand about how a computer works.

---

## 3. Machine Level Language (MLL)

Since the CPU only understands 0 and 1, the first language used to write programs was called **Machine Level Language (MLL)**. Every instruction is written as a sequence of 0s and 1s (binary).

**Example of MLL instructions:**

| Operation | Binary Code |
|-----------|-------------|
| ADD       | 01010       |
| SUB       | 10101       |
| MUL       | 00101       |
| DIV       | 11101       |

**Problem with MLL:**
Writing even a small program like a calculator requires hundreds of lines of 0s and 1s. It is very difficult to write, very difficult to read, and very difficult to find and fix errors (debugging). So humans needed an easier way to talk to the computer.

---

## 4. Assembly Level Language (ALL)

To make programming easier, **Assembly Level Language** was introduced. Instead of writing long binary codes, programmers could use short meaningful words called **mnemonics**.

**Example of Assembly instructions:**

| Mnemonic | Meaning        |
|----------|----------------|
| ADD      | Addition       |
| SUB      | Subtraction    |
| MUL      | Multiplication |
| DIV      | Division       |

This was much easier to understand and write compared to machine level language.

**But there is a problem:** The CPU still only understands 0 and 1. It does not understand ADD, SUB, etc. So a special program called the **Assembler** was created.

### What is an Assembler?

The Assembler is a program that **converts Assembly Level Language into Machine Level Language (binary)**. So the programmer writes in Assembly, the Assembler translates it into 0s and 1s, and then the CPU can understand and execute it.

**Problem with Assembly:**
Assembly was easier than MLL, but it was still quite complex. Also, Assembly language is specific to a particular CPU. A program written for one type of CPU will not work on another. So it was not practical for building big, modern applications.

---

## 5. High Level Language (HLL)

Around **1960**, the biggest change in programming happened. **High Level Languages** were introduced. These languages use **English-like words and symbols** that are very easy for humans to read and write.

**Example of HLL syntax:**

- `print("Hello World")` — to print something on screen
- `scan` — to take input from the user
- `if / else` — to make decisions
- `+  −  *  /` — for math operations

**Popular High Level Languages:**

- C
- C++
- Java
- Python
- JavaScript
- C#

### What is a Compiler?

The CPU still only understands 0 and 1. It does not understand English words. So a program called the **Compiler** was created.

The Compiler **converts the entire High Level Language code into Machine Level Language (binary)** so that the CPU can read and execute it.

---

## 6. The Full Translation Flow

Here is how your code goes from what you write to what the CPU actually runs:

```
You write code in High Level Language (e.g., Python, Java, C++)
        |
        v
   Compiler converts HLL → Machine Level Language
        |
        v
   (In some cases, Assembly Language is an intermediate step)
        |
        v
   Assembler converts Assembly → Binary (0s and 1s)
        |
        v
   CPU reads the binary and executes the program
```

---

## 7. Comparison of All Three Languages

| Feature                | Machine Level (MLL) | Assembly (ALL)        | High Level (HLL)      |
|------------------------|---------------------|-----------------------|-----------------------|
| What it looks like     | 01010 10101         | ADD, SUB, MUL         | print(), if/else      |
| Easy to read?          | No                  | Somewhat              | Yes                   |
| CPU understands it?    | Yes                 | No                    | No                    |
| Translator needed?     | None                | Assembler             | Compiler              |
| Easy to debug?         | No                  | Difficult             | Yes                   |
| Works on all CPUs?     | No                  | No                    | Yes (Portable)        |
| Examples               | Binary sequences    | x86 Assembly          | C++, Java, Python     |

---

## 8. Timeline — How Programming Languages Evolved

**1940s–1950s — Machine Level Language**
The first computers were programmed using only binary (0s and 1s). It was very hard and very slow to write programs this way.

**1950s — Assembly Language**
Assembly language was introduced with mnemonics like ADD, SUB. The Assembler was created to translate these into binary. This made programming faster and a little easier.

**~1960 — High Level Languages**
Languages like FORTRAN and COBOL came out. Compilers were built to translate human-friendly code into machine code. Programming became much more accessible.

**1970s–Present — Modern Languages**
Languages like C, C++, Java, Python, JavaScript and many more were developed. These are all high level languages. No matter which language you use, the compiler always converts your code into 0s and 1s in the end, because that is the only thing the CPU understands.

---

## Key Takeaway

No matter how complex a program is — whether it is a simple calculator or a full operating system — at the end of the day, everything runs as **0s and 1s** inside the CPU. High Level Languages, Compilers, and Assemblers are all tools that were created to make it easier for humans to communicate with the computer.
