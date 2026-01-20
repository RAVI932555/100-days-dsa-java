# 📌 Problem: Guess Number Higher or Lower

## Description
You are guessing a number between `1` and `n`.  
Each guess is responded to using an API:
- `-1` if the picked number is lower
- `1` if the picked number is higher
- `0` if the picked number is correct  

Return the number that was picked.

## Pattern
Binary Search

## Difficulty
Easy

## Approach
1. Apply binary search between `1` and `n`.
2. Check the middle value using the given API.
3. Narrow the search space based on the API response.
4. Continue until the correct number is found.

## Platform
LeetCode
