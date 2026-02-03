# 📌 Problem: Same Tree

## Description
Given the roots of two binary trees `p` and `q`,  
determine whether the two trees are identical.

Two binary trees are considered the same if they have the same structure and node values.

## Pattern
Tree / Recursion / DFS

## Difficulty
Easy

## Approach
1. If both nodes are `null`, return `true`.
2. If one node is `null` and the other is not, return `false`.
3. If node values are different, return `false`.
4. Recursively check left and right subtrees.
5. Return `true` only if all corresponding nodes match.

## Platform
LeetCode
