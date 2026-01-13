# 📌 Problem: Subsets II

## Description
Given an integer array `nums` that may contain duplicates, return all possible subsets.

The solution set must not contain duplicate subsets.

## Pattern
Backtracking / Sorting

## Difficulty
Medium

## Approach
1. Sort the array to group duplicate elements.
2. Use backtracking to generate subsets.
3. Skip duplicate elements at the same recursion level.
4. Add each valid subset to the result list.

## Time Complexity
O(2ⁿ)

## Space Complexity
O(n)

## Platform
LeetCode
