# 📌 Problem: Contains Duplicate II

## Description
Given an integer array `nums` and an integer `k`,  
return `true` if there are two distinct indices `i` and `j` such that:
- `nums[i] == nums[j]`
- `|i - j| <= k`

Otherwise, return `false`.

## Pattern
Array / Hashing / Sliding Window

## Difficulty
Easy

## Approach
1. Use a HashMap to store the most recent index of each number.
2. Traverse the array from left to right.
3. For each element:
   - If it already exists in the map, check the index difference.
   - If the difference is `<= k`, return `true`.
4. Update the index of the current element in the map.
5. If no such pair is found, return `false`.

## Platform
LeetCode
