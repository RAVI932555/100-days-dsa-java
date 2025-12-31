# Problem: Minimum Window Substring

## Description
Given two strings `s` and `t`, return the **minimum window substring** of `s`  
such that every character in `t` (including duplicates) is included in the window.  
If no such substring exists, return an empty string.

## Pattern
Sliding Window / Hashing / Strings

## Difficulty
Hard

## Approach
1. Store character frequencies of string `t` in a HashMap.
2. Use two pointers to create a sliding window.
3. Expand the right pointer until all required characters are included.
4. Shrink the left pointer to minimize the window size.
5. Track the smallest valid window.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Platform
LeetCode
