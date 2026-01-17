# 📌 Problem: Sqrt(x)

## Description
Given a non-negative integer `x`, return the square root of `x` rounded down to the nearest integer.

Do not use any built-in exponent function or operator.

## Pattern
Binary Search / Math

## Difficulty
Easy

## Approach
1. Use binary search between `0` and `x`.
2. Find the largest integer whose square is less than or equal to `x`.
3. Avoid overflow by using long data type.
4. Return the final integer value.

## Platform
LeetCode
