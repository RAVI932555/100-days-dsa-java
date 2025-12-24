# Problem: Search in Rotated Sorted Array

## Description
Given a rotated sorted array of distinct integers and a target value,  
return the index of the target if it exists, otherwise return `-1`.

## Pattern
Binary Search / Arrays

## Difficulty
Medium

## Approach
1. Use Binary Search to achieve logarithmic time.
2. Determine which half of the array is sorted.
3. Check whether the target lies in the sorted half.
4. Adjust the search space accordingly.

## Time Complexity
O(log n)

## Space Complexity
O(1)

## Platform
LeetCode
