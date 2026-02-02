# 📌 Problem: Divide an Array Into Subarrays

## Description
Given an integer array `nums`, determine whether it is possible to divide the array into subarrays (pairs) such that each subarray contains equal elements.

Return `true` if the array can be divided accordingly, otherwise return `false`.

## Pattern
Hashing / Counting

## Difficulty
Easy

## Approach
1. Use a HashMap to count the frequency of each element.
2. Traverse the frequency map.
3. If any element appears an odd number of times, return `false`.
4. If all elements have even frequencies, return `true`.

## Platform
LeetCode
