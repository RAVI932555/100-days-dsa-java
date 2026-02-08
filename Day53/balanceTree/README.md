# 📌 Problem: Balanced Binary Tree

## Description
Given a binary tree,  
determine whether it is **height-balanced**.

A binary tree is height-balanced if the depth difference between the left and right subtrees of every node is at most one.

## Pattern
Tree / DFS / Recursion

## Difficulty
Easy

## Approach
1. Use post-order traversal to calculate subtree heights.
2. For each node, compute the height of left and right subtrees.
3. If the height difference exceeds `1`, the tree is unbalanced.
4. Return both balance status and height during recursion.
5. If all nodes satisfy the condition, return `true`.

## Platform
LeetCode
