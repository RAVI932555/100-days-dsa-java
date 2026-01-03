# Problem: Single Number II

## Description
Given an integer array `nums` where every element appears **three times**  
except for one element that appears **exactly once**,  
find and return the single element.

## Pattern
Bit Manipulation / Arrays

## Difficulty
Medium

## Approach
1. Use bit manipulation to count set bits at each position.
2. Since every number appears three times, take modulo `3` of bit counts.
3. Reconstruct the number using remaining bits.
4. The result represents the unique element.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Platform
LeetCode
