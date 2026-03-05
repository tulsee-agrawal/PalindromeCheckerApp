# Palindrome Checker App
## UC12 – Strategy Pattern for Palindrome Algorithms

- Demonstrates selecting different palindrome validation algorithms at runtime using the Strategy Design Pattern
- Focuses on algorithm interchangeability and extensible design
- Currently includes a stack-based strategy implementation

## How It Works
### Design Overview

- Define a common PalindromeStrategy interface
- Implement concrete strategies 
- Execute the selected algorithm via the common interface

### Main Class Flow

- Create an instance of the chosen strategy (StackStrategy)
- Call check(input) on the strategy
- Print whether the input is a palindrome

### Current Strategy: Stack-Based

- Push all characters of the string onto a stack
- Iterate again and compare each character with stack.pop()
- If any mismatch occurs → return false
- If all match → return true

## Example

- Input: level
- Output: true

## Technologies


- Strategy Design Pattern
- Stack 

## Files

- UC12_PalindromeCheckerApp.java
  - PalindromeStrategy (interface)
  - StackStrategy (concrete implementation)

## Author

Tulsee Agrawal
