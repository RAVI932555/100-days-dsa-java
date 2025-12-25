# Problem: Maximize Happiness of Selected Children

## Description
You are given an array representing happiness values of children and an integer `k`.  
Select `k` children such that the **total happiness is maximized**,  
where after selecting a child, the happiness of remaining children decreases by `1`.

## Pattern
Greedy / Sorting

## Difficulty
Medium

## Approach
1. Sort the happiness array in descending order.
2. Iterate through the first `k` elements.
3. For each selected child, add `max(happiness[i] - i, 0)` to the result.
4. Stop when happiness becomes zero.

## Time Complexity
O(n log n)

## Space Complexity
O(1)

## Platform
LeetCode
