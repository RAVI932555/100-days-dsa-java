# 📌 Problem: Balance a Binary Search Tree

## Description
Given the root of a binary search tree (BST),  
return a **balanced BST** with the same node values.

A balanced BST is a tree where the depth difference between left and right subtrees of every node is at most one.

## Pattern
Tree / BST / Divide and Conquer

## Difficulty
Medium

## Approach
1. Perform an inorder traversal of the BST to collect all node values in sorted order.
2. Use the sorted list to construct a balanced BST.
3. Choose the middle element as the root.
4. Recursively build left and right subtrees from the remaining elements.
5. Return the new balanced BST.

## Platform
LeetCode
