# 📌 Problem: Trionic Array II

## Description
An array is called a **Trionic Array II** if it can be divided into three consecutive non-empty parts:
1. A strictly increasing sequence
2. Followed by a strictly decreasing sequence
3. Followed by a strictly increasing sequence

Given an integer array `nums`, determine whether it satisfies the Trionic Array II property.

## Pattern
Array / Two Pointers

## Difficulty
Medium

## Approach
1. Start from the beginning and move forward while elements are strictly increasing.
2. After the first increasing part, move forward while elements are strictly decreasing.
3. After the decreasing part, move forward while elements are strictly increasing again.
4. Ensure that all three parts are non-empty.
5. Confirm that the entire array is traversed.
6. Return `true` if all conditions are satisfied, otherwise return `false`.

## Platform
LeetCode
