# Arithmetic Operators in Java

## Introduction to Operators

Operators are symbols that perform specific operations on one or more operands. They are fundamental building blocks in programming that allow you to manipulate data and perform calculations.

Think of operators as the mathematical symbols you learned in school, but with additional capabilities:
- They work on variables and values (called operands)
- They produce results that can be stored or used
- They make your code dynamic and interactive

**What are Operands?**

Operands are the values or variables that operators work on. For example, in the expression `5 + 3`:
- `+` is the operator
- `5` and `3` are the operands

## Types of Arithmetic Operators in Java

Java provides several arithmetic operators for performing mathematical calculations:

1. **Addition (+)**: Adds two operands
2. **Subtraction (-)**: Subtracts the second operand from the first
3. **Multiplication (*)**: Multiplies two operands
4. **Division (/)**: Divides the first operand by the second
5. **Modulus (%)**: Returns the remainder after division
6. **Increment (++)**: Increases a value by 1
7. **Decrement (--)**: Decreases a value by 1

Let's explore each operator in detail.

## Basic Arithmetic Operators

### 1. Addition Operator (+)

The addition operator adds two operands together.

**Syntax:**
```java
result = operand1 + operand2;
```

**Example:**
```java
int num1 = 7;
int num2 = 5;

int res = num1 + num2;
System.out.println(res);  // Output: 12
```

**Explanation:**
- `num1` has the value 7
- `num2` has the value 5
- `num1 + num2` performs addition: 7 + 5 = 12
- The result (12) is stored in `res`

**More Examples:**
```java
int a = 100;
int b = 50;
int sum = a + b;
System.out.println(sum);  // Output: 150

double x = 10.5;
double y = 5.3;
double total = x + y;
System.out.println(total);  // Output: 15.8
```

### 2. Subtraction Operator (-)

The subtraction operator subtracts the second operand from the first.

**Syntax:**
```java
result = operand1 - operand2;
```

**Example:**
```java
int num1 = 7;
int num2 = 5;

int res = num1 - num2;
System.out.println(res);  // Output: 2
```

**Explanation:**
- `num1 - num2` performs subtraction: 7 - 5 = 2
- The result (2) is stored in `res`

**More Examples:**
```java
int balance = 1000;
int expense = 250;
int remaining = balance - expense;
System.out.println(remaining);  // Output: 750

double price = 99.99;
double discount = 19.99;
double finalPrice = price - discount;
System.out.println(finalPrice);  // Output: 80.0
```

### 3. Multiplication Operator (*)

The multiplication operator multiplies two operands.

**Syntax:**
```java
result = operand1 * operand2;
```

**Example:**
```java
int num1 = 7;
int num2 = 5;

int res = num1 * num2;
System.out.println(res);  // Output: 35
```

**Explanation:**
- `num1 * num2` performs multiplication: 7 × 5 = 35
- The result (35) is stored in `res`

**More Examples:**
```java
int quantity = 10;
int pricePerItem = 25;
int totalCost = quantity * pricePerItem;
System.out.println(totalCost);  // Output: 250

double length = 5.5;
double width = 3.0;
double area = length * width;
System.out.println(area);  // Output: 16.5
```

### 4. Division Operator (/)

The division operator divides the first operand by the second, giving the quotient.

**Syntax:**
```java
result = operand1 / operand2;
```

**Example:**
```java
int num1 = 10;
int num2 = 5;

int res = num1 / num2;
System.out.println(res);  // Output: 2
```

**Explanation:**
- `num1 / num2` performs division: 10 ÷ 5 = 2
- The result (2) is stored in `res`

**Important: Integer Division**

When both operands are integers, the result is also an integer (decimal part is discarded):

```java
int a = 7;
int b = 2;

int result = a / b;
System.out.println(result);  // Output: 3 (not 3.5!)
```

**Why?** Because both `a` and `b` are integers, Java performs integer division and truncates the decimal part.

**To Get Decimal Results:**

Use at least one floating-point operand:

```java
double a = 7.0;
int b = 2;

double result = a / b;
System.out.println(result);  // Output: 3.5

// OR
int a = 7;
int b = 2;
double result = (double) a / b;
System.out.println(result);  // Output: 3.5
```

**Division by Zero:**

Dividing by zero will cause an error:

```java
int a = 10;
int b = 0;
int result = a / b;  // Runtime Error: ArithmeticException (/ by zero)
```

### 5. Modulus Operator (%)

The modulus operator returns the remainder after division. This is extremely useful for checking divisibility, finding patterns, and many other scenarios.

**Syntax:**
```java
result = operand1 % operand2;
```

**Example:**
```java
int num1 = 26;
int num2 = 5;

int res = num1 % num2;
System.out.println(res);  // Output: 1
```

**Explanation:**
- 26 divided by 5 equals 5 with a remainder of 1
- 5 × 5 = 25 (the largest multiple of 5 that doesn't exceed 26)
- 26 - 25 = 1 (the remainder)
- So, `26 % 5 = 1`

**Visual Breakdown:**
```
26 ÷ 5 = 5 remainder 1
   ↓
5 × 5 = 25
26 - 25 = 1  ← This is the result of 26 % 5
```

**More Examples:**

```java
// Example 1: Even or Odd
int number = 7;
int remainder = number % 2;
System.out.println(remainder);  // Output: 1 (odd number)

int number = 8;
int remainder = number % 2;
System.out.println(remainder);  // Output: 0 (even number)

// Example 2: Finding last digit
int num = 12345;
int lastDigit = num % 10;
System.out.println(lastDigit);  // Output: 5

// Example 3: Circular patterns
int day = 8;
int dayOfWeek = day % 7;  // Days cycle every 7 days
System.out.println(dayOfWeek);  // Output: 1
```

**Common Use Cases for Modulus:**

1. **Checking if a number is even or odd:**
   ```java
   if (num % 2 == 0) {
       System.out.println("Even");
   } else {
       System.out.println("Odd");
   }
   ```

2. **Checking divisibility:**
   ```java
   if (num % 3 == 0) {
       System.out.println("Divisible by 3");
   }
   ```

3. **Cycling through values:**
   ```java
   int index = count % arrayLength;  // Keeps index within array bounds
   ```

4. **Extracting digits:**
   ```java
   int lastDigit = number % 10;
   ```

## Compound Assignment Operators

Compound assignment operators combine an arithmetic operation with assignment, making code more concise.

### Available Compound Operators

| Operator | Example | Equivalent To | Meaning |
|----------|---------|---------------|---------|
| `+=` | `a += 5` | `a = a + 5` | Add and assign |
| `-=` | `a -= 5` | `a = a - 5` | Subtract and assign |
| `*=` | `a *= 5` | `a = a * 5` | Multiply and assign |
| `/=` | `a /= 5` | `a = a / 5` | Divide and assign |
| `%=` | `a %= 5` | `a = a % 5` | Modulus and assign |

### Examples of Compound Assignment

**Addition Assignment (+=):**
```java
int num1 = 7;
num1 += 2;  // Equivalent to: num1 = num1 + 2;
System.out.println(num1);  // Output: 9
```

**Step-by-step:**
1. `num1` starts with value 7
2. `num1 += 2` means "add 2 to num1 and store the result back in num1"
3. 7 + 2 = 9
4. `num1` now contains 9

**Subtraction Assignment (-=):**
```java
int num2 = 16;
num2 -= 4;  // Equivalent to: num2 = num2 - 4;
System.out.println(num2);  // Output: 12
```

**Step-by-step:**
1. `num2` starts with value 16
2. `num2 -= 4` means "subtract 4 from num2 and store the result back in num2"
3. 16 - 4 = 12
4. `num2` now contains 12

**Multiplication Assignment (*=):**
```java
int num3 = 5;
num3 *= 3;  // Equivalent to: num3 = num3 * 3;
System.out.println(num3);  // Output: 15
```

**Division Assignment (/=):**
```java
int num4 = 20;
num4 /= 4;  // Equivalent to: num4 = num4 / 4;
System.out.println(num4);  // Output: 5
```

**Modulus Assignment (%=):**
```java
int num5 = 17;
num5 %= 5;  // Equivalent to: num5 = num5 % 5;
System.out.println(num5);  // Output: 2
```

**Why Use Compound Operators?**

1. **Concise Code:** Less typing, cleaner code
2. **Readability:** Intent is clear at a glance
3. **Common Pattern:** Frequently used in loops and calculations

**Comparison:**
```java
// Without compound operator (verbose)
total = total + price;
count = count + 1;
balance = balance - withdrawal;

// With compound operator (concise)
total += price;
count += 1;
balance -= withdrawal;
```

## Increment and Decrement Operators

The increment (`++`) and decrement (`--`) operators are special operators that increase or decrease a value by exactly 1. These operators are extremely common in loops and counting operations.

### Key Characteristic

**Important:** These operators always change the value by exactly 1.

```java
int count = 5;
count++;  // count becomes 6
count--;  // count becomes 5 again
```

### Two Forms: Pre and Post

Both increment and decrement operators can be used in two forms:
1. **Prefix form (Pre):** `++x` or `--x`
2. **Postfix form (Post):** `x++` or `x--`

The difference lies in **when** the increment/decrement happens relative to using the value.

## Pre-Increment (++x)

**Syntax:** `++variable`

**Behavior:** The value is incremented **first**, then used in the expression.

**Example:**
```java
int x = 5;
int y = ++x;  // Pre-increment: x is incremented first, then assigned to y

System.out.println("x = " + x);  // Output: x = 6
System.out.println("y = " + y);  // Output: y = 6
```

**Step-by-step execution:**
1. `x` starts with value 5
2. `++x` increments `x` first: `x` becomes 6
3. The new value of `x` (which is 6) is assigned to `y`
4. Result: both `x` and `y` are 6

**Output from the image code:**
```
After pre-increment: x = 6, y = 6
```

## Post-Increment (x++)

**Syntax:** `variable++`

**Behavior:** The current value is used **first**, then the variable is incremented.

**Example:**
```java
int x = 5;
int y = x++;  // Post-increment: x's current value is assigned to y, then x is incremented

System.out.println("x = " + x);  // Output: x = 6
System.out.println("y = " + y);  // Output: y = 5
```

**Step-by-step execution:**
1. `x` starts with value 5
2. `x++` assigns the current value of `x` (5) to `y` first
3. After assignment, `x` is incremented: `x` becomes 6
4. Result: `y` is 5, `x` is 6

## Pre-Decrement (--x)

**Syntax:** `--variable`

**Behavior:** The value is decremented **first**, then used in the expression.

**Example:**
```java
int x = 5;
int w = --x;  // Pre-decrement: x is decremented first, then assigned to w

System.out.println("x = " + x);  // Output: x = 4
System.out.println("w = " + w);  // Output: w = 4
```

**Step-by-step execution:**
1. `x` starts with value 5
2. `--x` decrements `x` first: `x` becomes 4
3. The new value of `x` (which is 4) is assigned to `w`
4. Result: both `x` and `w` are 4

**Output from the image code:**
```
After pre-decrement: x = 4, w = 4
```

## Post-Decrement (x--)

**Syntax:** `variable--`

**Behavior:** The current value is used **first**, then the variable is decremented.

**Example:**
```java
int x = 5;
int z = x--;  // Post-decrement: x's current value is assigned to z, then x is decremented

System.out.println("x = " + x);  // Output: x = 4
System.out.println("z = " + z);  // Output: z = 5
```

**Step-by-step execution:**
1. `x` starts with value 5
2. `x--` assigns the current value of `x` (5) to `z` first
3. After assignment, `x` is decremented: `x` becomes 4
4. Result: `z` is 5, `x` is 4

**Output from the image code:**
```
After post-decrement: x = 5, z = 6
```

*Note: The output in the image shows `z = 6` because `x` was 6 before the post-decrement operation.*

## Complete Example from Image

Let's trace through the complete code from your image:

```java
public class IncrementDecrementExample {
    public static void main(String[] args) {
        int x = 5;
        int y = ++x;  // Pre-increment: x is incremented first, then assigned to y
        System.out.println("After pre-increment: x = " + x + ", y = " + y);
        
        int z = x--;  // Post-decrement: x is assigned to z, then decremented
        System.out.println("After post-decrement: x = " + x + ", z = " + z);
        
        int w = --x;  // Pre-decrement: x is decremented first, then assigned to w
        System.out.println("After pre-decrement: x = " + x + ", w = " + w);
    }
}
```

**Execution Trace:**

**Line 1: `int x = 5;`**
- `x = 5`

**Line 2: `int y = ++x;`**
- Pre-increment: `x` is incremented first
- `x` becomes 6
- Then `y` is assigned the value of `x`
- `y = 6`
- **Result:** `x = 6`, `y = 6`

**Output:** `After pre-increment: x = 6, y = 6`

**Line 3: `int z = x--;`**
- Post-decrement: Current value of `x` is assigned to `z` first
- `z = 6` (current value of `x`)
- Then `x` is decremented
- `x` becomes 5
- **Result:** `x = 5`, `z = 6`

**Output:** `After post-decrement: x = 5, z = 6`

**Line 4: `int w = --x;`**
- Pre-decrement: `x` is decremented first
- `x` becomes 4
- Then `w` is assigned the value of `x`
- `w = 4`
- **Result:** `x = 4`, `w = 4`

**Output:** `After pre-decrement: x = 4, w = 4`

## Key Differences: Pre vs Post

| Aspect | Pre-increment (++x) | Post-increment (x++) |
|--------|---------------------|----------------------|
| **Order** | Increment first, then use | Use first, then increment |
| **Value returned** | New (incremented) value | Original value |
| **When to use** | Need the new value immediately | Need the old value, but want to increment |
| **Example** | `y = ++x` (y gets new x) | `y = x++` (y gets old x) |

| Aspect | Pre-decrement (--x) | Post-decrement (x--) |
|--------|---------------------|----------------------|
| **Order** | Decrement first, then use | Use first, then decrement |
| **Value returned** | New (decremented) value | Original value |
| **When to use** | Need the new value immediately | Need the old value, but want to decrement |
| **Example** | `y = --x` (y gets new x) | `y = x--` (y gets old x) |

## When to Use Each Form

### Use Pre-Increment/Decrement When:
- You need the new value immediately
- The order of operations matters
- You want to increment/decrement before using the value

```java
int count = 0;
System.out.println(++count);  // Prints: 1 (count is incremented to 1, then printed)
```

### Use Post-Increment/Decrement When:
- You need the current value first
- You want to increment/decrement after using the value
- Common in loops where the increment happens at the end

```java
int count = 0;
System.out.println(count++);  // Prints: 0 (current value is printed, then count becomes 1)
System.out.println(count);    // Prints: 1
```

### In Standalone Statements (No Difference):

When used alone (not in an expression), both forms do the same thing:

```java
int count = 5;
count++;     // count becomes 6
++count;     // count becomes 7
// Both have the same effect when used alone
```

## Common Use Cases

### 1. Loop Counters

```java
// Post-increment is most common in for loops
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}

// Pre-increment works the same way in this context
for (int i = 0; i < 10; ++i) {
    System.out.println(i);
}
```

### 2. Array Indexing

```java
int index = 0;
array[index++] = value;  // Use current index, then increment for next time
```

### 3. Counting Operations

```java
int attempts = 0;
while (attempts++ < 3) {
    // Try something (attempts increments after each check)
}
```

## Practice Examples

**Example 1: Understanding the Difference**
```java
int a = 10;
int b = 10;

int result1 = ++a;  // a becomes 11, result1 = 11
int result2 = b++;  // result2 = 10, then b becomes 11

System.out.println("a = " + a);          // Output: 11
System.out.println("result1 = " + result1);  // Output: 11
System.out.println("b = " + b);          // Output: 11
System.out.println("result2 = " + result2);  // Output: 10
```

**Example 2: In Expressions**
```java
int x = 5;
int result = x++ + ++x;

// Step-by-step:
// x++ uses 5, then x becomes 6
// ++x increments x to 7, then uses 7
// result = 5 + 7 = 12
// Final: x = 7, result = 12

System.out.println("x = " + x);        // Output: 7
System.out.println("result = " + result);  // Output: 12
```

**Example 3: Multiple Operations**
```java
int num = 10;

System.out.println(num++);  // Prints: 10, then num becomes 11
System.out.println(++num);  // num becomes 12, then prints: 12
System.out.println(num--);  // Prints: 12, then num becomes 11
System.out.println(--num);  // num becomes 10, then prints: 10
```

## Summary: Arithmetic Operators Quick Reference

| Operator | Name | Example | Result |
|----------|------|---------|--------|
| `+` | Addition | `7 + 5` | `12` |
| `-` | Subtraction | `7 - 5` | `2` |
| `*` | Multiplication | `7 * 5` | `35` |
| `/` | Division | `10 / 5` | `2` |
| `%` | Modulus | `26 % 5` | `1` |
| `+=` | Add and assign | `a += 2` | `a = a + 2` |
| `-=` | Subtract and assign | `a -= 2` | `a = a - 2` |
| `*=` | Multiply and assign | `a *= 2` | `a = a * 2` |
| `/=` | Divide and assign | `a /= 2` | `a = a / 2` |
| `%=` | Modulus and assign | `a %= 2` | `a = a % 2` |
| `++x` | Pre-increment | `++x` | Increment first, then use |
| `x++` | Post-increment | `x++` | Use first, then increment |
| `--x` | Pre-decrement | `--x` | Decrement first, then use |
| `x--` | Post-decrement | `x--` | Use first, then decrement |

## Key Takeaways

1. **Basic Operators:** `+`, `-`, `*`, `/`, `%` perform arithmetic operations
2. **Modulus:** Returns remainder, useful for checking divisibility and patterns
3. **Integer Division:** When dividing integers, the result is truncated (no decimal)
4. **Compound Operators:** Combine operation with assignment (`+=`, `-=`, etc.)
5. **Increment/Decrement:** Always change value by exactly 1
6. **Pre vs Post:** Pre changes first then uses; Post uses first then changes
7. **Standalone Use:** No difference between pre and post when used alone
8. **Common in Loops:** Increment operators are frequently used in loop counters

Understanding arithmetic operators is essential because:
- They are used in almost every program
- They form the basis of calculations and logic
- Mastering pre/post increment prevents common bugs
- They make code more concise and readable

---

*Practice these operators to build a strong foundation in Java programming!*