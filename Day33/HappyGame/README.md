# 📌 Problem: Happy Number

## Description
Write an algorithm to determine if a number `n` is happy.  
A happy number is defined by repeatedly replacing the number with the sum of the squares of its digits until it becomes `1` or loops endlessly.

## Pattern
Hash Set / Two Pointers

## Difficulty
Easy

## Approach
1. Replace the number with the sum of squares of its digits.
2. Use a `HashSet` to detect cycles.
3. If the number becomes `1`, return `true`.
4. If a repeated number appears, return `false`.

## Platform
LeetCode
