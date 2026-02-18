# 📌 Problem: Maximum Level Sum of a Binary Tree

## Description
Given the root of a binary tree,  
return the level (1-indexed) with the maximum sum of node values.

If multiple levels have the same maximum sum, return the smallest level number.

## Pattern
Tree / BFS / Level Order Traversal

## Difficulty
Medium

## Approach
1. Use BFS (queue) to traverse the tree level by level.
2. For each level:
   - Compute the sum of node values.
3. Keep track of the maximum sum and corresponding level.
4. Return the level with the highest sum.

## Platform
LeetCode
