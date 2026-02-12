# If-Else Statement in Java

## Introduction to Conditional Statements

Conditional statements in programming are essential for controlling the flow of a program based on specific conditions. They are the foundation of decision-making in programming, allowing your code to respond differently to different situations.

**What Are Conditional Statements?**

Conditional statements enable the execution of different blocks of code depending on whether a given condition evaluates to `true` or `false`. They allow your program to:
- Make decisions
- Choose between different paths
- Respond to different inputs
- Adapt to changing situations

This mechanism is fundamental for decision-making in algorithms and real-world applications.

## Why Are Conditional Statements Important?

Without conditional statements, programs would execute the same way every time, regardless of input or circumstances. Conditional statements give programs intelligence and flexibility.

**Think About It:**
- A login system needs to check if the password is correct
- A calculator needs to prevent division by zero
- A game needs to check if the player has won
- An ATM needs to verify if you have sufficient balance

All of these scenarios require conditional statements to make decisions.

## Real-World Example: Automatic Car

Consider an automatic car or vehicle that adjusts its behavior based on road conditions. This is a perfect example of conditional statements in action.

### How an Automatic Car Makes Decisions

**Scenario 1: Free Road/Highway**
- **Condition**: Road is clear and no obstacles ahead
- **Action**: The car increases its speed
- **Code Logic**: `if (roadIsClear) { increaseSpeed(); }`

**Scenario 2: Heavy Traffic**
- **Condition**: Heavy traffic detected
- **Action**: The car reduces its speed automatically
- **Code Logic**: `if (heavyTraffic) { decreaseSpeed(); }`

**Scenario 3: Obstacle Detection**
- **Condition**: Obstacle or person detected in front
- **Action**: The car stops immediately
- **Code Logic**: `if (obstacleDetected) { stop(); }`

### Pseudo-Code Representation

```java
if (obstacleDetected) {
    stop();
} else if (heavyTraffic) {
    decreaseSpeed();
} else if (roadIsClear) {
    increaseSpeed();
} else {
    maintainSpeed();
}
```

These actions are based on **conditions**, demonstrating the practical use of conditional statements in real-world applications.

## Understanding the if Statement

The `if` statement is the most basic conditional statement. It executes a block of code only if a specified condition is `true`.

### Basic if Statement Syntax

```java
if (condition) {
    // Code to execute if condition is true
}
```

**Components:**
- **condition**: A boolean expression that evaluates to `true` or `false`
- **Code block**: The statements to execute if the condition is `true`
- **Curly braces `{}`**: Group multiple statements together

### Simple if Example

Let's start with a basic example:

```java
int x = 8;

System.out.println("hello");
System.out.println("bye");

// Applying an if condition
if (x > 10) {
    System.out.println("hello");
}
```

**Output:**
```
hello
bye
```

**Explanation:**
1. `x` is assigned the value 8
2. First two print statements execute normally: "hello" and "bye"
3. The `if` condition checks: `x > 10` → `8 > 10` → `false`
4. Since the condition is `false`, the code inside the `if` block doesn't execute
5. No additional "hello" is printed

### Key Requirement: Boolean Value

The condition in an `if` statement **must evaluate to a boolean value** (`true` or `false`).

**Valid Conditions:**
```java
if (x > 10)           // Relational operator - returns boolean
if (isActive)         // Boolean variable
if (a > 5 && b < 10)  // Logical operators - returns boolean
if (name.equals("John")) // Method that returns boolean
```

**Invalid Conditions:**
```java
if (x)                // Error: x is int, not boolean
if (5)                // Error: 5 is not a boolean
if ("hello")          // Error: String is not boolean
```

### if Statement with True Condition

Now let's see what happens when the condition is `true`:

```java
int x = 18;

if (x > 10 && x <= 20) {
    System.out.println("hello");
}
```

**Output:**
```
hello
```

**Explanation:**
1. `x` is assigned the value 18
2. The `if` condition checks: `x > 10 && x <= 20`
   - First part: `18 > 10` → `true`
   - Second part: `18 <= 20` → `true`
   - Combined with AND: `true && true` → `true`
3. Since the condition is `true`, the code inside the `if` block executes
4. "hello" is printed

**This example demonstrates:**
- Using logical operators (`&&`) with two expressions
- Combining multiple conditions
- Range checking (value between 10 and 20)

## The if-else Statement

The `if-else` statement extends the `if` statement by adding an `else` clause. This allows you to execute one block of code when the condition is `true`, and a different block when it's `false`.

### Syntax of if-else

```java
if (condition) {
    // Code to execute if condition is true
} else {
    // Code to execute if condition is false
}
```

**How It Works:**
1. The condition is evaluated
2. If the condition is `true`, the `if` block executes
3. If the condition is `false`, the `else` block executes
4. Only one block will execute—never both

### Basic if-else Example

```java
int x = 15;

if (x > 10) {
    System.out.println("Value is greater than 10");
} else {
    System.out.println("Value is 10 or less");
}
```

**Output:**
```
Value is greater than 10
```

**Explanation:**
1. `x` is assigned the value 15
2. The condition `x > 10` is evaluated: `15 > 10` → `true`
3. Since the condition is `true`, the `if` block executes
4. "Value is greater than 10" is printed
5. The `else` block is skipped

### if-else Example with False Condition

```java
int x = 5;

if (x > 10) {
    System.out.println("Value is greater than 10");
} else {
    System.out.println("Value is 10 or less");
}
```

**Output:**
```
Value is 10 or less
```

**Explanation:**
1. `x` is assigned the value 5
2. The condition `x > 10` is evaluated: `5 > 10` → `false`
3. Since the condition is `false`, the `if` block is skipped
4. The `else` block executes
5. "Value is 10 or less" is printed

## Curly Braces: When Are They Required?

Understanding when to use curly braces is important for writing correct and maintainable code.

### Rule for Curly Braces

**If there is only one statement to execute:**
- Curly braces `{}` are **optional**
- The single statement is associated with the `if` or `else`

**If there are multiple statements:**
- Curly braces are **mandatory**
- They group the statements together as a block

### Single Statement (Braces Optional)

```java
int x = 15;

// Without braces (single statement)
if (x > 10)
    System.out.println("Greater than 10");
else
    System.out.println("10 or less");
```

**Output:**
```
Greater than 10
```

This works, but **it's not recommended** because:
- It's less clear
- Adding more statements later can cause bugs
- Easier to make mistakes

### Multiple Statements (Braces Required)

```java
int x = 15;

// With braces (multiple statements)
if (x > 10) {
    System.out.println("Greater than 10");
    System.out.println("x is " + x);
} else {
    System.out.println("10 or less");
    System.out.println("x is " + x);
}
```

**Output:**
```
Greater than 10
x is 15
```

**Why Braces Matter:**

Without braces for multiple statements:
```java
int x = 5;

// WRONG - only first statement is in if
if (x > 10)
    System.out.println("Greater than 10");
    System.out.println("This always prints!");  // Not part of if!
```

**Output:**
```
This always prints!
```

The second statement **always executes** because it's not part of the `if` block!

**Correct Version:**
```java
int x = 5;

if (x > 10) {
    System.out.println("Greater than 10");
    System.out.println("This only prints if x > 10");
}
```

**Output:**
```
(nothing prints)
```

### Best Practice

**Always use curly braces, even for single statements:**

```java
// Recommended (always use braces)
if (x > 10) {
    System.out.println("Greater than 10");
}

// Not recommended (no braces)
if (x > 10)
    System.out.println("Greater than 10");
```

**Why?**
- Prevents bugs when adding more statements
- Makes code more consistent and readable
- Avoids confusion
- Industry standard practice

## Complete if-else Examples

### Example 1: Age Verification

```java
int age = 20;

if (age >= 18) {
    System.out.println("You are an adult");
    System.out.println("You can vote");
} else {
    System.out.println("You are a minor");
    System.out.println("You cannot vote yet");
}
```

**Output:**
```
You are an adult
You can vote
```

### Example 2: Temperature Check

```java
int temperature = 15;

if (temperature >= 30) {
    System.out.println("It's hot outside");
} else {
    System.out.println("It's not hot");
}
```

**Output:**
```
It's not hot
```

### Example 3: Even or Odd

```java
int number = 7;

if (number % 2 == 0) {
    System.out.println(number + " is even");
} else {
    System.out.println(number + " is odd");
}
```

**Output:**
```
7 is odd
```

### Example 4: Password Validation

```java
String password = "secure123";
int minLength = 8;

if (password.length() >= minLength) {
    System.out.println("Password is valid");
} else {
    System.out.println("Password is too short");
    System.out.println("Minimum length is " + minLength);
}
```

**Output:**
```
Password is valid
```

### Example 5: Discount Eligibility

```java
int purchaseAmount = 150;
int discountThreshold = 100;

if (purchaseAmount >= discountThreshold) {
    System.out.println("You get a discount!");
    int discount = purchaseAmount * 10 / 100;
    System.out.println("Discount amount: $" + discount);
} else {
    System.out.println("No discount available");
    System.out.println("Spend $" + (discountThreshold - purchaseAmount) + " more to get discount");
}
```

**Output:**
```
You get a discount!
Discount amount: $15
```

## Nested if-else Statements

You can place `if-else` statements inside other `if-else` statements. This is called **nesting**.

### Nested if-else Syntax

```java
if (condition1) {
    if (condition2) {
        // Executes if both condition1 and condition2 are true
    } else {
        // Executes if condition1 is true but condition2 is false
    }
} else {
    // Executes if condition1 is false
}
```

### Nested if-else Example

```java
int age = 25;
boolean hasLicense = true;

if (age >= 18) {
    if (hasLicense) {
        System.out.println("You can drive");
    } else {
        System.out.println("You need a license");
    }
} else {
    System.out.println("You are too young to drive");
}
```

**Output:**
```
You can drive
```

**Explanation:**
1. First condition: `age >= 18` → `25 >= 18` → `true`
2. Enter outer `if` block
3. Second condition: `hasLicense` → `true`
4. Enter inner `if` block
5. Print "You can drive"

### Grade System Example

```java
int score = 85;

if (score >= 0 && score <= 100) {
    if (score >= 90) {
        System.out.println("Grade: A");
    } else if (score >= 80) {
        System.out.println("Grade: B");
    } else if (score >= 70) {
        System.out.println("Grade: C");
    } else if (score >= 60) {
        System.out.println("Grade: D");
    } else {
        System.out.println("Grade: F");
    }
} else {
    System.out.println("Invalid score");
}
```

**Output:**
```
Grade: B
```

## Code Indentation and Readability

Indentation in Java does not affect the execution of the code, but it is crucial for making the code clean, organized, and easy to understand.

### Why Indentation Matters

**Without Proper Indentation:**
```java
int x = 15;
if (x > 10) {
System.out.println("Greater than 10");
if (x < 20) {
System.out.println("Less than 20");
}
} else {
System.out.println("10 or less");
}
```

**With Proper Indentation:**
```java
int x = 15;

if (x > 10) {
    System.out.println("Greater than 10");
    
    if (x < 20) {
        System.out.println("Less than 20");
    }
} else {
    System.out.println("10 or less");
}
```

**Benefits of Good Indentation:**
1. **Readability**: Easy to see the structure at a glance
2. **Debugging**: Easier to find errors and understand flow
3. **Maintenance**: Other developers can understand your code
4. **Professionalism**: Shows attention to detail
5. **Avoid Mistakes**: Visual cues help prevent logical errors

### Indentation Best Practices

**Practice 1: Consistent Spacing**
- Use either 2 or 4 spaces per indentation level
- Be consistent throughout your code
- Most IDEs use 4 spaces by default

**Practice 2: Align Blocks**
```java
if (condition) {
    // 4 spaces
    statement1;
    statement2;
}
```

**Practice 3: Nested Blocks**
```java
if (condition1) {
    // First level: 4 spaces
    if (condition2) {
        // Second level: 8 spaces
        statement;
    }
}
```

**Practice 4: Use IDE Auto-Format**
- Most IDEs (like VS Code, IntelliJ) can auto-format your code
- Usually Ctrl+Shift+F or similar shortcut
- Maintains consistent style

## Key Points to Remember

### 1. Boolean Conditions

**If conditions always evaluate to boolean values (`true` or `false`):**

```java
// Valid
if (x > 10)           // Relational: returns boolean
if (isActive)         // Boolean variable
if (x > 5 && y < 10)  // Logical: returns boolean

// Invalid
if (x)                // Error: int is not boolean
if (10)               // Error: number is not boolean
```

### 2. Curly Braces

**Rules:**
- Optional for single statement (but not recommended)
- Mandatory for multiple statements
- Best practice: Always use them

### 3. Indentation

**Remember:**
- Doesn't affect execution
- Makes code readable and maintainable
- Helps visualize structure
- Professional practice

### 4. else is Optional

You don't always need an `else`:

```java
int x = 5;

if (x > 10) {
    System.out.println("Greater than 10");
}
// No else - program continues normally if condition is false
```

### 5. Only One Block Executes

In an `if-else` statement:
- Either the `if` block executes
- Or the `else` block executes
- Never both
- Execution continues after the statement

## Common Mistakes to Avoid

### Mistake 1: Using = Instead of ==

```java
int x = 10;

// Wrong - assignment, not comparison
if (x = 10) {  // Error: incompatible types

// Correct - comparison
if (x == 10) {
    System.out.println("x is 10");
}
```

### Mistake 2: Forgetting Braces for Multiple Statements

```java
int x = 5;

// Wrong - only first statement is in if
if (x > 10)
    System.out.println("First");
    System.out.println("Second");  // Always executes!

// Correct
if (x > 10) {
    System.out.println("First");
    System.out.println("Second");
}
```

### Mistake 3: Semicolon After if

```java
// Wrong - semicolon terminates the if
if (x > 10);  // Empty statement!
{
    System.out.println("This always prints");
}

// Correct
if (x > 10) {
    System.out.println("This prints only if x > 10");
}
```

### Mistake 4: Non-Boolean Conditions

```java
int x = 10;

// Wrong
if (x) {  // Error: int cannot be converted to boolean

// Correct
if (x > 0) {
    System.out.println("x is positive");
}
```

## Practical Decision-Making Examples

### Example 1: Login System

```java
String username = "admin";
String password = "1234";

if (username.equals("admin") && password.equals("1234")) {
    System.out.println("Login successful");
    System.out.println("Welcome, " + username);
} else {
    System.out.println("Login failed");
    System.out.println("Invalid username or password");
}
```

### Example 2: ATM Withdrawal

```java
double balance = 1000.0;
double withdrawAmount = 500.0;

if (withdrawAmount <= balance) {
    balance = balance - withdrawAmount;
    System.out.println("Withdrawal successful");
    System.out.println("Remaining balance: $" + balance);
} else {
    System.out.println("Insufficient funds");
    System.out.println("Your balance: $" + balance);
}
```

### Example 3: Exam Result

```java
int marks = 75;
int passingMarks = 40;

if (marks >= passingMarks) {
    System.out.println("Congratulations! You passed.");
    System.out.println("Your score: " + marks);
} else {
    int deficit = passingMarks - marks;
    System.out.println("Sorry, you failed.");
    System.out.println("You need " + deficit + " more marks to pass.");
}
```

## Summary: if-else Quick Reference

### Basic if Syntax
```java
if (condition) {
    // Executes if true
}
```

### if-else Syntax
```java
if (condition) {
    // Executes if true
} else {
    // Executes if false
}
```

### Key Rules
1. Condition must be boolean
2. Use curly braces for clarity
3. Only one block executes
4. Indentation improves readability
5. `else` is optional

## Key Takeaways

1. **Purpose**: Conditional statements control program flow based on conditions
2. **if Statement**: Executes code only if condition is `true`
3. **if-else Statement**: Executes one block if `true`, another if `false`
4. **Boolean Required**: Conditions must evaluate to `true` or `false`
5. **Curly Braces**: Always use them for clarity and safety
6. **Indentation**: Makes code readable but doesn't affect execution
7. **Real-World Use**: Essential for decision-making in all programs
8. **Best Practices**: Clear conditions, proper formatting, meaningful names

Understanding `if-else` statements is crucial because:
- They are fundamental to all programming
- They enable programs to make decisions
- They respond to different inputs and situations
- They are used in virtually every Java program
- They form the basis for more complex control structures

---

*Master if-else statements to give your programs the power to make decisions!*