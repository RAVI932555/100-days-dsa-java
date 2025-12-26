# Problem: Permutation in String

## Description
Given two strings `s1` and `s2`, return `true` if `s2` contains a **permutation of `s1`**,  
otherwise return `false`.

## Pattern
Sliding Window / Strings

## Difficulty
Medium

## Approach
1. Use a frequency array to store character counts of `s1`.
2. Apply a sliding window of length `s1.length()` on `s2`.
3. Maintain a frequency array for the current window.
4. Compare both frequency arrays at each step.
5. If they match, a permutation exists.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Platform
LeetCode
