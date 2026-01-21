# 📌 Problem: Valid Sudoku

## Description
Determine if a `9 × 9` Sudoku board is valid.  
Only the filled cells need to be validated according to Sudoku rules:
- Each row must contain digits `1–9` without repetition.
- Each column must contain digits `1–9` without repetition.
- Each `3 × 3` sub-box must contain digits `1–9` without repetition.

## Pattern
Hash Set / Matrix Traversal

## Difficulty
Medium

## Approach
1. Use hash sets to track numbers in:
   - Each row
   - Each column
   - Each 3 × 3 sub-box
2. Traverse the board cell by cell.
3. If a duplicate is found in any row, column, or box, return `false`.
4. Ignore empty cells (`'.'`).

## Platform
LeetCode
