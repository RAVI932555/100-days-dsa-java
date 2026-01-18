# 📌 Problem: Elimination Game

## Description
You are given an integer `n`. Start with a list of numbers from `1` to `n`.  
In each round, remove every second number, alternating the direction (left to right, then right to left) until only one number remains.  
Return the last remaining number.

## Pattern
Math / Simulation

## Difficulty
Medium

## Approach
1. Observe the pattern instead of simulating the full list.
2. Track:
   - Current head
   - Step size
   - Remaining elements
   - Direction of elimination
3. Update the head when eliminating from left or when remaining count is odd.
4. Continue until only one number remains.

## Platform
LeetCode
