# 📌 Problem: Maximum Square Area by Removing Fences From a Field

## Description
You are given the positions of horizontal and vertical fences in a rectangular field.  
By removing some fences, determine the **maximum possible area of a square** that can be formed.

## Pattern
Greedy / Sorting

## Difficulty
Medium

## Approach
1. Include boundary fences in both horizontal and vertical arrays.
2. Sort the fence positions.
3. Calculate all possible gaps between consecutive fences.
4. Find the largest common gap that exists in both directions.
5. The square area is the square of that gap.

## Time Complexity
O(n log n)

## Space Complexity
O(n)

## Platform
LeetCode
