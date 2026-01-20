# 📌 Problem: Contains Duplicate

## Description
Given an integer array `nums`, return `true` if any value appears at least twice in the array.  
Return `false` if every element is distinct.

## Pattern
Hash Set

## Difficulty
Easy

## Approach
1. Use a `HashSet` to store visited elements.
2. If an element already exists in the set, return `true`.
3. Otherwise, add the element to the set.
4. If no duplicates are found, return `false`.

## Platform
LeetCode
