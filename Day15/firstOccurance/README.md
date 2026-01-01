# Problem: Find the Index of the First Occurrence in a String

## Description
Given two strings `haystack` and `needle`,  
return the index of the **first occurrence** of `needle` in `haystack`.  
If `needle` is not part of `haystack`, return `-1`.

## Pattern
Strings / Two Pointers

## Difficulty
Easy

## Approach
1. Iterate through the `haystack` string.
2. For each index, check if the substring starting there matches `needle`.
3. If a match is found, return the index.
4. If no match exists, return `-1`.

## Time Complexity
O(n × m)

## Space Complexity
O(1)

## Platform
LeetCode
