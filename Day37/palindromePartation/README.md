# 📌 Problem: Palindrome Partitioning

## Description
Given a string `s`, partition `s` such that every substring of the partition is a palindrome.  
Return all possible palindrome partitioning of `s`.

## Pattern
Backtracking / Recursion

## Difficulty
Medium

## Approach
1. Use backtracking to explore all possible partitions.
2. At each step, check if the current substring is a palindrome.
3. If it is valid, add it to the current partition and recurse.
4. Backtrack by removing the last substring to explore other possibilities.

## Platform
LeetCode
