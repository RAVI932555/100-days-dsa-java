# 📌 Problem: N-Queens

## Description
The n-queens puzzle is the problem of placing `n` queens on an `n x n` chessboard such that no two queens attack each other.

Return all distinct solutions to the n-queens puzzle.

## Pattern
Backtracking / Recursion

## Difficulty
Hard

## Approach
1. Use backtracking to place queens row by row.
2. Track occupied columns and diagonals to avoid conflicts.
3. Place a queen only if it is safe.
4. Store the board configuration when all queens are placed.
5. Backtrack to explore other possibilities.

## Time Complexity
O(n!)

## Space Complexity
O(n)

## Platform
LeetCode
