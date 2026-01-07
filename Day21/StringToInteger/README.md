# 📌 Problem: String to Integer (atoi)

## Description
Implement the `atoi` function, which converts a string to a 32-bit signed integer.

The function should:
- Ignore leading whitespace
- Handle optional `+` or `-` sign
- Read digits until a non-digit character is encountered
- Clamp the result within the 32-bit signed integer range

## Pattern
String / Simulation

## Difficulty
Medium

## Approach
1. Skip leading whitespace characters.
2. Check for optional sign (`+` or `-`).
3. Convert digit characters into an integer.
4. Handle overflow and underflow conditions.
5. Return the final integer value.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Platform
LeetCode
