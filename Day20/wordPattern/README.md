# 📌 Problem: Word Pattern

## Description
Given a pattern and a string `s`, determine if `s` follows the same pattern.

Each character in the pattern must map to exactly one word in the string.

## Pattern
HashMap / String Mapping

## Difficulty
Easy

## Approach
1. Split the string into words.
2. Use a HashMap to map each pattern character to a word.
3. Ensure one-to-one mapping by checking both forward and reverse mappings.
4. Return false if any mismatch occurs.

## Time Complexity
O(n)

## Space Complexity
O(n)

## Platform
LeetCode
