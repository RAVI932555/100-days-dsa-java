# Problem: Trapping Rain Water

## Description
Given `n` non-negative integers representing an elevation map where the width of each bar is `1`,  
compute how much water it can trap after raining.

## Pattern
Two Pointers / Arrays

## Difficulty
Hard

## Approach
1. Use two pointers: `left` and `right`.
2. Maintain `leftMax` and `rightMax` to track maximum heights seen so far.
3. Move the pointer with the smaller height.
4. Calculate trapped water based on the difference between max height and current height.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Platform
LeetCode
