# 📌 Problem: Climbing Stairs

## Description
You are climbing a staircase. It takes `n` steps to reach the top.  
Each time you can either climb `1` or `2` steps.  
Return the number of distinct ways to reach the top.

## Pattern
Dynamic Programming

## Difficulty
Easy

## Approach
1. This problem follows the Fibonacci pattern.
2. Define:
   - `dp[i] = dp[i-1] + dp[i-2]`
3. Use bottom-up DP or optimize space using two variables.
4. Return `dp[n]`.

## Platform
LeetCode
