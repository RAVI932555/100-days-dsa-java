# Problem: Container With Most Water

## Description
Given an array where each element represents the height of a vertical line, find two lines that together with the x-axis form a container holding the maximum amount of water.

### Example
Input: [1,8,6,2,5,4,8,3,7]  
Output: 49

### Pattern
Two Pointers

### Difficulty
Medium

### Approach
- Use two pointers starting from both ends.
- Calculate area using width × minimum height.
- Move the pointer with the smaller height to maximize area.

### Time Complexity
O(n)

### Space Complexity
O(1)

### Platform
LeetCode
