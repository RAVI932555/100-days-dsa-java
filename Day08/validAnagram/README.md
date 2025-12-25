# Problem: Valid Anagram

## Description
Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`,  
and `false` otherwise.

## Pattern
Hashing / Strings

## Difficulty
Easy

## Approach
1. If lengths of both strings are different, return false.
2. Use a HashMap or frequency array to count character occurrences.
3. Increment count for characters in `s` and decrement for `t`.
4. If all counts are zero, the strings are anagrams.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Platform
LeetCode
