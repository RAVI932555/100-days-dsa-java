# 📌 Problem: Longest Balanced Subarray I

## Description
Given a binary array consisting of `0`s and `1`s,  
find the length of the longest contiguous subarray with an equal number of `0`s and `1`s.

## Pattern
Array / Prefix Sum / Hashing

## Difficulty
Medium

## Approach
1. Treat `0` as `-1` and `1` as `+1`.
2. Maintain a running prefix sum while traversing the array.
3. Use a HashMap to store the first occurrence of each prefix sum.
4. If the same prefix sum appears again, the subarray between them is balanced.
5. Track and update the maximum length found.

## Platform
LeetCode
