# Problem: Longest Substring Without Repeating Characters

## Description
Given a string, find the length of the longest substring without repeating characters.

### Pattern
Sliding Window + HashSet

### Difficulty
Medium

### Approach
1. Use two pointers to represent a window.
2. Maintain a set to track unique characters.
3. Expand window when characters are unique.
4. Shrink window when a duplicate is found.

### Time Complexity
O(n)

### Space Complexity
O(n)

### Platform
LeetCode
