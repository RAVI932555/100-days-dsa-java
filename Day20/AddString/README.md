# 📌 Problem: Add Strings

## Description
Given two non-negative integers `num1` and `num2` represented as strings, return their sum as a string.

You must solve the problem without converting the input strings directly into integers.

## Pattern
String / Simulation

## Difficulty
Easy

## Approach
1. Use two pointers starting from the end of both strings.
2. Add digits along with carry.
3. Store the result digit and update carry.
4. Reverse the constructed string to get the final answer.

## Time Complexity
O(max(n, m))

## Space Complexity
O(max(n, m))

## Platform
LeetCode
