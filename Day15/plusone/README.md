# Problem: Plus One

## Description
Given a non-empty array of digits representing a non-negative integer,  
increment the integer by one and return the resulting array of digits.

## Pattern
Math / Arrays

## Difficulty
Easy

## Approach
1. Traverse the array from the end.
2. If the digit is less than `9`, increment it and return the array.
3. If the digit is `9`, set it to `0` and continue.
4. If all digits are `9`, create a new array with leading `1`.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Platform
LeetCode
