# 📌 Problem: Counting Bits

## Description
Given an integer `n`, return an array `ans` of length `n + 1` where  
`ans[i]` is the number of `1`s in the binary representation of `i`.

## Pattern
Dynamic Programming / Bit Manipulation

## Difficulty
Easy

## Approach
1. Use the relation:  
   `ans[i] = ans[i / 2] + (i % 2)`
2. Build the result array from `0` to `n`.
3. Return the populated array.

## Time Complexity
O(n)

## Space Complexity
O(n)

## Platform
LeetCode
