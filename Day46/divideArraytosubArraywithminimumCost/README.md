# 📌 Problem: Divide Array Into Subarrays With Minimum Cost

## Description
Given an integer array `nums` and integers `k` and `dist`,  
divide the array into subarrays of size `k` such that the **total cost is minimized**.

The cost of a subarray is defined based on the given problem constraints.

## Pattern
Greedy / Sliding Window / Heap

## Difficulty
Medium

## Approach
1. Fix the first element as required by the problem.
2. Use a sliding window of size `dist` to consider valid elements.
3. Maintain the smallest `k-1` elements using a min-heap.
4. Compute the cost as the sum of chosen elements.
5. Slide the window and update the heap efficiently.
6. Track the minimum possible cost.

## Platform
LeetCode
