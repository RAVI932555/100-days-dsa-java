# Problem: Find the Duplicate Number

## Description
Given an array of integers where one number appears more than once, find the duplicate number without modifying the array.

### Pattern
Array / Fast & Slow Pointers (Floyd’s Cycle Detection)

### Difficulty
Medium

### Approach
1. Treat array values as pointers.
2. Use slow and fast pointers to detect a cycle.
3. Find the entry point of the cycle, which is the duplicate number.

### Time Complexity
O(n)

### Space Complexity
O(1)

### Platform
LeetCode
