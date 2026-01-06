# Problem: Maximum Matrix Sum

## Description
You are given an `n x n` matrix.  
You can change the sign of any element any number of times.

Return the **maximum possible sum** of the matrix after performing the operations.

## Pattern
Greedy / Math / Matrix

## Difficulty
Medium

## Approach
1. Traverse the matrix and calculate the sum of absolute values.
2. Count the number of negative elements.
3. Track the minimum absolute value in the matrix.
4. If the count of negative numbers is odd, subtract twice the minimum absolute value from the sum.
5. Return the final result.

## Time Complexity
O(n²)

## Space Complexity
O(1)

## Platform
LeetCode
