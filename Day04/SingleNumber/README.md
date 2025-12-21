# Problem: Single Number

## Description
Given a non-empty array of integers where every element appears twice except for one, find the element that appears only once.

### Pattern
Bit Manipulation (XOR)

### Difficulty
Easy

### Approach
1. Initialize result = 0.
2. XOR all elements of the array.
3. Duplicate numbers cancel out, leaving the single number.

### Time Complexity
O(n)

### Space Complexity
O(1)

### Platform
LeetCode
