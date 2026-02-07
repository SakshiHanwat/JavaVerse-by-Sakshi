# Relational Operators in Java

## Introduction to Relational Operators

Relational operators are binary operators used to evaluate relationships between two operands. They compare values and determine how they relate to each other—whether they're equal, one is greater than the other, or one is less than the other.

**What Makes Them Special?**

Relational operators always return a **boolean result**: either `true` or `false`. This makes them essential for:
- Making decisions in your program
- Controlling program flow
- Implementing logic and conditions
- Validating data

Think of relational operators as questions you ask about two values:
- "Are these equal?"
- "Is this greater than that?"
- "Is this less than or equal to that?"

The answer is always yes (`true`) or no (`false`).

## What are Binary Operators?

Before we dive deeper, let's understand what "binary" means in this context:

**Binary Operator:** An operator that works on **two operands**

```java
operand1  operator  operand2
   ↓         ↓         ↓
   5        >         3
```

In the example above:
- `5` and `3` are the two operands
- `>` is the binary operator that compares them
- The result is `true` (because 5 is greater than 3)

## Where Are Relational Operators Used?

Relational operators are commonly used in:

### 1. Conditional Statements (if-else)
```java
int age = 18;

if (age >= 18) {
    System.out.println("You can vote");
} else {
    System.out.println("You cannot vote yet");
}
```

### 2. Looping Statements (while, for)
```java
int count = 0;

while (count < 10) {
    System.out.println(count);
    count++;
}
```

### 3. Ternary Operator
```java
int score = 85;
String result = (score >= 60) ? "Pass" : "Fail";
```

### 4. Logical Expressions
```java
boolean isEligible = (age >= 18 && hasID == true);
```

## Syntax of Relational Operators

The standard format for using a relational operator is:

```java
variable1 relational_operator variable2
```

**Components:**
- **variable1**: The first operand (left side)
- **relational_operator**: The comparison operator
- **variable2**: The second operand (right side)

**Examples:**
```java
a == b    // Is a equal to b?
x > y     // Is x greater than y?
p <= q    // Is p less than or equal to q?
```

## The Six Relational Operators in Java

Java provides six relational operators for different types of comparisons:

| Operator | Name | Description | Example | Result |
|----------|------|-------------|---------|--------|
| `==` | Equal to | Checks if two values are equal | `5 == 5` | `true` |
| `!=` | Not equal to | Checks if two values are not equal | `5 != 3` | `true` |
| `>` | Greater than | Checks if left is greater than right | `5 > 3` | `true` |
| `<` | Less than | Checks if left is less than right | `5 < 3` | `false` |
| `>=` | Greater than or equal to | Checks if left is greater than or equal to right | `5 >= 5` | `true` |
| `<=` | Less than or equal to | Checks if left is less than or equal to right | `5 <= 3` | `false` |

Let's explore each operator in detail.

## 1. Equality Operator (==)

The equality operator checks if two values are equal.

**Syntax:** `operand1 == operand2`

**Returns:**
- `true` if both operands are equal
- `false` if operands are not equal

**Example:**
```java
int a = 10;
int b = 20;

System.out.println(a == b);  // Output: false
```

**Explanation:**
- `a` has the value 10
- `b` has the value 20
- 10 is not equal to 20
- Therefore, `a == b` returns `false`

### More Examples

**Example 1: Equal Values**
```java
int x = 5;
int y = 5;

System.out.println(x == y);  // Output: true
```

**Example 2: Different Data Types**
```java
int num = 10;
double decimal = 10.0;

System.out.println(num == decimal);  // Output: true (automatic type conversion)
```

**Example 3: Character Comparison**
```java
char letter1 = 'A';
char letter2 = 'A';
char letter3 = 'B';

System.out.println(letter1 == letter2);  // Output: true
System.out.println(letter1 == letter3);  // Output: false
```

### Important Note: String Comparison

**Warning:** Don't use `==` to compare Strings!

```java
String str1 = "Hello";
String str2 = "Hello";

// Wrong way:
System.out.println(str1 == str2);  // May not work as expected

// Correct way:
System.out.println(str1.equals(str2));  // Output: true
```

**Why?** The `==` operator compares object references (memory addresses) for objects, not their actual content. Use the `.equals()` method for String comparison.

## 2. Inequality Operator (!=)

The inequality operator checks if two values are not equal.

**Syntax:** `operand1 != operand2`

**Returns:**
- `true` if operands are NOT equal
- `false` if operands are equal

**Example:**
```java
int a = 10;
int b = 20;

System.out.println(a != b);  // Output: true
```

**Explanation:**
- `a` has the value 10
- `b` has the value 20
- 10 is not equal to 20
- Therefore, `a != b` returns `true`

### More Examples

**Example 1: Equal Values**
```java
int x = 5;
int y = 5;

System.out.println(x != y);  // Output: false (they ARE equal)
```

**Example 2: Checking for Non-Zero**
```java
int value = 42;

if (value != 0) {
    System.out.println("Value is non-zero");
}
// Output: Value is non-zero
```

**Example 3: Boolean Comparison**
```java
boolean isActive = true;
boolean isStopped = false;

System.out.println(isActive != isStopped);  // Output: true
```

### Relationship Between == and !=

These operators are opposites:
- If `a == b` is `true`, then `a != b` is `false`
- If `a == b` is `false`, then `a != b` is `true`

```java
int x = 10;
int y = 20;

System.out.println(x == y);   // false
System.out.println(x != y);   // true (opposite of above)
```

## 3. Greater Than Operator (>)

The greater than operator checks if the left operand is greater than the right operand.

**Syntax:** `operand1 > operand2`

**Returns:**
- `true` if left operand is greater than right operand
- `false` otherwise

**Example:**
```java
int a = 10;
int b = 20;

System.out.println(a > b);  // Output: false
```

**Explanation:**
- `a` has the value 10
- `b` has the value 20
- 10 is NOT greater than 20
- Therefore, `a > b` returns `false`

### More Examples

**Example 1: True Comparison**
```java
int score = 85;
int passingScore = 60;

System.out.println(score > passingScore);  // Output: true
```

**Example 2: Age Verification**
```java
int age = 25;
int adultAge = 18;

if (age > adultAge) {
    System.out.println("Adult");
}
// Output: Adult
```

**Example 3: Decimal Comparison**
```java
double price1 = 99.99;
double price2 = 89.99;

System.out.println(price1 > price2);  // Output: true
```

**Example 4: Equal Values**
```java
int x = 10;
int y = 10;

System.out.println(x > y);  // Output: false (10 is not greater than 10)
```

## 4. Less Than Operator (<)

The less than operator checks if the left operand is less than the right operand.

**Syntax:** `operand1 < operand2`

**Returns:**
- `true` if left operand is less than right operand
- `false` otherwise

**Example:**
```java
int a = 10;
int b = 20;

System.out.println(a < b);  // Output: true
```

**Explanation:**
- `a` has the value 10
- `b` has the value 20
- 10 IS less than 20
- Therefore, `a < b` returns `true`

### More Examples

**Example 1: Temperature Check**
```java
int temperature = 15;
int freezingPoint = 32;

if (temperature < freezingPoint) {
    System.out.println("It's freezing!");
}
// Output: It's freezing!
```

**Example 2: Minimum Value Check**
```java
int value = 5;
int minimum = 10;

System.out.println(value < minimum);  // Output: true
```

**Example 3: Negative Numbers**
```java
int num1 = -5;
int num2 = 0;

System.out.println(num1 < num2);  // Output: true (-5 is less than 0)
```

**Example 4: Equal Values**
```java
int x = 10;
int y = 10;

System.out.println(x < y);  // Output: false (10 is not less than 10)
```

### Relationship Between > and <

These operators are opposites (for non-equal values):
- If `a > b` is `true`, then `a < b` is `false`
- If `a > b` is `false` (and `a != b`), then `a < b` is `true`

```java
int x = 5;
int y = 10;

System.out.println(x > y);   // false
System.out.println(x < y);   // true
```

## 5. Greater Than or Equal To Operator (>=)

The greater than or equal to operator checks if the left operand is greater than OR equal to the right operand.

**Syntax:** `operand1 >= operand2`

**Returns:**
- `true` if left operand is greater than OR equal to right operand
- `false` otherwise

**Example:**
```java
int a = 10;
int b = 20;

System.out.println(a >= b);  // Output: false
```

**Explanation:**
- `a` has the value 10
- `b` has the value 20
- 10 is neither greater than nor equal to 20
- Therefore, `a >= b` returns `false`

### More Examples

**Example 1: Greater Than Case**
```java
int score = 95;
int minimumScore = 60;

System.out.println(score >= minimumScore);  // Output: true (95 > 60)
```

**Example 2: Equal Case**
```java
int age = 18;
int votingAge = 18;

System.out.println(age >= votingAge);  // Output: true (18 == 18)
```

**Example 3: Eligibility Check**
```java
int studentAge = 21;
int minimumAge = 21;

if (studentAge >= minimumAge) {
    System.out.println("Eligible");
}
// Output: Eligible
```

**Example 4: Less Than Case**
```java
int value = 10;
int threshold = 20;

System.out.println(value >= threshold);  // Output: false (10 < 20)
```

### Key Difference from >

The `>=` operator returns `true` when values are equal, while `>` returns `false`:

```java
int x = 10;
int y = 10;

System.out.println(x > y);   // Output: false
System.out.println(x >= y);  // Output: true (because they're equal)
```

## 6. Less Than or Equal To Operator (<=)

The less than or equal to operator checks if the left operand is less than OR equal to the right operand.

**Syntax:** `operand1 <= operand2`

**Returns:**
- `true` if left operand is less than OR equal to right operand
- `false` otherwise

**Example:**
```java
int a = 10;
int b = 20;

System.out.println(a <= b);  // Output: true
```

**Explanation:**
- `a` has the value 10
- `b` has the value 20
- 10 IS less than 20
- Therefore, `a <= b` returns `true`

### More Examples

**Example 1: Less Than Case**
```java
int stock = 5;
int maxStock = 100;

System.out.println(stock <= maxStock);  // Output: true (5 < 100)
```

**Example 2: Equal Case**
```java
int limit = 50;
int current = 50;

System.out.println(current <= limit);  // Output: true (50 == 50)
```

**Example 3: Maximum Check**
```java
int attempts = 3;
int maxAttempts = 3;

if (attempts <= maxAttempts) {
    System.out.println("Allowed");
}
// Output: Allowed
```

**Example 4: Greater Than Case**
```java
int value = 30;
int threshold = 20;

System.out.println(value <= threshold);  // Output: false (30 > 20)
```

### Key Difference from <

The `<=` operator returns `true` when values are equal, while `<` returns `false`:

```java
int x = 10;
int y = 10;

System.out.println(x < y);   // Output: false
System.out.println(x <= y);  // Output: true (because they're equal)
```

## Complete Example with All Operators

Let's see all relational operators in action with the same two variables:

```java
class RelationalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        // Equality (==)
        System.out.println("a == b: " + (a == b));  // Output: false
        
        // Inequality (!=)
        System.out.println("a != b: " + (a != b));  // Output: true
        
        // Greater than (>)
        System.out.println("a > b: " + (a > b));    // Output: false
        
        // Less than (<)
        System.out.println("a < b: " + (a < b));    // Output: true
        
        // Greater than or equal to (>=)
        System.out.println("a >= b: " + (a >= b));  // Output: false
        
        // Less than or equal to (<=)
        System.out.println("a <= b: " + (a <= b));  // Output: true
    }
}
```

**Output:**
```
a == b: false
a != b: true
a > b: false
a < b: true
a >= b: false
a <= b: true
```

## Truth Table for Relational Operators

Let's see how each operator behaves with different relationships between values:

**Given: a = 10, b = 20**

| Operator | Expression | Question | Result | Why? |
|----------|------------|----------|--------|------|
| `==` | `a == b` | Are they equal? | `false` | 10 ≠ 20 |
| `!=` | `a != b` | Are they not equal? | `true` | 10 ≠ 20 |
| `>` | `a > b` | Is a greater than b? | `false` | 10 < 20 |
| `<` | `a < b` | Is a less than b? | `true` | 10 < 20 |
| `>=` | `a >= b` | Is a ≥ b? | `false` | 10 < 20 |
| `<=` | `a <= b` | Is a ≤ b? | `true` | 10 < 20 |

**Given: x = 15, y = 15 (Equal values)**

| Operator | Expression | Result | Why? |
|----------|------------|--------|------|
| `==` | `x == y` | `true` | 15 = 15 |
| `!=` | `x != y` | `false` | 15 = 15 |
| `>` | `x > y` | `false` | 15 is not > 15 |
| `<` | `x < y` | `false` | 15 is not < 15 |
| `>=` | `x >= y` | `true` | 15 = 15 |
| `<=` | `x <= y` | `true` | 15 = 15 |

## Practical Examples

### Example 1: Age Verification System
```java
int age = 17;
int adultAge = 18;
int seniorAge = 65;

if (age < adultAge) {
    System.out.println("Minor");
} else if (age >= adultAge && age < seniorAge) {
    System.out.println("Adult");
} else {
    System.out.println("Senior");
}
// Output: Minor
```

### Example 2: Grade Calculator
```java
int score = 85;

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
// Output: Grade: B
```

### Example 3: Temperature Range Check
```java
int temperature = 75;

if (temperature > 90) {
    System.out.println("It's hot!");
} else if (temperature >= 60 && temperature <= 90) {
    System.out.println("Pleasant weather");
} else {
    System.out.println("It's cold!");
}
// Output: Pleasant weather
```

### Example 4: Password Length Validation
```java
String password = "secure123";
int minLength = 8;
int maxLength = 20;

if (password.length() < minLength) {
    System.out.println("Password too short");
} else if (password.length() > maxLength) {
    System.out.println("Password too long");
} else {
    System.out.println("Password length is valid");
}
// Output: Password length is valid
```

## Common Mistakes and Best Practices

### Mistake 1: Confusing = with ==

```java
int x = 10;

// Wrong - assignment, not comparison
if (x = 10) {  // Error: incompatible types
    System.out.println("Equal");
}

// Correct - comparison
if (x == 10) {
    System.out.println("Equal");
}
```

### Mistake 2: Chaining Comparisons

```java
int age = 25;

// Wrong - doesn't work as expected
if (18 < age < 65) {  // Error: bad operand types

// Correct
if (age > 18 && age < 65) {
    System.out.println("Adult");
}
```

### Mistake 3: Using == for Strings

```java
String str1 = "Hello";
String str2 = "Hello";

// Wrong - compares references, not content
if (str1 == str2) {  // May not work as expected

// Correct
if (str1.equals(str2)) {
    System.out.println("Strings are equal");
}
```

### Best Practice 1: Use Parentheses for Clarity

```java
// Less clear
if (a > b && c < d || e == f)

// More clear
if ((a > b && c < d) || (e == f))
```

### Best Practice 2: Meaningful Comparisons

```java
// Less clear
if (x > 10)

// More clear with named constant
final int MINIMUM_AGE = 10;
if (age > MINIMUM_AGE)
```

### Best Practice 3: Consider Edge Cases

```java
int value = 10;

// Consider what happens at boundaries
if (value >= 10 && value <= 20) {
    // 10 and 20 are included
}

if (value > 10 && value < 20) {
    // 10 and 20 are excluded
}
```

## Operator Precedence

When multiple relational operators are used together, precedence matters:

**Precedence Order (from higher to lower):**
1. `<`, `<=`, `>`, `>=` (all have the same precedence)
2. `==`, `!=` (both have the same precedence, lower than comparison operators)

**Example:**
```java
int a = 5, b = 10, c = 5;

// Evaluated as: (a < b) == (c < b)
boolean result = a < b == c < b;
System.out.println(result);  // Output: true
```

**Recommendation:** Use parentheses to make your intention clear:
```java
boolean result = (a < b) == (c < b);  // Much clearer
```

## Summary: Quick Reference

| Operator | Symbol | Example | Meaning |
|----------|--------|---------|---------|
| Equal to | `==` | `a == b` | Is a equal to b? |
| Not equal to | `!=` | `a != b` | Is a not equal to b? |
| Greater than | `>` | `a > b` | Is a greater than b? |
| Less than | `<` | `a < b` | Is a less than b? |
| Greater than or equal | `>=` | `a >= b` | Is a greater than or equal to b? |
| Less than or equal | `<=` | `a <= b` | Is a less than or equal to b? |

## Key Takeaways

1. **Boolean Results**: All relational operators return `true` or `false`
2. **Binary Operators**: They work on two operands
3. **Common Use**: Essential for conditions, loops, and decision-making
4. **Six Operators**: `==`, `!=`, `>`, `<`, `>=`, `<=`
5. **Equality Check**: Use `==` for primitives, `.equals()` for objects
6. **Assignment vs Comparison**: `=` assigns, `==` compares
7. **Edge Cases**: `>=` and `<=` include equality, `>` and `<` don't
8. **Type Compatible**: Can compare compatible data types

Understanding relational operators is crucial because:
- They control program flow and logic
- They enable decision-making in code
- They are used in almost every Java program
- They form the basis of conditional statements
- They help validate data and implement business logic

---

*Master relational operators to write powerful conditional logic in your programs!*