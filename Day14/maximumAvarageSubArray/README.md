# Problem: Maximum Average Subarray I

## Description
You are given an integer array `nums` consisting of `n` elements,  
and an integer `k`.  
Find a contiguous subarray of length `k` that has the **maximum average value**  
and return this value.

## Pattern
Sliding Window / Arrays

## Difficulty
Easy

## Approach
1. Calculate the sum of the first `k` elements.
2. Use a sliding window to move across the array.
3. Subtract the element leaving the window and add the new element.
4. Track the maximum sum during traversal.
5. Return the maximum sum divided by `k`.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Platform
LeetCode
