

# 📌 Problem: Maximum Product of Splitted Binary Tree

## Description
Given the root of a binary tree,  
split the binary tree into two subtrees by removing one edge such that  
the product of the sums of the two subtrees is maximized.

Return the maximum product modulo 10^9 + 7.

## Pattern
Tree / DFS / Postorder Traversal

## Difficulty
Medium

## Approach
1. Perform a DFS to compute the total sum of all nodes in the tree.
2. During postorder traversal, compute the sum of each subtree.
3. For each subtree, calculate:
   subtreeSum * (totalSum - subtreeSum).
4. Track the maximum product found.
5. Return the maximum product modulo 10^9 + 7.

## Platform
LeetCode
