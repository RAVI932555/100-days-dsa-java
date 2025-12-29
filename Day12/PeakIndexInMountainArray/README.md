# Problem: Peak Index in a Mountain Array

## Description
An array is a mountain array if:
- It has at least 3 elements.
- It strictly increases then strictly decreases.

Find the index of the **peak element**.

## Pattern
Binary Search / Arrays

## Difficulty
Easy

## Approach
1. Apply binary search on the array.
2. Compare the middle element with the next element.
3. If the next element is greater, move right.
4. Otherwise, move left.
5. The remaining index is the peak.

## Time Complexity
O(log n)

## Space Complexity
O(1)

## Platform
LeetCode
