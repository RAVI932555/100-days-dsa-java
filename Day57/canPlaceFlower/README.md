# 📌 Problem: Can Place Flowers

## Description
You have a flowerbed represented as an array containing `0`s and `1`s,  
where `0` means empty and `1` means planted.

You cannot plant flowers in adjacent plots.

Given an integer `n`, return `true` if you can plant `n` new flowers without violating the rule, otherwise return `false`.

## Pattern
Array / Greedy

## Difficulty
Easy

## Approach
1. Traverse the array from left to right.
2. For each position, check:
   - Current plot is `0`
   - Left neighbor (if exists) is `0`
   - Right neighbor (if exists) is `0`
3. If valid, plant a flower (set to `1`) and decrease `n`.
4. Continue until `n == 0` or array ends.
5. Return `true` if all flowers are placed, otherwise `false`.

## Platform
LeetCode
