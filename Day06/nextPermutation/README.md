# Problem: Next Permutation

## Description
Given an array of integers, rearrange numbers into the lexicographically next greater permutation.

### Pattern
Arrays / Greedy

### Difficulty
Medium

### Approach
1. Find the first decreasing element from the right.
2. Find the element just larger than it and swap.
3. Reverse the elements to the right to get the next permutation.

### Time Complexity
O(n)

### Space Complexity
O(1)

### Platform
LeetCode
