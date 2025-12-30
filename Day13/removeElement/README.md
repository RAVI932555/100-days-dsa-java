# Problem: Remove Element

## Description
Given an integer array `nums` and an integer `val`, remove all occurrences of `val` **in-place**.  
Return the number of elements remaining after removal.

The order of elements may be changed.

## Pattern
Two Pointers / Arrays

## Difficulty
Easy

## Approach
1. Use a pointer `k` to track the position for valid elements.
2. Traverse the array.
3. If the current element is not equal to `val`, place it at index `k`.
4. Increment `k` and continue.
5. Return `k` as the new length.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Platform
LeetCode
