# 📌 Problem: Minimum Deletions to Make String Balanced

## Description
Given a string `s` consisting only of characters `'a'` and `'b'`,  
return the minimum number of deletions required to make the string balanced.

A string is considered balanced if there is no pair of indices `(i, j)` such that  
`i < j`, `s[i] = 'b'`, and `s[j] = 'a'`.

## Pattern
String / Greedy / Prefix-Suffix

## Difficulty
Medium

## Approach
1. Traverse the string from left to right.
2. Keep a count of the number of `'b'` characters seen so far.
3. For each `'a'`, decide whether to:
   - Delete the `'a'`, or
   - Delete all previous `'b'` characters.
4. Maintain the minimum deletions at each step.
5. Return the final minimum deletion count.

## Platform
LeetCode
