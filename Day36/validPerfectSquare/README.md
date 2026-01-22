# 📌 Problem: Valid Perfect Square

## Description
Given a positive integer `num`, return `true` if `num` is a perfect square.  
Do not use any built-in square root function.

## Pattern
Binary Search / Math

## Difficulty
Easy

## Approach
1. Use binary search between `1` and `num`.
2. Check if `mid × mid == num`.
3. If the square is greater, move left; otherwise, move right.
4. Use `long` to avoid overflow.

## Platform
LeetCode
