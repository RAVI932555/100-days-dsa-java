# 📌 Problem: Next Greater Element I

## Description
You are given two arrays `nums1` and `nums2`.  
For each element in `nums1`, find the next greater element in `nums2`.  
The next greater element is the first greater number to the right.

## Pattern
Monotonic Stack

## Difficulty
Easy

## Approach
1. Traverse `nums2` using a stack.
2. Maintain a decreasing stack.
3. When a greater element is found, map it as the next greater element.
4. Use a hashmap to store results.
5. Build the result array for `nums1` using the map.

## Platform
LeetCode
