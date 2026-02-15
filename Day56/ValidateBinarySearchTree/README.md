# 📌 Problem: Validate Binary Search Tree

## Description
Given the root of a binary tree,  
determine if it is a valid Binary Search Tree (BST).

A BST is valid if:
- The left subtree of a node contains only nodes with values less than the node’s value.
- The right subtree contains only nodes with values greater than the node’s value.
- Both left and right subtrees must also be BSTs.

## Pattern
Tree / DFS / Recursion

## Difficulty
Medium

## Approach
1. Use recursion with value boundaries (min, max).
2. For each node:
   - Ensure its value is strictly between allowed min and max.
3. Recursively validate:
   - Left subtree with updated max boundary.
   - Right subtree with updated min boundary.
4. If any node violates the constraint, return `false`.
5. If all nodes satisfy the condition, return `true`.

## Platform
LeetCode
