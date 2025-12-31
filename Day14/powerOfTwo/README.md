# Problem: Power of Two

## Description
Given an integer `n`, return `true` if it is a power of two.  
Otherwise, return `false`.

An integer `n` is a power of two if there exists an integer `x` such that  
`n == 2^x`.

## Pattern
Bit Manipulation / Math

## Difficulty
Easy

## Approach
1. A power of two has exactly one set bit in its binary representation.
2. Use the condition: `n > 0 && (n & (n - 1)) == 0`.
3. If true, the number is a power of two.

## Time Complexity
O(1)

## Space Complexity
O(1)

## Platform
LeetCode
