# Problem: Two Sum II – Input Array Is Sorted

## Description
Given a **1-indexed sorted array** of integers and a target value,  
find two numbers such that they add up to the target and return their indices.

Exactly one solution exists.

## Pattern
Two Pointers / Arrays

## Difficulty
Medium

## Approach
1. Initialize two pointers: `left` at start and `right` at end.
2. Calculate the sum of elements at both pointers.
3. If the sum equals the target, return indices.
4. If the sum is smaller, move the left pointer right.
5. If the sum is larger, move the right pointer left.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Platform
LeetCode
