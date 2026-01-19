# 📌 Problem: Add Digits

## Description
Given a non-negative integer `num`, repeatedly add all its digits until the result has only one digit, and return it.

## Pattern
Math / Digital Root

## Difficulty
Easy

## Approach
1. If the number is `0`, return `0`.
2. Use the digital root formula:
   - `1 + (num - 1) % 9`
3. This gives the result in constant time without loops.

## Platform
LeetCode
