# 📌 Problem: Largest Rectangle in Histogram

## Description
Given an array of integers `heights` representing histogram bar heights,  
find the area of the **largest rectangle** that can be formed in the histogram.

## Pattern
Monotonic Stack

## Difficulty
Hard

## Approach
1. Use a stack to store indices of increasing bar heights.
2. Traverse all bars:
   - When a smaller height is found, pop from the stack.
   - Calculate area using the popped height as the smallest bar.
3. After traversal, process remaining bars in the stack.
4. Track and return the maximum area.

## Platform
LeetCode
