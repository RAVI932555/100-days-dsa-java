# 📌 Problem: Gray Code

## Description
Given an integer `n`, return a sequence of Gray codes for `n` bits where two consecutive values differ by only one bit.

## Pattern
Bit Manipulation / Recursion

## Difficulty
Medium

## Approach
1. Start with an initial list containing `0`.
2. For each bit position:
   - Traverse the current list in reverse order.
   - Add `(1 << i)` to each element and append it.
3. This ensures only one-bit difference between adjacent numbers.

## Platform
LeetCode
