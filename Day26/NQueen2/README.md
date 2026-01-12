# 📌 Problem: N-Queens II

## Description
The n-queens puzzle is the problem of placing `n` queens on an `n x n` chessboard such that no two queens attack each other.

Return the number of distinct solutions to the n-queens puzzle.

## Pattern
Backtracking / Optimization

## Difficulty
Hard

## Approach
1. Use backtracking to place queens row by row.
2. Track columns and diagonals to detect conflicts.
3. Increment the count when all queens are successfully placed.
4. Use pruning to optimize the search space.

## Time Complexity
O(n!)

## Space Complexity
O(n)

## Platform
LeetCode
