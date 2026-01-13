# 📌 Problem: Subsets

## Description
Given an integer array `nums`, return all possible subsets (the power set).

The solution set must not contain duplicate subsets.

## Pattern
Backtracking / Bit Manipulation

## Difficulty
Medium

## Approach
1. Use backtracking to generate all possible subsets.
2. At each index, decide whether to include or exclude the current element.
3. Add the current subset to the result list.
4. Continue until all elements are processed.

## Time Complexity
O(2ⁿ)

## Space Complexity
O(n)

## Platform
LeetCode
