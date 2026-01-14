# 📌 Problem: Sudoku Solver

## Description
Write a program to solve a Sudoku puzzle by filling the empty cells.

A Sudoku solution must satisfy:
- Each digit `1–9` appears exactly once in each row.
- Each digit `1–9` appears exactly once in each column.
- Each digit `1–9` appears exactly once in each 3×3 sub-grid.

## Pattern
Backtracking / Constraint Satisfaction

## Difficulty
Hard

## Approach
1. Traverse the board to find an empty cell.
2. Try placing digits from `1` to `9`.
3. Check if placing the digit is valid for the row, column, and 3×3 grid.
4. Use backtracking to explore valid configurations.
5. Stop when the board is completely filled.

## Time Complexity
O(9^(n²)) (worst case)

## Space Complexity
O(n²)

## Platform
LeetCode
