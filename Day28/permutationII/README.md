# 📌 Problem: Permutations II

## Description
Given a collection of numbers that might contain duplicates, return all possible unique permutations.

## Pattern
Backtracking / Sorting

## Difficulty
Medium

## Approach
1. Sort the array to group duplicate elements.
2. Use backtracking to generate permutations.
3. Skip duplicate elements at the same recursion level.
4. Track used elements to avoid repetition.
5. Store only unique permutations.

## Time Complexity
O(n!)

## Space Complexity
O(n)

## Platform
LeetCode
