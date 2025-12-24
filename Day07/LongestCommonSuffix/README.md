# Problem: Longest Common Prefix

## Description
Write a function to find the **longest common prefix string** amongst an array of strings.  
If there is no common prefix, return an empty string `""`.

## Pattern
Strings / Arrays

## Difficulty
Easy

## Approach
1. Take the first string as the initial prefix.
2. Compare the prefix with each string character by character.
3. Reduce the prefix whenever a mismatch is found.
4. Return the final prefix after checking all strings.

## Time Complexity
O(n × m)

## Space Complexity
O(1)

## Platform
LeetCode
