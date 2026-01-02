# Problem: N-Repeated Element in Size 2N Array

## Description
You are given an integer array of size `2N` where exactly one element  
is repeated `N` times.  
Return the element repeated `N` times.

## Pattern
Arrays / Hashing

## Difficulty
Easy

## Approach
1. Traverse the array.
2. Use a HashSet to track seen elements.
3. If an element is already present in the set, return it.
4. The first duplicate encountered is the answer.

## Time Complexity
O(n)

## Space Complexity
O(n)

## Platform
LeetCode
