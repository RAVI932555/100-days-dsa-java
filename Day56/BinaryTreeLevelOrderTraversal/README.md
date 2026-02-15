# 📌 Problem: Binary Tree Level Order Traversal

## Description
Given the root of a binary tree,  
return the level order traversal of its nodes’ values (level by level from left to right).

## Pattern
Tree / BFS / Queue

## Difficulty
Medium

## Approach
1. Use a queue to perform Breadth-First Search (BFS).
2. Add the root node to the queue.
3. While the queue is not empty:
   - Process all nodes at the current level.
   - Store their values in a list.
   - Add their children to the queue.
4. Add each level list to the final result.
5. Return the result.

## Platform
LeetCode
