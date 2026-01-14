# 📌 Problem: Combinations

## Description
Given two integers `n` and `k`, return all possible combinations of `k` numbers chosen from the range `1` to `n`.

You may return the answer in any order.

## Pattern
Backtracking / Recursion

## Difficulty
Medium

## Approach
1. Use backtracking to generate combinations.
2. Start from a given number and explore further numbers to build a combination.
3. Add a combination to the result when its size becomes `k`.
4. Backtrack by removing the last added number and try the next possibility.
5. Ensure numbers are chosen in increasing order to avoid duplicates.

## Time Complexity
O(C(n, k))

## Space Complexity
O(k) (excluding result storage)

## Platform
LeetCode
