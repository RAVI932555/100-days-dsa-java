# 📌 Problem: Longest Palindromic Substring

## Description
Given a string `s`, return the longest palindromic substring in `s`.

## Pattern
Two Pointers / Expand Around Center

## Difficulty
Medium

## Approach
1. Consider each character (and gap between characters) as a potential center.
2. Expand outward while the characters match.
3. Track the maximum length palindrome found.
4. Return the longest palindromic substring.

## Time Complexity
O(n²)

## Space Complexity
O(1)

## Platform
LeetCode
