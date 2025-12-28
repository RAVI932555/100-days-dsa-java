# Problem: Single Element in a Sorted Array

## Description
You are given a sorted array consisting of pairs of equal elements,  
except for one element that appears only once.  
Find and return that single element.

## Pattern
Binary Search / Arrays

## Difficulty
Medium

## Approach
1. Use binary search to reduce time complexity.
2. Check the middle index and compare it with its neighbor.
3. Use index parity (even/odd) to decide which half to search.
4. Continue until the single element is found.

## Time Complexity
O(log n)

## Space Complexity
O(1)

## Platform
LeetCode
