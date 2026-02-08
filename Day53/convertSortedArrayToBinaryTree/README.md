# 📌 Problem: Convert Sorted Array to Binary Search Tree

## Description
Given an integer array `nums` where the elements are sorted in ascending order,  
convert it into a **height-balanced binary search tree (BST)**.

A height-balanced BST is a binary tree in which the depth of the two subtrees of every node never differs by more than one.

## Pattern
Tree / Divide and Conquer / Recursion

## Difficulty
Easy

## Approach
1. Choose the middle element of the array as the root.
2. Recursively apply the same logic to the left half to build the left subtree.
3. Recursively apply the same logic to the right half to build the right subtree.
4. This ensures the tree remains height-balanced.
5. Return the constructed BST.

## Platform
LeetCode
