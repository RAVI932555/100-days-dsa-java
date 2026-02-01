# 📌 Problem: Implement Queue Using Stacks

## Description
Implement a queue using two stacks.  
The implemented queue should support all standard operations:
- `push`
- `pop`
- `peek`
- `empty`

## Pattern
Stack / Design

## Difficulty
Easy

## Approach
1. Use two stacks:
   - `inStack` for enqueue operations
   - `outStack` for dequeue operations
2. On `push(x)`:
   - Push the element into `inStack`.
3. On `pop()` or `peek()`:
   - If `outStack` is empty, move all elements from `inStack` to `outStack`.
   - Pop or peek from `outStack`.
4. `empty()` checks if both stacks are empty.

## Platform
LeetCode
