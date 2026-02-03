# 📌 Problem: Trionic Array I

## Description
An array is called a **Trionic Array** if it can be divided into three consecutive non-empty parts:
1. A strictly increasing sequence
2. Followed by a strictly decreasing sequence
3. Followed by a strictly increasing sequence

Given an integer array `nums`, determine whether it satisfies the trionic array property.

## Pattern
Array / Two Pointers

## Difficulty
Medium

## Approach
1. Start from index `0` and move forward while elements are strictly increasing.
2. After the first increasing part, move forward while elements are strictly decreasing.
3. After the decreasing part, move forward while elements are strictly increasing again.
4. Ensure that:
   - All three parts are non-empty
   - The entire array is covered
5. Return `true` if all conditions are satisfied, otherwise return `false`.

## Platform
LeetCode
