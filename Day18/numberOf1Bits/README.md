
# Problem: Number of 1 Bits

## Description
Given an integer `n`, return the number of `1` bits  
(also known as the **Hamming weight**).

## Pattern
Bit Manipulation

## Difficulty
Easy

## Approach
1. Initialize a counter to `0`.
2. While `n` is not zero:
   - Increment the counter if the least significant bit is `1`.
   - Right shift `n` by one.
3. Return the counter.

*(Alternative: Use `n & (n - 1)` to remove the lowest set bit.)*

## Time Complexity
O(1)

## Space Complexity
O(1)

## Platform
LeetCode
