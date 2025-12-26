# Problem: Two Sum

## Description
Given an array of integers `nums` and an integer `target`,  
return indices of the two numbers such that they add up to `target`.

You may assume that each input has exactly one solution.

## Pattern
Hashing / Arrays

## Difficulty
Easy

## Approach
1. Use a HashMap to store numbers and their indices.
2. For each element, calculate `target - nums[i]`.
3. If the complement exists in the map, return both indices.
4. Otherwise, store the current element in the map.

## Time Complexity
O(n)

## Space Complexity
O(n)

## Platform
LeetCode
