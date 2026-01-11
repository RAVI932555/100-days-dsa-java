# 📌 Problem: Number of Centered Subarrays

## Description
Given an integer array `nums`, count the number of **centered subarrays**.

A centered subarray is defined as a subarray where the middle element is the maximum element in that subarray.

## Pattern
Arrays / Brute Force / Observation

## Difficulty
Medium

## Approach
1. Identify the maximum element in the array.
2. For each occurrence of the maximum element, treat it as the center.
3. Expand left and right while maintaining valid subarray conditions.
4. Count all possible centered subarrays.
5. Return the total count.

## Time Complexity
O(n²)

## Space Complexity
O(1)

## Platform
LeetCode
