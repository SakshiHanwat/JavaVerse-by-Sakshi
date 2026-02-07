# While Loop

## Overview

A while loop is an entry-controlled control flow structure in programming that repeatedly executes a block of code as long as a specified condition remains true. The loop continues to iterate while the condition is true and terminates once the condition evaluates to false. The while loop is one of the fundamental looping constructs and is particularly useful when the number of iterations is not predetermined but depends on a dynamic condition.

## Basic Syntax

```java
while (condition) {
    // code block to be executed
}
```

## How It Works

The while loop follows a specific execution pattern:

1. **Check Condition:** The condition is evaluated before each iteration
2. **Evaluate:** If the condition evaluates to true, the loop body executes
3. **Repeat:** After executing the loop body, control returns to step 1
4. **Terminate:** If the condition evaluates to false, the loop terminates and execution continues with the code after the loop

Since the while loop is entry-controlled, it's possible that the loop body may never execute if the condition is false from the beginning.

## Execution Flow

```
START
  |
  v
Check Condition?
  |
  +---> FALSE --> EXIT LOOP
  |
  +---> TRUE --> Execute Loop Body
                    |
                    v
              Return to Check Condition
```

## Example 1: Printing "Hi" Multiple Times

To print "Hi" four times using a while loop, you can use a counter variable that increments with each iteration. This counter helps control the number of times the loop executes, preventing infinite loops.

### Example Code:

```java
int i = 0;  // Initialize counter variable

while (i < 4) {  // Loop continues while i is less than 4
    System.out.println("Hi");
    i++;  // Increment counter
}
```

**Output:**
```
Hi
Hi
Hi
Hi
```

### Execution Breakdown:

| Iteration | i Value | Condition (i < 4) | Action |
|-----------|---------|-------------------|--------|
| 1 | 0 | true | Print "Hi", increment i |
| 2 | 1 | true | Print "Hi", increment i |
| 3 | 2 | true | Print "Hi", increment i |
| 4 | 3 | true | Print "Hi", increment i |
| 5 | 4 | false | Exit loop |

### Explanation:

- **Counter Variable:** The counter variable i is initialized to 0
- **Loop Condition:** The condition i < 4 ensures the loop runs only four times
- **Loop Body:** The System.out.println("Hi"); statement prints "Hi" during each iteration
- **Increment:** The counter i increments by 1 after each iteration (i++), eventually making the condition false and terminating the loop

## Example 2: Nested While Loops

Nested while loops allow you to create more complex iteration patterns. A nested loop runs inside another loop, with the inner loop completing all its iterations before the outer loop proceeds to the next iteration.

### Use Case: Printing "Hello" After "Hi"

To print "Hello" three times after each "Hi", you can use nested while loops:

### Example Code with Explanation:

```java
int i = 0;  // Outer loop counter

while (i < 4) {  // Outer loop: runs 4 times
    System.out.println("Hi");
    
    int j = 0;  // Inner loop counter
    while (j < 3) {  // Inner loop: runs 3 times for each outer iteration
        System.out.println("Hello " + (j + 1));
        j++;  // Increment inner loop counter
    }
    
    i++;  // Increment outer loop counter
}
```

**Output:**
```
Hi
Hello 1
Hello 2
Hello 3
Hi
Hello 1
Hello 2
Hello 3
Hi
Hello 1
Hello 2
Hello 3
Hi
Hello 1
Hello 2
Hello 3
```

### Execution Breakdown:

**Outer Loop Iteration 1 (i = 0):**
- Print "Hi"
- Inner Loop executes 3 times:
  - j = 0: Print "Hello 1"
  - j = 1: Print "Hello 2"
  - j = 2: Print "Hello 3"

**Outer Loop Iteration 2 (i = 1):**
- Print "Hi"
- Inner Loop executes 3 times (j resets to 0):
  - j = 0: Print "Hello 1"
  - j = 1: Print "Hello 2"
  - j = 2: Print "Hello 3"

And so on for iterations 3 and 4...

### How Nested Loops Work:

1. **Outer Loop Starts:** The outer loop counter i is initialized
2. **Outer Loop Body:** The outer loop body executes
3. **Inner Loop Begins:** The inner loop counter j is initialized to 0
4. **Inner Loop Execution:** The inner loop runs completely (all 3 iterations)
5. **Inner Loop Resets:** When the outer loop proceeds to the next iteration, the inner loop counter j is reset
6. **Repeat:** The process repeats until the outer loop condition becomes false

### Key Points About Nested Loops:

- **Independent Counters:** Each loop has its own counter variable (i for outer, j for inner)
- **Inner Loop Resets:** The inner loop counter resets for each outer loop iteration
- **Total Iterations:** In this example, the outer loop runs 4 times, and the inner loop runs 3 times for each outer iteration, resulting in 4 × 3 = 12 total "Hello" prints

## Controlling Loop Execution

### Using break Statement

The break statement immediately exits the loop when a certain condition is met:

```java
int i = 0;

while (i < 10) {
    if (i == 5) {
        break;  // Exit the loop when i equals 5
    }
    System.out.println(i);
    i++;
}
```

**Output:**
```
0
1
2
3
4
```

### Using continue Statement

The continue statement skips the current iteration and proceeds to the next iteration:

```java
int i = 0;

while (i < 5) {
    i++;
    if (i == 3) {
        continue;  // Skip this iteration
    }
    System.out.println(i);
}
```

**Output:**
```
1
2
4
5
```

## Common While Loop Patterns

### Pattern 1: Counter-Based Loop

```java
int count = 0;
while (count < 5) {
    System.out.println("Count: " + count);
    count++;
}
```

Use when you need to execute something a specific number of times.

### Pattern 2: Condition-Based Loop

```java
int number = 10;
while (number > 0) {
    System.out.println(number);
    number--;
}
```

Use when the loop continuation depends on a changing condition.

### Pattern 3: Input Validation Loop

```java
Scanner scanner = new Scanner(System.in);
int input = -1;

while (input < 0 || input > 100) {
    System.out.println("Enter a number between 0 and 100:");
    input = scanner.nextInt();
}
```

Use when you need to repeatedly ask for input until valid input is received.

## Avoiding Infinite Loops

An infinite loop occurs when the condition never becomes false. This causes the program to run indefinitely. Always ensure that:

1. **The condition will eventually become false**
2. **The loop counter or condition variable is updated correctly**

### Example of an Infinite Loop (AVOID):

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    // i is never incremented, so i < 5 is always true
    // This loop will run forever
}
```

### Correct Implementation:

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;  // Increment i to eventually make the condition false
}
```

## While Loop vs for Loop

| Aspect | while Loop | for Loop |
|--------|-----------|----------|
| **Syntax** | Simple, condition-based | More structured |
| **Initialization** | Outside loop | Inside loop declaration |
| **Increment/Decrement** | Must be explicit | Automatic in the loop header |
| **Best Used** | Unknown number of iterations | Known number of iterations |
| **Entry-Controlled** | Yes | Yes |
| **Readability** | Good for conditional loops | Good for counted loops |

## Key Points to Remember

- **Entry-Controlled:** The while loop is entry-controlled, meaning the condition is checked before entering the loop body. The loop body may never execute if the condition is initially false.

- **Condition Critical:** The loop condition is crucial and determines the loop's behavior. It must be properly designed to eventually become false.

- **Counter Management:** When using a counter-based while loop, ensure the counter is properly initialized and incremented to avoid infinite loops.

- **Nested Loops:** Nested while loops can create complex iteration patterns. Remember that the inner loop completes all iterations before the outer loop moves to the next iteration.

- **Break and Continue:** These control statements can be used to manage loop execution more precisely, allowing early exit or skipping of iterations.

- **Independence of Variables:** In nested loops, each loop should have its own independent counter variable.

- **Loop Efficiency:** While loops are efficient for scenarios where the iteration count is not predetermined and depends on dynamic conditions.

## Best Practices

1. Always initialize the loop condition variable before the loop
2. Ensure the loop condition will eventually become false
3. Use meaningful variable names for loop counters
4. Keep loop bodies simple and focused
5. Avoid modifying loop counters in unexpected ways
6. Use break and continue judiciously
7. Test loops with various input conditions
8. Consider using for loops when the iteration count is known in advance
9. Add comments to explain complex loop logic
10. Be cautious with nested loops to avoid performance issues

## Real-World Applications

- Reading data until a sentinel value is encountered
- Processing user input validation
- Searching through collections
- Simulating game loops
- Polling for a condition
- Reading files line by line
- Waiting for a resource to become available

## Conclusion

The while loop is a versatile and essential control structure for iterating through code blocks when the number of iterations depends on a dynamic condition. By understanding how to use it correctly with proper condition management and counter updates, you can write clean and efficient code. Whether used for simple counter-based iterations or complex nested loop patterns, the while loop remains one of the most commonly used looping constructs in programming.