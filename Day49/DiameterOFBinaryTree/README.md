# 📌 Problem: Diameter of Binary Tree

## Description
Given the root of a binary tree,  
return the length of the diameter of the tree.

The diameter is the length of the longest path between any two nodes in a tree.  
This path may or may not pass through the root.

## Pattern
Tree / DFS / Recursion

## Difficulty
Easy

## Approach
1. Use depth-first search to calculate the height of each node.
2. At each node, compute the diameter as:
   left subtree height + right subtree height.
3. Maintain a global variable to track the maximum diameter found.
4. Return the height of the current node to its parent.
5. After traversal, return the maximum diameter.

## Platform
LeetCode
