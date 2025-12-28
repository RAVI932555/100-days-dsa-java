# Problem: Subarray Sum Equals K

## Description
Given an array of integers `nums` and an integer `k`,  
return the total number of continuous subarrays whose sum equals `k`.

## Pattern
Prefix Sum / Hashing

## Difficulty
Medium

## Approach
1. Use a HashMap to store prefix sum frequencies.
2. Traverse the array while maintaining the running sum.
3. Check if `(currentSum - k)` exists in the map.
4. Add its frequency to the result.
5. Update the prefix sum count in the map.

## Time Complexity
O(n)

## Space Complexity
O(n)

## Platform
LeetCode
