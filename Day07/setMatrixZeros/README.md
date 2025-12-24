# Problem: Set Matrix Zeroes

## Description
Given an `m x n` integer matrix, if an element is `0`, set its **entire row and column** to `0`.  
The operation must be done **in-place**.

## Pattern
Arrays / Matrix

## Difficulty
Medium

## Approach
1. Use the first row and first column as markers.
2. Traverse the matrix and mark rows and columns that need to be zeroed.
3. Update the matrix based on the markers.
4. Handle the first row and first column separately.

## Time Complexity
O(m × n)

## Space Complexity
O(1)

## Platform
LeetCode
