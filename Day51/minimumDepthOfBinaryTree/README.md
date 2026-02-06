# 📌 Problem: Minimum Depth of Binary Tree

## Description
Given the root of a binary tree,  
return its **minimum depth**.

The minimum depth is the number of nodes along the shortest path from the root node to the nearest leaf node.

## Pattern
Tree / DFS / BFS

## Difficulty
Easy

## Approach
1. If the node is `null`, return `0`.
2. If one child is `null`, return the depth of the other child.
3. Recursively compute the minimum depth of both subtrees.
4. Take the minimum valid depth.
5. Add `1` for the current node.

## Platform
LeetCode
