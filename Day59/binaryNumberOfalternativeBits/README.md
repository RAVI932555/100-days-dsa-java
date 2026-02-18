# 📌 Problem: Binary Number with Alternating Bits

## Description
Given a positive integer `n`,  
check whether its binary representation has alternating bits.

A number has alternating bits if no two adjacent bits are the same.

## Pattern
Bit Manipulation

## Difficulty
Easy

## Approach
1. Compare the current bit with the next bit.
2. Shift the number to the right in each step.
3. If two adjacent bits are the same, return `false`.
4. If all adjacent bits differ, return `true`.

Alternative approach:
1. Compute `n ^ (n >> 1)`.
2. Check if the result is of the form `111...1`.

## Platform
LeetCode
