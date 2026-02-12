# Logical Operators in Java

## Introduction to Logical Operators

Logical operators in Java are used to perform logical operations on boolean expressions. They allow you to combine multiple conditions and make complex decisions in your programs.

**What Makes Them Special?**

Logical operators:
- Work with boolean values (`true` or `false`)
- Combine multiple conditions
- Return a boolean result
- Are essential for decision-making and control flow

Think of logical operators as a way to ask compound questions:
- "Is this true AND that true?"
- "Is this true OR that true?"
- "Is this NOT true?"
- "Is exactly one of these true?"

## Why Are Logical Operators Crucial?

Logical operators are crucial for decision-making in programs because they allow you to:

1. **Combine Multiple Conditions**: Check several things at once
2. **Create Complex Logic**: Build sophisticated decision trees
3. **Validate Data**: Ensure multiple criteria are met
4. **Control Program Flow**: Determine which code executes based on multiple factors

**Real-World Examples:**
- Login validation: "Is username correct AND password correct?"
- Age verification: "Is age >= 18 OR has parental consent?"
- Access control: "Is user admin OR is user owner?"
- Form validation: "Is field NOT empty?"

## The Four Main Logical Operators in Java

Java provides four main logical operators:

1. **Logical AND**: `&` and `&&`
2. **Logical OR**: `|` and `||`
3. **Logical NOT**: `!`
4. **Logical XOR**: `^`

Let's explore each operator in detail.

## 1. Logical AND Operators (& and &&)

The AND operator returns `true` only if **both** operands are `true`. If either operand is `false`, the result is `false`.

### Two Versions of AND

Java provides two versions of the AND operator:

#### & (Bitwise AND)
- **Evaluates both operands** regardless of the first operand's value
- Checks both conditions every time

#### && (Short-Circuit AND)
- **Evaluates the second operand only if the first is true**
- If the first condition is `false`, skips the second condition
- More efficient in most cases

### Syntax

```java
boolean result = condition1 && condition2;
```

### Truth Table for AND

| Operand 1 | Operand 2 | Result (AND) |
|-----------|-----------|--------------|
| `true` | `true` | `true` |
| `true` | `false` | `false` |
| `false` | `true` | `false` |
| `false` | `false` | `false` |

**Key Point:** Both conditions must be `true` for the result to be `true`.

### Example: Logical AND (&&)

```java
int x = 7, y = 5, a = 5, b = 9;

boolean result = (x > y) && (a < b);
System.out.println(result);  // Output: true
```

### Detailed Explanation

Let's break down the example step by step:

**Step 1: Evaluate First Condition**
```java
x > y  →  7 > 5  →  true
```

**Step 2: Evaluate Second Condition**
```java
a < b  →  5 < 9  →  true
```

**Step 3: Combine with AND**
```java
true && true  →  true
```

**Result:** Since both conditions are `true`, the final result is `true`.

### More Examples

**Example 1: Login Validation**
```java
String username = "admin";
String password = "1234";

boolean isValidLogin = (username.equals("admin")) && (password.equals("1234"));
System.out.println(isValidLogin);  // Output: true
```

**Example 2: Age and License Check**
```java
int age = 20;
boolean hasLicense = true;

boolean canDrive = (age >= 18) && hasLicense;
System.out.println(canDrive);  // Output: true
```

**Example 3: Range Check**
```java
int score = 75;

boolean inRange = (score >= 0) && (score <= 100);
System.out.println(inRange);  // Output: true
```

**Example 4: One False Condition**
```java
int x = 10;
int y = 20;

boolean result = (x > y) && (x > 0);
// First condition: 10 > 20 → false
// Result: false (doesn't even check second condition with &&)
System.out.println(result);  // Output: false
```

### Short-Circuit Behavior of &&

The `&&` operator uses **short-circuit evaluation**. This means:
- If the first condition is `false`, the second condition is **not evaluated**
- This can improve performance
- It can prevent errors from conditions that shouldn't be checked

**Example of Short-Circuit:**
```java
int x = 0;
boolean result = (x != 0) && (10 / x > 2);
// First condition is false (x is 0)
// Second condition is NOT evaluated (preventing division by zero!)
System.out.println(result);  // Output: false
```

**Without Short-Circuit (using &):**
```java
int x = 0;
boolean result = (x != 0) & (10 / x > 2);
// Both conditions are evaluated
// This will cause ArithmeticException: / by zero
```

## 2. Logical OR Operators (| and ||)

The OR operator returns `true` if **at least one** operand is `true`. It returns `false` only if both operands are `false`.

### Two Versions of OR

#### | (Bitwise OR)
- **Evaluates both operands** regardless of the first operand's value
- Checks both conditions every time

#### || (Short-Circuit OR)
- **Evaluates the second operand only if the first is false**
- If the first condition is `true`, skips the second condition
- More efficient in most cases

### Syntax

```java
boolean result = condition1 || condition2;
```

### Truth Table for OR

| Operand 1 | Operand 2 | Result (OR) |
|-----------|-----------|-------------|
| `true` | `true` | `true` |
| `true` | `false` | `true` |
| `false` | `true` | `true` |
| `false` | `false` | `false` |

**Key Point:** At least one condition must be `true` for the result to be `true`.

### Example: Logical OR (||)

```java
int x = 7, y = 5, a = 5, b = 9;

boolean result = (x > y) || (a > b);
System.out.println(result);  // Output: true
```

### Detailed Explanation

Let's break down the example step by step:

**Step 1: Evaluate First Condition**
```java
x > y  →  7 > 5  →  true
```

**Step 2: Check if Second Condition is Needed**
Since the first condition is `true`, the `||` operator uses short-circuit evaluation and **doesn't evaluate** the second condition.

**Result:** The result is `true` because at least one condition (the first one) is `true`.

**If we evaluate both conditions manually:**
```java
First condition:  x > y  →  7 > 5  →  true
Second condition: a > b  →  5 > 9  →  false

true || false  →  true
```

### More Examples

**Example 1: Access Control**
```java
boolean isAdmin = false;
boolean isOwner = true;

boolean hasAccess = isAdmin || isOwner;
System.out.println(hasAccess);  // Output: true
```

**Example 2: Discount Eligibility**
```java
boolean isStudent = true;
boolean isSenior = false;

boolean getsDiscount = isStudent || isSenior;
System.out.println(getsDiscount);  // Output: true
```

**Example 3: Input Validation**
```java
String input = "";

boolean isInvalid = (input == null) || (input.isEmpty());
System.out.println(isInvalid);  // Output: true
```

**Example 4: Both Conditions False**
```java
int age = 15;
boolean hasPermission = false;

boolean canEnter = (age >= 18) || hasPermission;
// First condition: 15 >= 18 → false
// Second condition: false
// Result: false || false → false
System.out.println(canEnter);  // Output: false
```

### Short-Circuit Behavior of ||

The `||` operator uses **short-circuit evaluation**:
- If the first condition is `true`, the second condition is **not evaluated**
- This can improve performance
- It can prevent unnecessary checks

**Example of Short-Circuit:**
```java
String str = null;
boolean result = (str == null) || (str.length() > 0);
// First condition is true
// Second condition is NOT evaluated (preventing NullPointerException!)
System.out.println(result);  // Output: true
```

**Without Short-Circuit (using |):**
```java
String str = null;
boolean result = (str == null) | (str.length() > 0);
// Both conditions are evaluated
// This will cause NullPointerException
```

## 3. Logical NOT Operator (!)

The NOT operator inverts (negates) the boolean value of an expression. It turns `true` into `false` and `false` into `true`.

### Syntax

```java
boolean result = !condition;
```

### Truth Table for NOT

| Operand | Result (NOT) |
|---------|--------------|
| `true` | `false` |
| `false` | `true` |

**Key Point:** NOT simply flips the boolean value.

### Example: Logical NOT (!)

```java
int x = 7, y = 5;

boolean result = !(x < y);
System.out.println(result);  // Output: true
```

### Detailed Explanation

Let's break down the example step by step:

**Step 1: Evaluate the Inner Condition**
```java
x < y  →  7 < 5  →  false
```

**Step 2: Apply NOT Operator**
```java
!(false)  →  true
```

**Result:** Since `(x < y)` is `false`, `!(x < y)` becomes `true`.

### More Examples

**Example 1: Checking if NOT Equal**
```java
int a = 10;
int b = 20;

boolean notEqual = !(a == b);
System.out.println(notEqual);  // Output: true
```

**Example 2: Inverting Boolean Variable**
```java
boolean isActive = false;

boolean isInactive = !isActive;
System.out.println(isInactive);  // Output: true
```

**Example 3: Checking if NOT Empty**
```java
String text = "Hello";

boolean notEmpty = !(text.isEmpty());
System.out.println(notEmpty);  // Output: true
```

**Example 4: Double Negation**
```java
boolean value = true;

boolean result = !!value;  // Double NOT
System.out.println(result);  // Output: true (same as original)
```

### Common Use Cases for NOT

**Use Case 1: Negating Conditions**
```java
if (!isLoggedIn) {
    System.out.println("Please log in");
}
```

**Use Case 2: Toggle Boolean**
```java
boolean flag = true;
flag = !flag;  // Toggle: true becomes false
```

**Use Case 3: Opposite Conditions**
```java
boolean isValid = checkValidation();

if (!isValid) {
    System.out.println("Invalid input");
}
```

## 4. Logical XOR Operator (^)

The XOR (Exclusive OR) operator returns `true` if **exactly one** operand is `true`. If both operands are the same (both `true` or both `false`), it returns `false`.

### Syntax

```java
boolean result = condition1 ^ condition2;
```

### Truth Table for XOR

| Operand 1 | Operand 2 | Result (XOR) |
|-----------|-----------|--------------|
| `true` | `true` | `false` |
| `true` | `false` | `true` |
| `false` | `true` | `true` |
| `false` | `false` | `false` |

**Key Point:** XOR returns `true` only when the operands are **different**.

### Example: Logical XOR (^)

```java
int x = 7, y = 5, a = 5, b = 9;

boolean result = (x > y) ^ (a < b);
System.out.println(result);  // Output: false
```

### Detailed Explanation

Let's break down the example step by step:

**Step 1: Evaluate First Condition**
```java
x > y  →  7 > 5  →  true
```

**Step 2: Evaluate Second Condition**
```java
a < b  →  5 < 9  →  true
```

**Step 3: Combine with XOR**
```java
true ^ true  →  false
```

**Result:** Both conditions are `true`, so XOR returns `false` (they are the same, not different).

### More Examples

**Example 1: One True, One False**
```java
boolean condition1 = true;
boolean condition2 = false;

boolean result = condition1 ^ condition2;
System.out.println(result);  // Output: true
```

**Example 2: Both False**
```java
int x = 5;
int y = 10;

boolean result = (x > y) ^ (x < 0);
// First: 5 > 10 → false
// Second: 5 < 0 → false
// Result: false ^ false → false
System.out.println(result);  // Output: false
```

**Example 3: Toggle Implementation**
```java
boolean flag = true;

// XOR with true flips the value
flag = flag ^ true;
System.out.println(flag);  // Output: false

flag = flag ^ true;
System.out.println(flag);  // Output: true
```

**Example 4: Checking Different States**
```java
boolean isOnline = true;
boolean isOffline = false;

boolean differentStates = isOnline ^ isOffline;
System.out.println(differentStates);  // Output: true
```

### When to Use XOR

XOR is useful when you want to ensure **exactly one** condition is true:

**Use Case 1: Exclusive Options**
```java
boolean hasTicketA = true;
boolean hasTicketB = false;

boolean validEntry = hasTicketA ^ hasTicketB;  // Must have exactly one ticket
```

**Use Case 2: Toggle Mechanism**
```java
boolean state = false;
state = state ^ true;  // Flips the state
```

**Use Case 3: Difference Detection**
```java
boolean oldValue = true;
boolean newValue = false;

boolean hasChanged = oldValue ^ newValue;  // true if values are different
```

## Complete Example Program

Here's a comprehensive program demonstrating all logical operators:

```java
public class LogicalOperatorsExample {
    public static void main(String[] args) {
        int x = 7, y = 5, a = 5, b = 9;
        
        // AND operation
        boolean andResult = (x > y) && (a < b);
        System.out.println("AND Result: " + andResult);  // Output: true
        
        // OR operation
        boolean orResult = (x > y) || (a > b);
        System.out.println("OR Result: " + orResult);    // Output: true
        
        // NOT operation
        boolean notResult = !(x < y);
        System.out.println("NOT Result: " + notResult);  // Output: true
        
        // XOR operation
        boolean xorResult = (x > y) ^ (a < b);
        System.out.println("XOR Result: " + xorResult);  // Output: false
    }
}
```

### Output

```
AND Result: true
OR Result: true
NOT Result: true
XOR Result: false
```

### Detailed Breakdown of Each Operation

**AND Operation:**
```java
(x > y) && (a < b)
(7 > 5) && (5 < 9)
true && true
→ true
```

**OR Operation:**
```java
(x > y) || (a > b)
(7 > 5) || (5 > 9)
true || false
→ true (short-circuit: second condition not evaluated)
```

**NOT Operation:**
```java
!(x < y)
!(7 < 5)
!(false)
→ true
```

**XOR Operation:**
```java
(x > y) ^ (a < b)
(7 > 5) ^ (5 < 9)
true ^ true
→ false
```

## Short-Circuit vs Non-Short-Circuit Operators

### Comparison Table

| Feature | `&&` (AND) | `&` (AND) | `||` (OR) | `|` (OR) |
|---------|-----------|----------|-----------|----------|
| **Type** | Short-circuit | Non-short-circuit | Short-circuit | Non-short-circuit |
| **Evaluates both?** | Sometimes | Always | Sometimes | Always |
| **Performance** | Better | Slower | Better | Slower |
| **Use case** | Most common | Rare (bitwise) | Most common | Rare (bitwise) |

### When to Use Each

**Use Short-Circuit (`&&` and `||`):**
- Most of the time (default choice)
- When you want better performance
- When second condition might cause errors if first is false/true

**Use Non-Short-Circuit (`&` and `|`):**
- When you need both conditions evaluated (e.g., for side effects)
- When working with bitwise operations
- Rarely in logical operations

### Example: Why Short-Circuit Matters

```java
// Safe with short-circuit
String str = null;
if (str != null && str.length() > 0) {
    System.out.println("Valid");
}
// Output: (nothing, no error)

// Unsafe without short-circuit
String str = null;
if (str != null & str.length() > 0) {  // NullPointerException!
    System.out.println("Valid");
}
```

## Combining Multiple Logical Operators

You can combine multiple logical operators to create complex conditions.

### Example 1: Multiple AND Conditions

```java
int age = 25;
boolean hasLicense = true;
boolean hasInsurance = true;

boolean canRentCar = (age >= 21) && hasLicense && hasInsurance;
System.out.println(canRentCar);  // Output: true
```

### Example 2: Multiple OR Conditions

```java
boolean isWeekend = true;
boolean isHoliday = false;
boolean isVacation = false;

boolean canRelax = isWeekend || isHoliday || isVacation;
System.out.println(canRelax);  // Output: true
```

### Example 3: Mixing AND and OR

```java
int score = 85;
boolean hasBonus = false;

boolean passes = (score >= 60) || (score >= 50 && hasBonus);
System.out.println(passes);  // Output: true
```

### Example 4: Using Parentheses for Clarity

```java
boolean a = true, b = false, c = true;

// Without parentheses (can be confusing)
boolean result1 = a && b || c;

// With parentheses (much clearer)
boolean result2 = (a && b) || c;

System.out.println(result1);  // Output: true
System.out.println(result2);  // Output: true
```

## Operator Precedence

When combining logical operators, precedence matters:

**Precedence Order (highest to lowest):**
1. `!` (NOT)
2. `&&` (AND)
3. `||` (OR)
4. `^` (XOR)

### Example of Precedence

```java
boolean result = true || false && false;
// Evaluated as: true || (false && false)
// Result: true || false → true
System.out.println(result);  // Output: true
```

**Best Practice:** Always use parentheses to make your intention clear:

```java
boolean result = true || (false && false);  // Explicit and clear
```

## Practical Real-World Examples

### Example 1: User Authentication

```java
String username = "admin";
String password = "secure123";
boolean rememberMe = true;

boolean isAuthenticated = 
    (username.equals("admin") && password.equals("secure123")) || rememberMe;

System.out.println("Authenticated: " + isAuthenticated);  // Output: true
```

### Example 2: Discount Calculation

```java
int age = 65;
boolean isStudent = false;
boolean isMember = true;

boolean getsDiscount = (age >= 65) || isStudent || isMember;
System.out.println("Eligible for discount: " + getsDiscount);  // Output: true
```

### Example 3: Form Validation

```java
String email = "user@example.com";
String password = "pass123";
boolean agreedToTerms = true;

boolean isValidForm = 
    !email.isEmpty() && 
    password.length() >= 8 && 
    agreedToTerms;

System.out.println("Form is valid: " + isValidForm);  // Output: false
```

### Example 4: Access Control

```java
boolean isAdmin = false;
boolean isOwner = true;
boolean isEditor = false;

boolean canEdit = isAdmin || isOwner || (isEditor && !isOwner);
System.out.println("Can edit: " + canEdit);  // Output: true
```

## Common Mistakes and Best Practices

### Mistake 1: Using = Instead of ==

```java
boolean flag = true;

// Wrong - assignment, not comparison
if (flag = false) {  // Assigns false to flag

// Correct
if (flag == false) {  // Compares flag with false
// Or better:
if (!flag) {  // More idiomatic
```

### Mistake 2: Forgetting Operator Precedence

```java
// Confusing
boolean result = true || false && false;

// Clear
boolean result = true || (false && false);
```

### Mistake 3: Using Non-Short-Circuit When Unsafe

```java
String str = null;

// Wrong - will cause NullPointerException
if (str != null & str.length() > 0)

// Correct - uses short-circuit
if (str != null && str.length() > 0)
```

### Best Practice 1: Use Parentheses

```java
// Less clear
if (a && b || c && d)

// More clear
if ((a && b) || (c && d))
```

### Best Practice 2: Simplify NOT Expressions

```java
// Verbose
if (!(x == y))

// Better
if (x != y)

// Verbose
if (!(flag == true))

// Better
if (!flag)
```

### Best Practice 3: Use Short-Circuit by Default

```java
// Prefer this
if (user != null && user.isActive())

// Over this (unless you need both evaluated)
if (user != null & user.isActive())
```

## Summary: Quick Reference

| Operator | Name | Description | Example | Result |
|----------|------|-------------|---------|--------|
| `&&` | Short-circuit AND | Both must be true | `true && false` | `false` |
| `&` | Bitwise AND | Both must be true (no short-circuit) | `true & false` | `false` |
| `||` | Short-circuit OR | At least one must be true | `true || false` | `true` |
| `|` | Bitwise OR | At least one must be true (no short-circuit) | `true | false` | `true` |
| `!` | NOT | Inverts the value | `!true` | `false` |
| `^` | XOR | Exactly one must be true | `true ^ false` | `true` |

## Key Takeaways

1. **Logical AND (&&)**: Both conditions must be `true`
2. **Logical OR (||)**: At least one condition must be `true`
3. **Logical NOT (!)**: Inverts the boolean value
4. **Logical XOR (^)**: Exactly one condition must be `true`
5. **Short-Circuit Evaluation**: `&&` and `||` can skip the second operand
6. **Performance**: Short-circuit operators are generally more efficient
7. **Safety**: Short-circuit prevents errors from unchecked conditions
8. **Precedence**: NOT > AND > OR > XOR
9. **Best Practice**: Use parentheses for clarity
10. **Common Use**: Essential for conditions, validation, and decision-making

Understanding logical operators is essential because:
- They enable complex decision-making
- They control program flow based on multiple conditions
- They are used in virtually every Java program
- They help validate data and implement business logic
- They make code more expressive and readable

---

*Master logical operators to write powerful and flexible conditional logic!*