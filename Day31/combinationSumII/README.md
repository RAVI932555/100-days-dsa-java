# 📌 Problem: Combination Sum II

## Description
Given a collection of candidate numbers `candidates` (which may contain duplicates) and a target number `target`, return all unique combinations where the chosen numbers sum to `target`.

Each number may be used **only once** in the combination.

## Pattern
Backtracking

## Difficulty
Medium

## Approach
1. Sort the input array to handle duplicates.
2. Use backtracking to explore combinations.
3. Skip duplicate elements at the same recursion level.
4. Move to the next index after choosing an element (no repetition allowed).
5. Add the combination when the target becomes `0`.

## Platform
LeetCode
