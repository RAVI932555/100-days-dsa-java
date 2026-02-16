# 📌 Problem: Assign Cookies

## Description
You are given two arrays:
- `g` representing children’s greed factors
- `s` representing cookie sizes

Each child can receive at most one cookie.  
A child is satisfied if the cookie size is greater than or equal to their greed factor.

Return the maximum number of satisfied children.

## Pattern
Greedy / Sorting

## Difficulty
Easy

## Approach
1. Sort both arrays `g` and `s`.
2. Use two pointers:
   - One for children
   - One for cookies
3. If the cookie size satisfies the current child:
   - Increment both pointers.
4. Otherwise:
   - Move to the next larger cookie.
5. Count satisfied children.

## Platform
LeetCode
