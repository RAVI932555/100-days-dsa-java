# 📌 Problem: Target Sum

## Description
Given an integer array `nums` and an integer `target`, return the number of ways to assign `+` and `-` symbols such that the total sum equals `target`.

## Pattern
Recursion / Dynamic Programming

## Difficulty
Medium

## Approach
1. Use recursion to try both `+` and `-` for each element.
2. Track the remaining target at each step.
3. When all elements are processed, check if the target becomes `0`.
4. Optimize using Dynamic Programming by converting it into a subset sum problem.

## Platform
LeetCode
