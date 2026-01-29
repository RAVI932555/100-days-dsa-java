# 📌 Problem: Implement Stack Using Queues

## Description
Implement a stack using one or two queues.  
The implemented stack should support `push`, `pop`, `top`, and `empty` operations.

## Pattern
Queue / Simulation

## Difficulty
Easy

## Approach
1. Use a single queue.
2. On `push(x)`:
   - Add `x` to the queue.
   - Rotate the queue so that `x` comes to the front.
3. On `pop()`:
   - Remove the front element.
4. `top()` returns the front element.
5. `empty()` checks if the queue is empty.

## Platform
LeetCode
