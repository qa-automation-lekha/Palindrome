---

# Palindrome Number Checker

## Description

**Palindromenumber** is a simple Java console application that checks whether a given integer is a **palindrome**. A number is considered a palindrome if it reads the same backward as forward (e.g., 121, 1331, 9889).

## Features

- Prompts the user to input an integer.
- Reverses the digits of the input number.
- Compares the reversed number with the original.
- Displays whether the number is a palindrome or not.

## What is a Palindrome?

A **palindrome number** is a number that remains the same when its digits are reversed.

**Examples:**
- 121 → Palindrome
- 123 → Not a Palindrome
- 12321 → Palindrome

## How It Works

1. The program reads an integer from the user.
2. It uses a `while` loop to reverse the digits of the number.
3. It then compares the reversed number with the original number.
4. Based on the comparison, it prints the result.

## Requirements

- Java 8 or higher

## How to Run

1. Save the code as `Palindromenumber.java`.
2. Open a terminal or command prompt and navigate to the file location.
3. Compile the program:
   ```bash
   javac Palindromenumber.java
   ```
4. Run the program:
   ```bash
   java Palindromenumber
   ```

## Example Output

```
Enter the number to check palindrome or not: 
12321
The reversed number is: 12321
The given number is Palindrome
```

## License

This project is licensed under the MIT License.

---
