# 📌 Problem: Remove Duplicate Letters

## Description
Given a string `s`, remove duplicate letters so that every letter appears once and only once.  
You must ensure the result is the **smallest in lexicographical order** among all possible results.

## Pattern
Stack / Greedy

## Difficulty
Medium

## Approach
1. Count the frequency of each character.
2. Use a stack to build the result string.
3. Track visited characters to avoid duplicates.
4. While the stack top is greater than the current character and appears later again, pop it.
5. Push the current character and mark it as visited.

## Platform
LeetCode
