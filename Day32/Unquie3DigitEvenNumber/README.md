# 📌 Problem: Unique Three Digit Even Numbers

## Description
Given an array of digits, return the number of **unique three-digit even numbers** that can be formed using the digits.  
Each digit can be used **only once** in a number, and the number must not start with zero.

## Pattern
Brute Force / Set

## Difficulty
Easy

## Approach
1. Generate all permutations of three different indices.
2. Ensure:
   - The first digit is not zero
   - The last digit is even
3. Store valid numbers in a set to avoid duplicates.
4. Return the size of the set.

## Platform
LeetCode
