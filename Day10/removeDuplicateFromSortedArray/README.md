# Problem: Remove Duplicates from Sorted Array

## Description
Given a sorted array `nums`, remove the duplicates **in-place** such that  
each unique element appears only once and return the new length.

## Pattern
Two Pointers / Arrays

## Difficulty
Easy

## Approach
1. Use two pointers: one for tracking unique elements and one for traversal.
2. Compare the current element with the previous unique element.
3. If different, place it in the next unique position.
4. Continue until the end of the array.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Platform
LeetCode
