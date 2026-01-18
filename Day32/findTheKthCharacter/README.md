# 📌 Problem: Find the K-th Character in String Game I

## Description
You are given a string game where characters expand following specific rules.  
Return the `k`-th character in the final generated string without building the entire string.

## Pattern
Recursion / Simulation

## Difficulty
Medium

## Approach
1. Observe how the string grows at each step.
2. Use recursion to trace back the origin of the `k`-th character.
3. Avoid constructing the full string to save memory.
4. Base case returns the original character.

## Platform
LeetCode
