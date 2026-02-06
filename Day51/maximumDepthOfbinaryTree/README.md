# 📌 Problem: Maximum Depth of Binary Tree

## Description
Given the root of a binary tree,  
return its **maximum depth**.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

## Pattern
Tree / DFS / Recursion

## Difficulty
Easy

## Approach
1. If the current node is `null`, return `0`.
2. Recursively compute the depth of the left subtree.
3. Recursively compute the depth of the right subtree.
4. Take the maximum of left and right depths.
5. Add `1` for the current node and return the result.

## Platform
LeetCode
