# 📌 Problem: Monotonic Array

## Description
An array is monotonic if it is either entirely non-increasing or non-decreasing.  
Given an integer array `nums`, return `true` if the array is monotonic, otherwise return `false`.

## Pattern
Array Traversal

## Difficulty
Easy

## Approach
1. Initialize two flags:
   - `increasing`
   - `decreasing`
2. Traverse the array once.
3. If `nums[i] > nums[i+1]`, it cannot be increasing.
4. If `nums[i] < nums[i+1]`, it cannot be decreasing.
5. If either condition holds throughout, return `true`.

## Platform
LeetCode
s