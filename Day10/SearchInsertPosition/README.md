# Problem: Search Insert Position

## Description
Given a sorted array of distinct integers and a target value,  
return the index if the target is found.  
If not, return the index where it would be inserted in order.

## Pattern
Binary Search / Arrays

## Difficulty
Easy

## Approach
1. Use binary search on the sorted array.
2. Compare the target with the middle element.
3. Adjust the search boundaries accordingly.
4. When the search ends, the `low` pointer gives the insert position.

## Time Complexity
O(log n)

## Space Complexity
O(1)

## Platform
LeetCode
