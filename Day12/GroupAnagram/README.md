# Problem: Group Anagrams

## Description
Given an array of strings, group the anagrams together.  
You can return the answer in any order.

## Pattern
Hashing / Strings

## Difficulty
Medium

## Approach
1. Use a HashMap to group strings.
2. Generate a key for each string by sorting characters or using a frequency count.
3. Add each string to its corresponding anagram group.
4. Return all grouped anagrams.

## Time Complexity
O(n × m log m)

## Space Complexity
O(n)

## Platform
LeetCode
