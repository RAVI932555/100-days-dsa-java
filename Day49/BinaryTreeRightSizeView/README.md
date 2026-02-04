# 📌 Problem: Binary Tree Right Side View

## Description
Given the root of a binary tree,  
return the values of the nodes you can see when viewing the tree from the right side, ordered from top to bottom.

## Pattern
Tree / BFS / Level Order Traversal

## Difficulty
Medium

## Approach
1. Perform level-order traversal using a queue.
2. For each level, process all nodes.
3. Capture the value of the last node at each level.
4. Add this value to the result list.
5. Continue until all levels are processed.

## Platform
LeetCode
