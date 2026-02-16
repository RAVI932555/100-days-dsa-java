# 📌 Problem: Array Partition

## Description
Given an integer array of `2n` integers,  
group these integers into `n` pairs such that the sum of the minimum of each pair is maximized.

Return the maximum possible sum.

## Pattern
Greedy / Sorting

## Difficulty
Easy

## Approach
1. Sort the array in ascending order.
2. Pair adjacent elements.
3. Add every alternate element (starting from index 0) to the sum.
4. Return the computed sum.

## Platform
LeetCode
