# 📌 Problem: Count Complete Tree Nodes

## Description
Given the root of a complete binary tree,  
return the number of nodes in the tree.

A complete binary tree is a tree in which every level is completely filled except possibly the last,  
and all nodes are as far left as possible.

## Pattern
Tree / Binary Search / DFS

## Difficulty
Medium

## Approach
1. Compute the height of the leftmost path.
2. Compute the height of the rightmost path.
3. If both heights are equal:
   - The tree is perfect.
   - Number of nodes = 2^height - 1.
4. Otherwise:
   - Recursively count nodes in left and right subtrees.
5. Return the total count.

## Platform
LeetCode
