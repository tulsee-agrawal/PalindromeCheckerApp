# Palindrome Checker App
## UC13 – Performance Comparison (Benchmarking)

- Compares execution time of different palindrome strategies
- Uses high‑precision timing with System.nanoTime()
- Prints the result and execution time for each strategy

## How It Works
### Benchmark Steps

- Choose one or more palindrome strategies 
- Capture start time and end time using System.nanoTime()
- Compute duration = end - start (in nanoseconds)
- Print results for each strategy for the same input

### Current Strategies
- StackStrategy:

   - Push all characters to a stack
   - Pop and compare against original sequence


- DequeStrategy:

   - Add characters to a deque
   - Compare by removing from front and back until done



## Key Concepts

- System.nanoTime() for high‑resolution timing
- Algorithm comparison under the same input and conditions
- Keep I/O outside the timed section for more reliable measurements

## Example (Expected Output Format)

- Input: level
- Stack Strategy → true, XXXXX ns
- Deque Strategy → true, YYYYY ns

## Technologies

- System.nanoTime()
- Stack 
- Deque 

## Files

- UC13_PalindromeCheckerApp.java
    - PalindromeStrategy (interface)
    - StackStrategy (implementation)
    - DequeStrategy (implementation)

## Author

Tulsee Agrawal
