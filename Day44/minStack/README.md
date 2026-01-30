# 📌 Problem: Min Stack

## Description
Design a stack that supports `push`, `pop`, `top`, and retrieving the **minimum element** in constant time.

## Pattern
Stack / Design

## Difficulty
Easy

## Approach
1. Use two stacks:
   - One stack for normal values
   - One stack to track the minimum values
2. On `push(x)`:
   - Push `x` to the main stack
   - Push `min(x, currentMin)` to the min stack
3. On `pop()`:
   - Pop from both stacks
4. `top()` returns the top of the main stack
5. `getMin()` returns the top of the min stack

## Platform
LeetCode
