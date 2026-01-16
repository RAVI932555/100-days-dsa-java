# 📌 Problem: Maximize Area of Square Hole in Grid

## Description
You are given a grid with horizontal and vertical bars removed at specific positions.  
Find the **maximum area of a square hole** that can be formed in the grid.

## Pattern
Greedy / Array Processing

## Difficulty
Medium

## Approach
1. Sort the removed horizontal and vertical bars.
2. Find the longest consecutive sequence in both directions.
3. The side length of the square is determined by the minimum of:
   - Maximum consecutive horizontal gaps
   - Maximum consecutive vertical gaps
4. Return the square of the side length.

## Time Complexity
O(n log n)

## Space Complexity
O(1)

## Platform
LeetCode
