# 📌 Problem: Lowest Common Ancestor of a Binary Tree

## Description
Given a binary tree, find the **lowest common ancestor (LCA)** of two given nodes `p` and `q`.

The lowest common ancestor is defined as the lowest node in the tree that has both `p` and `q` as descendants  
(where a node can be a descendant of itself).

## Pattern
Tree / DFS / Recursion

## Difficulty
Medium

## Approach
1. If the current node is `null`, return `null`.
2. If the current node is equal to `p` or `q`, return the current node.
3. Recursively search for `p` and `q` in the left and right subtrees.
4. If both left and right recursive calls return non-null values, the current node is the LCA.
5. Otherwise, return the non-null result from either subtree.

## Platform
LeetCode
