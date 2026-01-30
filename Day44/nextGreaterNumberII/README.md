# 📌 Problem: Next Greater Element II

## Description
Given a circular integer array `nums`, return the next greater number for every element.  
If no greater number exists, return `-1` for that element.

## Pattern
Monotonic Stack

## Difficulty
Medium

## Approach
1. Use a stack to maintain indices of elements.
2. Traverse the array **twice** to simulate circular behavior.
3. While the stack is not empty and the current element is greater than the stack top:
   - Update the result for that index
4. Push indices only during the first pass.
5. Elements left without a greater value get `-1`.

## Platform
LeetCode
