# Problem: Binary Search

## Description
Given a sorted array of integers and a target value,  
return the index of the target if it exists. Otherwise, return `-1`.

## Pattern
Binary Search / Arrays

## Difficulty
Easy

## Approach
1. Initialize two pointers: `low` and `high`.
2. Calculate the middle index.
3. If the middle element equals the target, return its index.
4. If the target is smaller, search the left half.
5. If the target is larger, search the right half.
6. Repeat until the search space is exhausted.

## Time Complexity
O(log n)

## Space Complexity
O(1)

## Platform
LeetCode
