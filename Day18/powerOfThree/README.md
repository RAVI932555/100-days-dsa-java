# Problem: Power of Three

## Description
Given an integer `n`, return `true` if it is a power of three.  
Otherwise, return `false`.

An integer `n` is a power of three if there exists an integer `x` such that  
`n == 3^x`.

## Pattern
Math / Recursion

## Difficulty
Easy

## Approach
1. If `n <= 0`, return `false`.
2. Repeatedly divide `n` by `3`.
3. If at any step `n % 3 != 0`, return `false`.
4. If `n` becomes `1`, return `true`.

## Time Complexity
O(log₃ n)

## Space Complexity
O(1)

## Platform
LeetCode
