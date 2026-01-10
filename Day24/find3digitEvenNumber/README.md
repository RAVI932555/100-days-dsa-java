# 📌 Problem: Finding Three-Digit Even Numbers

## Description
Given an array of digits, return all unique three-digit even numbers that can be formed using the digits.

Each digit may be used only once in each number, and the result should not contain duplicates.

## Pattern
Brute Force / Combinatorics

## Difficulty
Easy

## Approach
1. Generate all permutations of three digits.
2. Ensure the first digit is non-zero.
3. Ensure the last digit is even.
4. Use a set to avoid duplicate numbers.
5. Return the sorted result.

## Time Complexity
O(n³)

## Space Complexity
O(n)

## Platform
LeetCode
