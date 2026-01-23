# 📌 Problem: Check Knight Tour Configuration

## Description
You are given a `n × n` chessboard representing a knight’s tour.  
Check whether the given configuration is a valid knight’s tour.

A knight’s tour is valid if the knight visits every cell exactly once following valid knight moves.

## Pattern
Simulation / Matrix Traversal

## Difficulty
Medium

## Approach
1. Start from the cell containing `0`.
2. For each next number, verify that the move follows a valid knight move:
   - (±2, ±1) or (±1, ±2)
3. Ensure all numbers from `0` to `n² - 1` are visited exactly once.
4. If all moves are valid, return `true`; otherwise, return `false`.

## Platform
LeetCode
