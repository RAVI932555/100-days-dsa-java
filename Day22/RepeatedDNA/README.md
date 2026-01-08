# 📌 Problem: Repeated DNA Sequences

## Description
Given a string `s` that represents a DNA sequence, return all the  
10-letter-long sequences (substrings) that occur more than once.

## Pattern
Hashing / Sliding Window

## Difficulty
Medium

## Approach
1. Use a HashSet to store seen substrings of length 10.
2. Traverse the string using a sliding window of size 10.
3. If a substring is already present in the set, add it to the result set.
4. Return all repeated sequences.

## Time Complexity
O(n)

## Space Complexity
O(n)

## Platform
LeetCode
