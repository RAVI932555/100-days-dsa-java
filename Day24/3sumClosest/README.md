# 📌 Problem: 3Sum Closest

## Description
Given an integer array `nums` and an integer `target`, return the sum of the three integers in `nums` such that the sum is closest to `target`.

You may assume that each input would have exactly one solution.

## Pattern
Two Pointers / Sorting

## Difficulty
Medium

## Approach
1. Sort the array.
2. Fix one element and use two pointers to find the closest sum.
3. Update the closest sum based on the current difference.
4. Move pointers according to comparison with the target.
5. Return the closest sum found.

## Time Complexity
O(n²)

## Space Complexity
O(1)

## Platform
LeetCode
