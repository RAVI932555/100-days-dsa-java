# 📌 Problem: Fibonacci Number

## Description
The Fibonacci numbers are defined as follows:

- `F(0) = 0`
- `F(1) = 1`
- `F(n) = F(n - 1) + F(n - 2)` for `n > 1`

Given an integer `n`, return `F(n)`.

## Pattern
Recursion / Dynamic Programming

## Difficulty
Easy

## Approach
1. Handle base cases for `n = 0` and `n = 1`.
2. Use an iterative approach to avoid recursion overhead.
3. Update previous two values to compute the next Fibonacci number.
4. Return the final value.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Platform
LeetCode
