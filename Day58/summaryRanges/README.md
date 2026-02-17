# 📌 Problem: Summary Ranges

## Description
Given a sorted unique integer array `nums`,  
return the smallest sorted list of ranges that cover all the numbers in the array exactly.

Each range should be formatted as:
- "a->b" if a != b
- "a" if a == b

## Pattern
Array / Two Pointers

## Difficulty
Easy

## Approach
1. Traverse the array using a pointer.
2. Mark the start of a range.
3. Continue moving forward while consecutive numbers differ by 1.
4. When the sequence breaks, record the range.
5. Repeat until the array ends.
6. Return the list of formatted ranges.

## Platform
LeetCode
