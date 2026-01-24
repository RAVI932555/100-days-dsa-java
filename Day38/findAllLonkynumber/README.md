# 📌 Problem: Find All Lonely Numbers in the Array

## Description
Given an integer array `nums`, a number is **lonely** if:
- It appears exactly once
- Its adjacent numbers (`num - 1` and `num + 1`) do not appear in the array

Return all lonely numbers in any order.

## Pattern
Hash Set / Counting

## Difficulty
Medium

## Approach
1. Use a hash map to count the frequency of each number.
2. Iterate through the array.
3. A number is lonely if:
   - Its frequency is `1`
   - `num - 1` and `num + 1` are not present in the map
4. Add lonely numbers to the result list.

## Platform
LeetCode
