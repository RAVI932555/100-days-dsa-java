# 📌 Problem: Valid Parentheses

## Description
Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['`, and `']'`,  
determine if the input string is valid.

A string is valid if:
- Open brackets are closed by the same type
- Open brackets are closed in the correct order

## Pattern
Stack

## Difficulty
Easy

## Approach
1. Use a stack to store opening brackets.
2. Traverse the string character by character.
3. If an opening bracket is found, push it onto the stack.
4. If a closing bracket is found:
   - Check if the stack is empty
   - Pop and verify it matches the closing bracket
5. At the end, the stack should be empty for a valid string.

## Platform
LeetCode
