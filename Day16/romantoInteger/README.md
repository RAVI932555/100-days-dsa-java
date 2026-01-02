# Problem: Roman to Integer

## Description
Given a Roman numeral, convert it to an integer.  
Roman numerals are represented by seven symbols: `I, V, X, L, C, D, M`.

Subtractive cases include:
- `IV` = 4
- `IX` = 9
- `XL` = 40
- `XC` = 90
- `CD` = 400
- `CM` = 900

## Pattern
Strings / Hashing

## Difficulty
Easy

## Approach
1. Map Roman characters to their integer values.
2. Traverse the string from left to right.
3. If the current value is smaller than the next value, subtract it.
4. Otherwise, add it to the result.
5. Return the final integer value.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Platform
LeetCode
