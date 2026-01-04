# Problem: Four Divisors

## Description
Given an integer array `nums`,  
return the sum of divisors of all numbers that have **exactly four divisors**.

If a number does not have exactly four divisors, it is ignored.

## Pattern
Math / Arrays

## Difficulty
Medium

## Approach
1. For each number, iterate from `1` to `√n`.
2. Count divisors and track their sum.
3. If a divisor pair is found, add both values.
4. If the total divisor count is exactly `4`, add the divisor sum to the result.

## Time Complexity
O(n √k)

## Space Complexity
O(1)

## Platform
LeetCode
