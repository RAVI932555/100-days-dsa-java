# Problem: Sliding Window Maximum

## Description
Given an array and a window size `k`, find the maximum value in each sliding window.

### Pattern
Sliding Window / Deque

### Difficulty
Hard

### Approach
1. Use a deque to store indices of useful elements.
2. Remove elements outside the current window.
3. Maintain decreasing order in the deque.
4. The front of the deque holds the maximum for each window.

### Time Complexity
O(n)

### Space Complexity
O(k)

### Platform
LeetCode
