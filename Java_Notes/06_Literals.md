# Literals in Java

## What Are Literals?

Literals in Java represent fixed values that appear directly in the source code. They are constants that can be assigned to variables and remain unchanged throughout program execution.

Think of literals as the actual values you write in your code:
- When you write `int age = 25;`, the number `25` is a literal
- When you write `char grade = 'A';`, the character `'A'` is a literal
- When you write `String name = "John";`, the text `"John"` is a literal

**Key Characteristics of Literals:**
- They represent constant, fixed values
- They are written directly in your source code
- They cannot be changed during program execution
- They are assigned to variables to give them initial values

## Why Use Literals?

Literals serve several important purposes in programming:

**Direct Value Assignment**
Literals allow you to directly assign values to variables without needing to define constants separately. This makes code simpler and more straightforward.

```java
int count = 10;        // 10 is a literal
double price = 99.99;  // 99.99 is a literal
```

**Code Simplicity**
Literals simplify code by embedding constant values directly within the instructions, making the code more readable and easier to understand.

```java
if (score > 90) {      // 90 is a literal used for comparison
    grade = 'A';       // 'A' is a literal assigned to grade
}
```

**Immediate Understanding**
When someone reads your code, they can immediately see what values are being used without having to look up variable definitions elsewhere.

## Types of Literals in Java

Java supports several types of literals, each corresponding to different data types:

1. **Integer Literals** - Whole numbers
2. **Floating-Point Literals** - Decimal numbers
3. **Character Literals** - Single characters
4. **String Literals** - Sequences of characters
5. **Boolean Literals** - True or false values

Let's explore each type in detail.

## Integer Literals

Integer literals represent whole numbers and are the most commonly used literals in programming. Java provides flexibility in how you can express integer literals using different number systems.

### Number Systems for Integer Literals

Integer literals can be expressed in **four different number systems**:

### 1. Decimal Literals (Base 10)

This is the standard number system we use in everyday life.

**Characteristics:**
- Uses digits 0-9
- No prefix required
- Default representation for numbers

**Example:**
```java
int decimal = 101;     // Decimal literal
int count = 500;
int year = 2024;
```

**How it works:** The number is interpreted exactly as written in base 10.

### 2. Octal Literals (Base 8)

Octal is a base-8 number system, useful in certain low-level programming scenarios.

**Characteristics:**
- Uses digits 0-7 only
- Must be prefixed with `0` (zero)
- Commonly used in file permissions and legacy systems

**Example:**
```java
int octal = 0146;      // Octal literal (equals 102 in decimal)
int permissions = 0755; // File permissions in Unix/Linux
```

**Conversion:**
- `0146` in octal = (1 × 8²) + (4 × 8¹) + (6 × 8⁰) = 64 + 32 + 6 = `102` in decimal

**Important:** Any number starting with `0` is treated as octal:
```java
int num = 0123;        // This is octal, not decimal 123!
```

### 3. Hexadecimal Literals (Base 16)

Hexadecimal is a base-16 number system, widely used in programming, especially for colors, memory addresses, and low-level operations.

**Characteristics:**
- Uses digits 0-9 and letters A-F (or a-f)
- Must be prefixed with `0x` or `0X`
- Case-insensitive for letters (A-F or a-f)

**Example:**
```java
int hex = 0x123Face;   // Hexadecimal literal
int color = 0xFF5733;  // RGB color code
int address = 0xABCD;
```

**Hexadecimal Digits:**
- 0-9 represent values 0-9
- A/a = 10, B/b = 11, C/c = 12, D/d = 13, E/e = 14, F/f = 15

**Conversion Example:**
- `0x1A` in hexadecimal = (1 × 16¹) + (10 × 16⁰) = 16 + 10 = `26` in decimal

### 4. Binary Literals (Base 2)

Binary is a base-2 number system, fundamental to how computers work internally.

**Characteristics:**
- Uses only digits 0 and 1
- Must be prefixed with `0b` or `0B`
- Useful for bit manipulation and understanding binary operations

**Example:**
```java
int binary = 0b1111;   // Binary literal (equals 15 in decimal)
int flags = 0b101010;  // Binary representation
int mask = 0b11110000;
```

**Conversion:**
- `0b1111` in binary = (1 × 2³) + (1 × 2²) + (1 × 2¹) + (1 × 2⁰) = 8 + 4 + 2 + 1 = `15` in decimal

### Comparing Number Systems

Here's how the same value looks in different number systems:

| Decimal | Binary | Octal | Hexadecimal |
|---------|--------|-------|-------------|
| 10 | 0b1010 | 012 | 0xA |
| 15 | 0b1111 | 017 | 0xF |
| 100 | 0b1100100 | 0144 | 0x64 |
| 255 | 0b11111111 | 0377 | 0xFF |

**Example in Code:**
```java
int dec = 100;         // Decimal
int bin = 0b1100100;   // Binary (same value)
int oct = 0144;        // Octal (same value)
int hex = 0x64;        // Hexadecimal (same value)

// All four variables hold the same value: 100
```

## Floating-Point Literals

Floating-point literals represent numbers with fractional parts (decimal numbers). They are essential for precise calculations involving decimals.

### Types of Floating-Point Literals

### 1. Float Literals

**Characteristics:**
- Must end with `F` or `f`
- Single-precision (32-bit)
- Less precise than double

**Example:**
```java
float price = 19.99f;
float temperature = -15.5f;
float pi = 3.14f;
```

**Without the 'f' suffix:**
```java
float price = 19.99;   // Error: incompatible types
float price = 19.99f;  // Correct
```

### 2. Double Literals

**Characteristics:**
- Can optionally end with `D` or `d`
- Double-precision (64-bit)
- Default type for decimal literals
- More precise than float

**Example:**
```java
double weight = 65.7;
double distance = 123.456;
double precise = 3.14159265359;
```

**With 'd' suffix (optional):**
```java
double value = 100.5d;  // Valid but 'd' is optional
double value = 100.5;   // Same as above (preferred)
```

### Scientific Notation

Both float and double support scientific notation using `e` or `E`:

**Format:** `mantissa e exponent`

**Example:**
```java
double scientific = 1.234e2;   // 1.234 × 10² = 123.4
double small = 5.67e-3;        // 5.67 × 10⁻³ = 0.00567
float large = 3.4e5f;          // 3.4 × 10⁵ = 340000.0
```

**Breaking Down Scientific Notation:**
- `1.234e2` means 1.234 × 10²
- `e2` means "times 10 to the power of 2"
- `e-3` means "times 10 to the power of -3"

### Comparison: Float vs Double Literals

```java
// Float examples (requires 'f')
float f1 = 3.14f;
float f2 = 1.23e5f;

// Double examples (no suffix needed)
double d1 = 3.14159265359;
double d2 = 1.23e5;
```

## Character Literals

Character literals represent single characters and are enclosed in single quotes.

### Basic Character Literals

**Characteristics:**
- Must be enclosed in single quotes `' '`
- Can contain letters, digits, or symbols
- Represents a single character only

**Example:**
```java
char letter = 'a';
char symbol = '%';
char digit = '5';
char space = ' ';
```

### Escape Sequences

Special characters can be represented using escape sequences (backslash followed by a character):

**Common Escape Sequences:**

| Escape Sequence | Meaning | Example |
|----------------|---------|---------|
| `\n` | Newline | `char newline = '\n';` |
| `\t` | Tab | `char tab = '\t';` |
| `\\` | Backslash | `char backslash = '\\';` |
| `\'` | Single quote | `char quote = '\'';` |
| `\"` | Double quote | `char dquote = '\"';` |
| `\r` | Carriage return | `char cr = '\r';` |
| `\b` | Backspace | `char bs = '\b';` |

**Example:**
```java
System.out.println("Hello\nWorld");  // Prints on two lines
System.out.println("Name:\tJohn");   // Tab between Name: and John
```

### Unicode Character Literals

Java supports Unicode, allowing representation of characters from any language or special symbols.

**Format:** `\uXXXX` where XXXX is a 4-digit hexadecimal number

**Example:**
```java
char unicodeChar = '\u000d';  // Carriage return
char heart = '\u2665';        // ♥ symbol
char euro = '\u20AC';         // € symbol
char smiley = '\u263A';       // ☺ symbol
```

### Important Distinctions

```java
char single = 'A';      // Character literal (single quotes)
String text = "A";      // String literal (double quotes)

char digit = '5';       // Character '5'
int number = 5;         // Number 5

char space = ' ';       // Valid (space character)
char empty = '';        // Invalid (empty character literal)
```

## String Literals

String literals are sequences of characters enclosed in double quotes. Strings are technically objects in Java, not primitive types, but string literals are so commonly used that they deserve special attention.

### Basic String Literals

**Characteristics:**
- Enclosed in double quotes `" "`
- Can contain multiple characters or be empty
- Can include escape sequences

**Example:**
```java
String name = "Jack";
String number = "12345";
String empty = "";           // Empty string (valid)
String sentence = "Hello, World!";
```

### Strings with Escape Sequences

Strings can contain escape sequences for special formatting:

```java
String newLine = "\n";                    // Newline character
String path = "C:\\Users\\Documents";     // Windows file path
String quote = "He said \"Hello\"";       // Embedded quotes
String multiLine = "Line 1\nLine 2\nLine 3";
```

### String vs Character

**Key Difference:**
- **String** uses double quotes and can hold multiple characters
- **Character** uses single quotes and holds exactly one character

```java
String text = "Hello";      // String with 5 characters
char letter = 'H';          // Single character

String oneChar = "A";       // String with one character (still a String)
char singleChar = 'A';      // Character

String empty = "";          // Valid empty string
char empty = '';            // Invalid (char must have exactly one character)
```

### Common String Literal Uses

```java
// User messages
String greeting = "Welcome to Java!";

// Error messages
String error = "File not found";

// Data representation
String email = "user@example.com";
String phone = "123-456-7890";

// Multi-line text using escape sequences
String address = "123 Main Street\nAnytown, USA\n12345";
```

## Boolean Literals

Boolean literals represent truth values and are the simplest type of literals in Java.

### The Two Boolean Values

**Characteristics:**
- Only two possible values: `true` or `false`
- Keywords are lowercase
- Used for logical operations and conditions

**Example:**
```java
boolean isJavaFun = true;
boolean isFishMammal = false;
boolean hasLicense = true;
boolean isMinor = false;
```

### Important Rules

**Case Sensitivity:**
```java
boolean correct = true;     // Correct
boolean wrong = True;       // Error: cannot find symbol
boolean wrong = TRUE;       // Error: cannot find symbol
```

**No Numeric Representation:**

Unlike some languages, Java does NOT allow numeric values for boolean:

```java
boolean flag = 1;           // Error: incompatible types
boolean flag = 0;           // Error: incompatible types
boolean flag = true;        // Correct
```

### Boolean Literals in Action

**Conditional Statements:**
```java
boolean isRaining = true;

if (isRaining) {
    System.out.println("Take an umbrella");
}
```

**Logical Operations:**
```java
boolean hasTicket = true;
boolean hasID = false;

boolean canEnter = hasTicket && hasID;  // false (both must be true)
boolean allowed = hasTicket || hasID;   // true (at least one is true)
```

**Comparison Results:**
```java
boolean isAdult = (age >= 18);          // Result is true or false
boolean isPassing = (score > 60);       // Result is true or false
```

## Using Underscores in Numeric Literals

Java allows underscores in numeric literals to improve readability, especially for large numbers.

### Valid Uses of Underscores

**Making Large Numbers Readable:**
```java
int million = 1_000_000;           // Much easier to read than 1000000
long creditCard = 1234_5678_9012_3456L;
int binary = 0b1010_1010_1111_0000;
double pi = 3.141_592_653_589;
```

**Grouping Digits:**
```java
long phoneNumber = 555_123_4567L;
int hexColor = 0xFF_EC_DE;
int socialSecurity = 123_45_6789;
```

### Invalid Uses of Underscores

There are specific restrictions on where you can place underscores:

**1. Cannot Start or End with Underscore:**
```java
int invalid = _1000;       // Error: illegal underscore
int invalid = 1000_;       // Error: illegal underscore
int valid = 1_000;         // Correct
```

**2. Cannot Place Adjacent to Decimal Point:**
```java
float invalid = 6_.674F;   // Error: illegal underscore
float invalid = 6._674F;   // Error: illegal underscore
float valid = 6.6_74F;     // Correct
```

**3. Cannot Place Adjacent to Suffixes:**
```java
long invalid = 1000_L;     // Error: illegal underscore
float invalid = 3.14_f;    // Error: illegal underscore
long valid = 1_000L;       // Correct
float valid = 3.1_4f;      // Correct
```

**4. Cannot Use Before or After Prefix:**
```java
int invalid = 0_x52;       // Error: illegal underscore
int invalid = 0x_52;       // Error: illegal underscore
int valid = 0x5_2;         // Correct
```

### Summary of Underscore Rules

**Valid Examples:**
```java
int billion = 1_000_000_000;
long bytes = 0b1111_1111_1111_1111L;
double precise = 3.141_592_653_589;
int hex = 0xFF_EC_DE_5E;
```

**Invalid Examples:**
```java
int wrong1 = _1000;        // Can't start with underscore
int wrong2 = 1000_;        // Can't end with underscore
float wrong3 = 6_.74F;     // Can't be adjacent to decimal
long wrong4 = 1000_L;      // Can't be adjacent to suffix
```

## Null Literal

While not a primitive type, the `null` literal is an important concept in Java.

### What is Null?

**Definition:**
A null literal represents the absence of an object reference. It indicates that a reference variable is not currently pointing to any object.

**Characteristics:**
- Only applicable to reference types (objects, not primitives)
- Commonly assigned to indicate "no object"
- Lowercase keyword

**Example:**
```java
String name = null;        // String reference pointing to nothing
Object obj = null;         // Object reference with no object
Integer num = null;        // Integer object reference is null
```

### Null vs Empty

**Important Distinction:**
```java
String nullString = null;      // No object exists
String emptyString = "";       // Object exists, but contains no characters

// nullString has no object at all
// emptyString is an actual String object that happens to be empty
```

### Null with Primitives

**Cannot use null with primitive types:**
```java
int number = null;         // Error: incompatible types
boolean flag = null;       // Error: incompatible types

Integer number = null;     // Correct (Integer is an object wrapper)
Boolean flag = null;       // Correct (Boolean is an object wrapper)
```

### Common Use Cases

```java
String userName = null;    // Will be set later

if (userName == null) {
    userName = "Guest";
}

Object result = findUser();
if (result != null) {
    // Process the result
}
```

## Frequently Asked Questions (FAQs) on Literals

### 1. What are literals in Java?

**Answer:**
Literals are fixed values that are assigned directly to variables in the source code. They represent constant data that appears literally in your program, such as numbers, characters, or text strings.

**Example:**
```java
int age = 25;          // 25 is a literal
String name = "John";  // "John" is a literal
```

### 2. Can literals be changed during program execution?

**Answer:**
No, literals themselves are constants and cannot be changed once defined. However, the variables that hold these literals can be reassigned to new literal values.

**Example:**
```java
int count = 10;        // 10 is a literal (cannot change)
count = 20;            // 20 is a new literal assigned to count (variable changes)
```

The literal `10` remains `10`, but the variable `count` can now hold a different literal value.

### 3. What is a real literal?

**Answer:**
Real literals represent floating-point numbers (numbers with decimal points). They are also called floating-point literals.

**Example:**
```java
double price = 12.34;      // Real/floating-point literal
float weight = 1.23e3f;    // Real literal in scientific notation
```

Real literals can be of type `float` or `double` and may use scientific notation.

### 4. What is a null literal?

**Answer:**
A null literal represents the absence of an object reference. It is commonly assigned to reference variables to indicate they don't currently point to any object.

**Example:**
```java
String text = null;        // null literal
Object obj = null;         // Indicates no object exists
```

**Important:** `null` can only be used with reference types (objects), not with primitive types.

### 5. Why do we need different types of literals?

**Answer:**
Different literal types serve different purposes:
- **Integer literals** for whole numbers
- **Floating-point literals** for decimal numbers
- **Character literals** for single characters
- **String literals** for text
- **Boolean literals** for true/false values

This variety allows precise representation of different kinds of data in your programs.

### 6. What's the difference between '5' and 5?

**Answer:**
- `'5'` (in single quotes) is a character literal representing the character '5'
- `5` (without quotes) is an integer literal representing the number 5

```java
char charFive = '5';       // Character '5' (ASCII/Unicode value)
int numFive = 5;           // Number 5 (can do math with it)
```

### 7. Can I use underscores anywhere in numeric literals?

**Answer:**
No, there are restrictions:
- Cannot start or end with underscore
- Cannot place adjacent to decimal point
- Cannot place adjacent to L, F, or D suffixes
- Cannot place adjacent to 0x, 0b, or 0 prefixes

```java
int valid = 1_000_000;     // Correct
int invalid = 1000_;       // Error
```

## Summary: Key Takeaways

1. **Literals are Fixed Values**: They represent constant data written directly in code
2. **Five Main Types**: Integer, Floating-point, Character, String, and Boolean
3. **Integer Literals**: Can be expressed in decimal, binary, octal, or hexadecimal
4. **Floating-Point Literals**: Include float (with 'f') and double (default for decimals)
5. **Character Literals**: Single characters in single quotes, support Unicode
6. **String Literals**: Text sequences in double quotes
7. **Boolean Literals**: Only `true` or `false` (no numeric values)
8. **Underscores for Readability**: Can be used in numbers but with restrictions
9. **Null Literal**: Represents absence of object reference
10. **Type Matching**: Literals must match the data type of the variable

Understanding literals is essential because:
- They are the building blocks of data in your programs
- Proper use prevents type mismatch errors
- Different literal types serve different purposes
- They make code more readable and maintainable

---

*Master literals to write clearer, more expressive Java code!*