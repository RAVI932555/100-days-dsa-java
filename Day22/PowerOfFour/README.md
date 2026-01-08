# 📌 Problem: Power of Four

## Description
Given an integer `n`, return `true` if it is a power of four.  
Otherwise, return `false`.

An integer `n` is a power of four if there exists an integer `x` such that  
`n == 4^x`.

## Pattern
Bit Manipulation / Math

## Difficulty
Easy

## Approach
1. Check if `n` is greater than zero.
2. Ensure `n` has only one set bit (`n & (n - 1) == 0`).
3. Verify that the set bit is in the correct position for powers of four.
4. Return the result based on the conditions.

## Time Complexity
O(1)

## Space Complexity
O(1)

## Platform
LeetCode
