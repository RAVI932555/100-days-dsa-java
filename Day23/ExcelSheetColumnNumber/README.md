# 📌 Problem: Excel Sheet Column Number

## Description
Given a string `columnTitle` that represents an Excel column title, return its corresponding column number.

Example:  
"A" → 1  
"Z" → 26  
"AA" → 27

## Pattern
Math / String Processing

## Difficulty
Easy

## Approach
1. Initialize a result variable to 0.
2. Traverse each character in the string.
3. Convert the character to its numeric value (`'A'` → 1, `'B'` → 2, etc.).
4. Multiply the result by 26 and add the current value.
5. Return the final number.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Platform
LeetCode
