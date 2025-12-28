# Problem: Product of Array Except Self

## Description
Given an integer array `nums`, return an array `answer` such that  
`answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`.

The solution must be completed **without using division**.

## Pattern
Prefix Product / Arrays

## Difficulty
Medium

## Approach
1. Create an output array initialized with 1.
2. Traverse from left to right to store prefix products.
3. Traverse from right to left to multiply suffix products.
4. Combine prefix and suffix products for the final result.

## Time Complexity
O(n)

## Space Complexity
O(1) (excluding output array)

## Platform
LeetCode
